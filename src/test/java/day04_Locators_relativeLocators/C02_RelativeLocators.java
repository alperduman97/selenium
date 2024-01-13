package day04_Locators_relativeLocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_RelativeLocators {

    public static void main(String[] args) {


        //3 ) Acilan urunun DSLR Camera oldugunu test edin.


        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //1 ) https://testotomasyonu.com/relativeLocators adresine gidin
        driver.get("https://testotomasyonu.com/relativeLocators");

        //2 ) DSLR Camera’yi etrafindaki elementleri kullanarak, 3 farkli relative locator ile locate edip tiklayin





    }
}
