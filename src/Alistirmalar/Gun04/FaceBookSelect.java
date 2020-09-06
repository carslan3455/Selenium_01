package Alistirmalar.Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookSelect {
     /*
   todo Senaryo
   1- https://www.facebook.com/ sitesine giriniz.
   2- Yeni hesap oluştura tıklayınız.   css   a[id^='u_'][id$='_2']
   3- Formdaki tüm bilgileri giriniz.
   isim = css    input[id^='u_'][id$='_b']
   soyisim = css  input[id^='u_'][id$='_d']
   e-mail  = css  input[id^='u_'][id$='_g']
   beklet
   onay mail = css  input[id^='u_'][id$='_j']
   password =  css   input[id='password_step_input']            By.css
             xpath   //input[@id='password_step_input']         By.xpath
                id   password_step_input                        By.id

        xpath digerlerinden ayiran ozellikler
        1- Basinda // isareti olur                        //input
        2- aranacak verinin basinda @ isareti olur    //input[@id='****']
        3- text aramasi yapilacaksa sadece xpath ile yapiliyor
        yazim sekli  ==>   //input[text()='****']

    select  gun  - ay -  yil

    gun =   xpath    //select[@id='day']     + value gonder (sayi)
    ay =    xpath   //select[@id='month']   + value  gonder (sayi)
    yil=   xpath    //select[@id='year']    + value  gonder (sayi)

    gender = xpath   //label[text()='Weiblich']   clik


    id
    name
    cssSelector
    xpath  (text)


    */

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
     // driver.navigate().to("https://www.facebook.com/");  sayfalarda  ileri geri icin

        WebElement yeniKayitButonu = driver.findElement(By.cssSelector("a[id^='u_'][id$='_2']"));
        yeniKayitButonu.click();
        Thread.sleep(1500);

        WebElement isim = driver.findElement(By.cssSelector("input[id^='u_'][id$='_b']"));
        isim.sendKeys("Techno");

        WebElement soyad = driver.findElement(By.cssSelector("input[id^='u_'][id$='_d']"));
        soyad.sendKeys("Study");

        WebElement eMail = driver.findElement(By.cssSelector("input[id^='u_'][id$='_g']"));
        eMail.sendKeys("techno@study.com");

        Thread.sleep(1000);
        WebElement onayEmail = driver.findElement(By.cssSelector("input[id^='u_'][id$='_j']"));
        onayEmail.sendKeys("techno@study.com");

        WebElement password = driver.findElement(By.xpath("//input[@id='password_step_input']"));
        password.sendKeys("techno.12345");

        WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
        Select gun = new Select(day);
        gun.selectByValue("10");

        WebElement mount = driver.findElement(By.xpath("//select[@id='month']"));
        Select ay = new Select(mount);
        ay.selectByValue("5");

        WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
        Select yil = new Select(year);
        yil.selectByValue("2000");


        WebElement gender = driver.findElement(By.xpath("//label[text()='Weiblich']"));
        gender.click();




    }

}
