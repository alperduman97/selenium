package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme12 {
    public static void main(String[] args) throws InterruptedException {
        //bir class oluuştşrun ve gerekli ayarlamaları yapın
        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        // https://www.testotomasyonu.com/ adresine gidin
        driver.get(" https://www.testotomasyonu.com/");

        //browseri tam sayfa yapin
        driver.manage().window().maximize();

        // sayfayi refresh yapin
        driver.navigate().refresh();

        //sayfanin başlığinin "Test Otomasyonu" ifadesi içerdiğini test edin
        String expectedTitle = "Test Otomasyonu";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title test PASSED");
        }else {
            System.out.println("Title test FAILED");
        }


        //Furniture linkine tıklayın
          driver.findElement(By.xpath("(//*[@class='has-sub'])[5]")).click();

        //Price Range filtresinde min degere 40, max degere 200 yazip filtreleyin
        WebElement min = driver.findElement(By.xpath("(//input[@type='number'])[1]"));
        min.clear();
        min.sendKeys("40");
        WebElement max = driver.findElement(By.xpath("(//input[@type='number'])[2]"));
        max.clear();
        max.sendKeys("200");

       driver.findElement(By.className("price-range-button")).click();

        Thread.sleep(5000);

        //filtreleme sonucunda ürün bulunabildiğini test edin

        List<WebElement> urunsonuc = driver.findElements(By.xpath("//*[@*='product-box mb-2 pb-1']"));
            int urunSayisi = urunsonuc.size();

         if (urunSayisi > 0){
             System.out.println("Ürün bulma testi PASSED");
         }else{
             System.out.println("Ürün bulma testi FAILED");
         }

        //ilk ürüne tıklayın
        urunsonuc.get(0).click();


         //ürün fiyatının 40 ile 200 arasında olduğunu test edin
        WebElement urunFiyat = driver.findElement(By.xpath("//div[@class='price']"));
        String str = urunFiyat.getText();
        str=str.replaceAll("\\D","");
        int newStr = Integer.parseInt(str)/100;

        if (newStr > 40 && newStr < 200){
            System.out.println("Urun fiyat aralığı testi PASSED");
        }else {
            System.out.println("Urun fiyat aralığı testi FAILED");
        }

        //sayfayi kapatın

        driver.quit();

















    }
}
