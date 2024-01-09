package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c01_DrivergetMethodlari {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("WebDriver.chrome.driver", "src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.testotomasyonu.com");


        //acilan sayfanin Title'imda otomasyon geçtiğigi test edin

        String expectedTitleIcerik = "otomasyon";
        String actualTitle = driver.getTitle();


        if (actualTitle.contains(expectedTitleIcerik)) {
            System.out.println("title testi PASSED");
        } else {
            System.out.println("title testi FAILED");  // title testi FAILED
            System.out.println("title" + actualTitle); // itleTest Otomasyonu - Test Otomasyonu , otomasyon küçük istneiyor, burada büyük yazıyor. Bu bir bugtır.  Hata veerir.Raporlarız.

            /*
                         driver.getWindowHandle() : driver'ın gittiği sayfanın WindownHandle değerini verir.
                         driver.getWindowHandles(): driver oluşturulduktan sonra, test boyunca açtığı tüm sayfaların WindowHandle değerlerini bir Set olarak verir
             */


            System.out.println(driver.getWindowHandle()); // 7F395E8129B2CCD7F0183C3AB7847EE1
            System.out.println(driver.getWindowHandles()); // [7F395E8129B2CCD7F0183C3AB7847EE1] - set olduğundan köşeli.

            //acilan sayfanin url'inin otomasyon içerdiğini test edin

            String expectedUrlIcerik = "otomasyon";
            String actualUrl = driver.getCurrentUrl();

            if (actualUrl.contains(expectedUrlIcerik)) {
                System.out.println("Url Testi PASSED");
            } else {
                System.out.println("Url testi FAILED"); // Url Testi PASSED
            }

            System.out.println("===========sayfa kaynagi=============");
            // System.out.println(driver.getPageSource()); // sayfada source'da ne varsa onu bize getirir. Sayfa kaynagından bir test istenirse kullanılabilinir.
            Thread.sleep(1000); //1000 ms eşit 1sn, javadan gelir, kodlari yazilan milisaniye kadar bekletir.
            driver.close();




        }
    }
}
