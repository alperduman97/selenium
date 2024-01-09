package day01_driverOlusturma;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C01_IlkOtomasyon {
    public static void main(String[] args) {
        /*
        1- Web otomasyonu yapmak için oluşturduğumuz her class'da bir WebDriver objesi oluşturmak ZORUNDAYIZ!
       Bu objeyi Java consept'lerini kullnarak farklı şekilde oluşturabilir veya inherit edebiliriz ama WebDriver objesi
       OLMADAN test otomasyonu OLMAZ!

       2-Selenium son versiyonlarında kendi WebDriver'inin oluşturdu. Böylece System.setproperty() kullanmasaniz da
       Selenium kendi WebDriver'ı ile otomasyonu gerçekleştirir.

       Şirketlerde kendi satın aldıkları WebDriver'ı kullanma olasılığı olacağından biz de bu satırı yazacağız






         */


        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        //driver.get("https://www.testotomasyonu.com");




    }

    public static class C02_IlkTest {
        public static void main(String[] args) {

            System.setProperty("WebDriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
            WebDriver driver = new ChromeDriver();

        }
    }
}
