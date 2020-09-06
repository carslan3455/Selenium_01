package Mentor.OmerBy.Locators_Css_Selector_Ders_1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class Odev_Css_Selector {
    /*
Ödev:
            https://demoqa.com/automation-practice-form   bu siteye gidin.
todo        SADECE aşağıda bahsedilen kısımları doldurunuz !
1.  Name        input#firstName.mr-sm-2
2.    LastName      #lastName.mr-sm-2
3.      Email       input#userEmail
4.      Gender:     label[for=gender-radio-2].custom-control-label
5.      Hobbies     label[for=hobbies-checkbox-1]     label[for=hobbies-checkbox-2]   label[for=hobbies-checkbox-2]
5 den sonra unutulmus    Mobile         "input[placeholder=\"Mobile Number\"]"
6.      Current adress      textarea.form-control
7.      submit butona tıkla     button.btn-primary
8.      Ekrandaki mesajı dogrula         .modal-title        mesaj= Thanks for submitting the form
9.      2 Saniye bekledikten sonra close butonuna bas       #closeLargeModal
10.   2 saniye bekleyip sistemi kapat.

            name,id, classname ve kendinizi geliştirmek için daha çok CSS SELECTOR ile aramalar yapın.


            Buraları kendinize göre doldurun.
            Submit butonuna bastırın.

             yeni bir bilgi çerçevesi açılacaktır.
             Bilgi çerçevesinin başlığının ekranda gözüküp gözükmediğini check edin. (Eğer gözüktüyse formda zorunlu olan kısımları doldurmuşsunuz demektir,yani sorun yok demektir.)

             Bilgi mesajı : Thanks for submitting the form
            Onu görünce de close butonuna bastırın ve bekleyip sistemi tamamen kapatın.

            Test başarıyla tamamlandıysa konsolda "Formu doldurdugunuz için teşekkür ederiz..." mesajı yazsın.



        todo   NOT: CSS SELECTOR ile arama yaparken input, button, label gibi tag leri de iyi inceleyin.
            Bu test ısınma içindir. CSS selector pazartesi günü daha detaylı görülecektir.

 */
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        // console daki aciklamalari sessize aldik...
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        Thread.sleep(1500);
        driver.findElement(By.cssSelector("input#firstName.mr-sm-2")).sendKeys("Cigdem");
        driver.findElement(By.cssSelector("#lastName.mr-sm-2")).sendKeys("A");
        driver.findElement(By.cssSelector("input#userEmail")).sendKeys("techno@study.com");
        driver.findElement(By.cssSelector("label[for=gender-radio-2].custom-control-label")).click();
        driver.findElement(By.cssSelector("label[for=hobbies-checkbox-1]")).click();
        driver.findElement(By.cssSelector("label[for=hobbies-checkbox-2]")).click();
        driver.findElement(By.cssSelector("input[placeholder=\"Mobile Number\"]")).sendKeys("742964829353");
        driver.findElement(By.cssSelector("textarea.form-control")).sendKeys("Germany");


        driver.findElement(By.cssSelector("button.btn-primary")).click();
        Thread.sleep(1000);

        WebElement mesaj = driver.findElement(By.cssSelector(".modal-title"));

        String beklenenMesaj = "Thanks for submitting the form";

        Assert.assertEquals("***** Hatali islem *****",beklenenMesaj,mesaj.getText());

        System.out.println("Formu doldurdugunuz için teşekkür ederiz...");

        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#closeLargeModal")).click();

        Thread.sleep(2000);
        driver.quit();





    }
}
