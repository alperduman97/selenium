package day02_driverMethodlari;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class deneme3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("Webdriver.chrome.driver","src/kurulumdosyalari/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.testotomasyonu.com");
        WebElement aramaKutusu = driver.findElement(By.id("global-search"));

       //arama kutusuna phone yazdir ve arama yapın

        aramaKutusu.sendKeys("phone");
        aramaKutusu.submit();

        //arama sonucunda ürün bulunabildiğini test edin ve yazdırın
          WebElement sonucTest = driver.findElement(By.className("product-count-text"));
        System.out.println(sonucTest); // 4 Element Found

        //---- sayıyı alıp integer'a çevirip kullanlanım

        String sonucTestStr = sonucTest.getText();
        sonucTestStr=sonucTestStr.replaceAll("\\D","");
        int sonucTestInt = Integer.parseInt(sonucTestStr);

        if (sonucTestInt > 0){
            System.out.println("Sonuc Test PASSED");
        }else{
            System.out.println("Sonuc Test FAILED");
        }

        driver.quit();

    }
}
