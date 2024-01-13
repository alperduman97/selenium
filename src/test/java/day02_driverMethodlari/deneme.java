package day02_driverMethodlari;

import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // www.testotomasyonu.com sayfasın açın ve title'ında otomasyon geçtiğini test edin

        driver.get("https://www.testotomasyonu.com");

        String expectedTitle = "otomasyon";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title test PASSED");
        }else{
            System.out.println("Title test FAILED");
        }
        System.out.println(actualTitle);

        // acilan sayfanin URL'inin otomasyon içerdiğini test edin
        String expectedUrl = "otomasyon";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)){
            System.out.println("URl test PASSED");
        }else{
            System.out.println("URL test FAILED");
        }
        System.out.println(actualUrl);


        System.out.println("========= SAYFA KAYNAĞI =========");
       // System.out.println(driver.getPageSource());


        System.out.println(driver.getWindowHandles()); // oluşturduğumuz webdriver'ın açılan her sayfaya verdiği unuqie kodlar. Bir window için.
        System.out.println(driver.getWindowHandle()); //  oluşturduğumuz webdriver'ın açılan her sayfaya verdiği unuqie kodlar. Birden fazla windows için.

        driver.quit();





    }
}
