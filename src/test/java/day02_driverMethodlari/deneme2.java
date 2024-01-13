package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme2 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // -->  sayfanin açılması, web elementleri bulmasi için bekler. Internet yavaşsa
        // vs ise 10.sn'ye kadar bekler. 10'saniye altında açılırsa 10saniye beklemez devam eder. Thread.sleep gibi ama Thread.sleep erken açılsa da verdiğimiz değere kadar bekliyor.
        driver.manage().window().maximize(); // açtığımız tarayıcının tam sayfa olmasını sağlıyoruz.



    }
}
