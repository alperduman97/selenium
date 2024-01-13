package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme6 {


    public static void main(String[] args) {

        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //https://www.automationexercise.com/ adresine gidin

        driver.get("https://www.automationexercise.com/ ");

        //category bölümündeki elementleri locate edin
        List<WebElement> category = driver.findElements(By.className("panel-heading"));

        //category isimlerini yazdırın

        for (WebElement each:category
             ) {
            System.out.println(each.getText());
        }









    driver.quit();
    }



}
