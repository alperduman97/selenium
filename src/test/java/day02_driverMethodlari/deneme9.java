package day02_driverMethodlari;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class deneme9 {
    public static void main(String[] args) {


        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));

        // https://www.testotomasyonu.com/ sayfasında gidin
        driver.get("https://www.testotomasyonu.com/");

        //arama kutusuna "dress" yazip aratın
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));
        aramaKutusu.sendKeys("dress"+ Keys.ENTER);

        // görüntülenen sonuçların sayısını yazdırın
        WebElement sonuc = driver.findElement(By.className("product-count-text"));
        String sonuclar = sonuc.getText();
        System.out.println(sonuclar.replaceAll("\\D",""));
        driver.quit();




    }
}
