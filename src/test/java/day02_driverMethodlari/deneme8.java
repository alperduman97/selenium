package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme8 {
    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        driver.manage().window().maximize();

        // https://www.automationexcercise.com adresine gidin
        driver.get("https://automationexercise.com/");

        //Sayfada 147 adet link olduğunu test edin
        List<WebElement> linkAdet = driver.findElements(By.tagName("a"));
        int expectedLinkAdet = 147;
        int actualLinkAdet = linkAdet.size();

        if (actualLinkAdet == expectedLinkAdet){
            System.out.println("Link test PASSED");
        }else{
            System.out.println("Link test FAILED");
        }

        //Products linkine tiklayin
         //  driver.findElement(By.partialLinkText("Products")).click();

        //Special Offer yazisinin göründüğünü test edin
       WebElement offerTest = driver.findElement(By.id("sale_image"));
if (offerTest.isDisplayed()){
    System.out.println("Speical Offer Test PASSED");
}else{
    System.out.println("Special Offer Test FAILED");
}


        driver.quit();




    }














}
