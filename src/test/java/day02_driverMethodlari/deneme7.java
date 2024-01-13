package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.*;
import java.time.Duration;
import java.util.List;

public class deneme7 {
    public static void main(String[] args) {
        System.setProperty("Webdriver.chrome.driver", "src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        //https://zero.webappsecurity.com/ adresine gidin
        driver.get("http://zero.webappsecurity.com/");

        //online-bankling linkine tıklayın
        WebElement onlineBanking = driver.findElement(By.id("onlineBankingMenu"));
        onlineBanking.click();


        //resim altında 6 işlem başlığı olduğunu test edin
        List<WebElement> altiIslem = driver.findElements(By.className("headers"));
        int expectedIslem = 6;
        int actualIslem = altiIslem.size();
        if (actualIslem == expectedIslem) {
            System.out.println("Islem başlıgı testi PASSED");
        } else {
            System.out.println("Islem başlıgı testi FAIleD");
        }


        //işlem başlıklarında "Pay Bills" olduğunu test edin

        String expectedTitle = "Pay Bills";
        String actualTitle = altiIslem.get(3).getText();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title Testi PASSED");
        }else {
            System.out.println("Title Testi FAILED");




       driver.quit();
        }


        }














    }















