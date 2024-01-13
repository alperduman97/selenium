package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme11 {

    public static void main(String[] args) {



        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));


        //https://testotomasyonu.com/addremove/ adresine gidin
        driver.get("https://testotomasyonu.com/addremove");

        //Add Element butonuna basin  --> basma olunca direkt driver ile başlayabiliriz

        // driver.findElement(By.id("sub-btn")).click();
        driver.findElement(By.xpath("//*[@id='sub-btn']")).click();

        //Remove butonu'nun görünür olduğunu test edin

        WebElement removeButton = driver.findElement(By.xpath("//*[text()='Remove']"));
        if (removeButton.isDisplayed()){
            System.out.println("RemoveButton Test PASSED");
        }else{
            System.out.println("RemoveButton test FAILED");
        }

        //Delete tuşuna basin

        removeButton.click();

        // "Add/Remove Elements" yazisinin görünür olduğunu test edin

        WebElement addRemoveElements = driver.findElement(By.xpath("//*[text()='Add/Remove Elements']"));  //<----- TEXT'i xpath ile yazma.
        if (addRemoveElements.isDisplayed()){
            System.out.println("addRemove Element test PASSED");

        }else{
            System.out.println("addRemove Element test FAILED");
        }


        driver.quit();
    }
}


