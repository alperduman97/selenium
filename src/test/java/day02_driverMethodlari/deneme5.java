package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;


public class deneme5 {


    public static void main(String[] args) {

        //1-Bir test class'i oluşturun, ilgili ayarları yapın
        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //2- https://www.testotomasyonu.com/ adresine gidin
        driver.get("https://www.testotomasyonu.com/");

        //3- arama kutusuna phone yazip aratin
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("phone"+Keys.ENTER);

        //4- category bölümünde 8 element olduğunu test edin
        List<WebElement> category = driver.findElements(By.className("panel-list"));
        int expectedResult = 8;
        int actualResult = category.size();
        if (expectedResult == actualResult){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }


        //5- category isimlerini yazdirin
        for (WebElement each:category
             ) {
            System.out.println(each.getText());
        }


        //6- sayfayi kapatin
            driver.quit();


    }

}
