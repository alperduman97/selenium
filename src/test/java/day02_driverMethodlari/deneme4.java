package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme4 {
    public static <Webelement> void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        //test otomasyonu sayfasına gidin
        driver.navigate().to("https://www.testotomasyonu.com");


        //phone için arama yapin

        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone" + Keys.ENTER);
        // aramaKutusu.submit(); --> bu da enter'A bastırıyor yukarıdaki de.

        //arama sonucunda bulunan elementlerin isimlerini yazdirin
        List<WebElement> aramaSonucu = driver.findElements(By.xpath("//a[@class='prod-title']"));
        // --> Locate etmek için By.className methodu kullandığımız da HTML element'deki class attribbute'nün değerinde spac varsa,(mb-3 den sonra space var)
        // By.classname() çalışmayabilir.

        //--> Liste Webelementlerden oluştuğu için direk listeyi yazdirmaz, eşementlerin referansını yazdırır

        for (WebElement each : aramaSonucu) {
            System.out.println(each.getText());

        }


        //arama sonucunda 4 urun bulunabildiğini test edin

        int expectedSonuc = 4;
        int actualSonuc = aramaSonucu.size();

        if (expectedSonuc == actualSonuc) {
            System.out.println("ürün sayı testi PASSED");
        } else {
            System.out.println("ürün sayı test FAILED");


            //ilk urun isminde case sensitive olmadan phone geçtiğini test edin




            //String actualUrunIceri = aramaSonucu.get(0).getText().toLowerCase();
            String expectedUrunIceri = "phone";

            //if (actualUrunIceri.contains(expectedUrunIceri)) {
                System.out.println("Phone geçtiği testi PASSED");
           // } else {
                System.out.println("Phone geçtiği testi FAILED");
            //}


            //sayfayi kapatın

            driver.quit();

        }

    }
}
