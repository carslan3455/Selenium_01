package Alistirmalar.Gun04;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class OmerbyOdev {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://form.jotform.com/202426526543351");
        JavascriptExecutor js =(JavascriptExecutor) driver;    // todo sayfayi kaydirmak icin ScrollDown kodudur.


        WebElement isim = driver.findElement(By.xpath("//input[@id='first_3']"));
        isim.sendKeys("Techno");

        WebElement soyad = driver.findElement(By.xpath("//input[@id='last_3']"));
        soyad.sendKeys("Study");


        WebElement kod = driver.findElement(By.xpath("//input[@id='input_8_area']"));
        kod.sendKeys("+49");

        WebElement tlf = driver.findElement(By.xpath("//input[@id='input_8_phone']"));
        tlf.sendKeys("1234765348");

        WebElement eMail = driver.findElement(By.xpath("//input[@id='input_9']"));
        eMail.sendKeys("techno@study.com");

        List<WebElement>  zaman = driver.findElements(By.xpath("//span[@class='form-radio-item']"));

        for (WebElement  w: zaman) {

            w.click();
            Thread.sleep(1000);

        }

        Thread.sleep(1000);

        WebElement diger = driver.findElement(By.xpath("//textarea[@id='input_21']"));
        diger.sendKeys("5-9");

        js.executeScript("window.scrollBy(0,600)");

        List<WebElement> ilgiAlani = driver.findElements(By.xpath("//input[@name='q14_ilgiAlani[]']"));
        List<WebElement> ilgiAlaniList = driver.findElements(By.xpath("//label[starts-with(@id,'label_input_14_')]"));  // css label[id^='label_input_14_']

        for (int i = 0; i <ilgiAlani.size() ; i++) {

              ilgiAlani.get(i).click();
              System.out.println(ilgiAlaniList.get(i).getText());
              i++;
        }

        List<WebElement> yetenek = driver.findElements(By.xpath("//div[@aria-labelledby='label_15']/span"));

        int randomYetenek =  randomSayi(yetenek.size());

        yetenek.get(randomYetenek).click();
        System.out.println("Özel yetenegim : "+yetenek.get(randomYetenek).getText());
        Thread.sleep(1000);



        WebElement yorum = driver.findElement(By.xpath("//textarea[@id='input_16']"));
        yorum.sendKeys("Geri dönüşünüzü sabırsızlıkla bekliyorum. ");
        Thread.sleep(1000);

        WebElement sendForm = driver.findElement(By.xpath("//button[@id='input_2']"));
        sendForm.click();
        Thread.sleep(2000);

        String gelenMesaj = driver.findElement(By.xpath("//h1[text()='Thank You!']")).getText();
        String beklenenMesaj = "Thank You!";

        Assert.assertEquals("Form doldururken eksik alan biraktiniz",beklenenMesaj,gelenMesaj);

        System.out.println("Form başarıyla gönderilmiştir...");


        Thread.sleep(1000);
        driver.quit();

    }

    public static int randomSayi(int size){

        return (int)(Math.random()*size);
    }
}
