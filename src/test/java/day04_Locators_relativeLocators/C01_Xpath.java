package day04_Locators_relativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class C01_Xpath {
    public static void main(String[] args) {
        /*
        1- bir class olusturun








12-Sayfayi kapatin
         */


        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       //  2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");
      //  3- Browseri tam sayfa yapin
        driver.manage().window().maximize();
// 4- Sayfayi “refresh” yapin
        driver.navigate().refresh();

        // 5- Sayfa basliginin “Test Otomasyonu” ifadesi icerdigini test edin
        String expectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title PASSED");
        }else{
            System.out.println("Title FAILED");
        }

        //6- Furniture linkine tiklayin
            driver.findElement(By.xpath("(//li[@class=‘has-sub’])[5]"));

        //7- price range filtresinde min degere 40, max degere 200 yazip filtreleyin

        WebElement minDegerKutusu = driver.findElement(By.xpath("////input[@name='min']"));
        minDegerKutusu.clear();
        minDegerKutusu.sendKeys("40");
        WebElement maxDegerKutusu = driver.findElement(By.xpath("////input[@name='max']"));
        maxDegerKutusu.clear();
        maxDegerKutusu.sendKeys("200");
        driver.findElement(By.xpath("//button[@name='button']")).click();

        // 8- filtreleme sonucunda urun bulunabildigini test edin
        List<WebElement> bulunanElementlerListesi = driver.findElements(By.xpath("//*[@*='product-box mb-2 pb-1']"));

        int actualBulunanUrunSayisi = bulunanElementlerListesi.size();
        if (actualBulunanUrunSayisi > 0){
            System.out.println("Bulunan ürün testi PASSED");
        }else{
            System.out.println("Bulunan ürün testi FAILED");
        }
        // 10-Ilk urunu tiklayin
        bulunanElementlerListesi.get(0).click();

        //11- Urun fiyatinin 40 ile 200 arasinda oldugunu test edin
        WebElement urunFiyatElementi = driver.findElement(By.xpath("//span[@id='priceproduct']"));
        System.out.println(urunFiyatElementi.getText()); //$50.00

        String urunFiyatiStr= urunFiyatElementi.getText().replaceAll("\\D","");
        System.out.println(urunFiyatiStr); //5000
        int urunFiyatiInt= Integer.parseInt(urunFiyatiStr)/100;

        //12-Sayfayi kapatın

        driver.quit();





    }
}
