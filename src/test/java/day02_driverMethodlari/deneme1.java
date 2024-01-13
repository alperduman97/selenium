package day02_driverMethodlari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme1 {
    public static void main(String[] args) {


    System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.navigate().to("https://www.testotomasyonu.com"); //driver.get() ile aynı.


        //youtube ana sayfaya gidin
        driver.navigate().to("https://www.youtube.com");

        //title'ın Youtube içerdiğini test edin
        String expectedTitle = "YouTube";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)){
            System.out.println("Title Test PASSED");
        }else{
            System.out.println("Title Test FAILED");
        }
        System.out.println("actual title:" + actualTitle);
//tekrar test otomasyonu anasayfaya dönün
            driver.navigate().back();

        //sayfa kaynagini "Test Otomasyonu" içerdiğini test edin
        String expectedSayfaKaynagi = "Test Otomasyonu";
        String actualSayfaKaynagi = driver.getPageSource();
        if (actualSayfaKaynagi.contains(expectedSayfaKaynagi)){
            System.out.println("Sayfa Kanyağı Test PASSED");
        }else{
            System.out.println("Sayfa Kaynağı Test FAILED");
        }

        //bir daha youtube'a gidin
            driver.navigate().forward();

        //url'nin https://www.youtube.com olduğunu test edin

        String expectedUrl= "https://www.youtube.com";
        String actualUrl = driver.getCurrentUrl();
        if (actualUrl.equals(expectedUrl)){
            System.out.println("URL test PASSED");
        }else{
            System.out.println("URL test FAILED");
        }




        driver.quit();








    }
}
