package Mentor.OmerBy.Locators_Css_Selector_Ders_1;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MystoreTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.tutorialsninja.com/demo/index.php?route=common/home");

        // css Basic hali
        WebElement searchArea = driver.findElement(By.cssSelector("input[name=search]"));
        searchArea.sendKeys("Iphone");

        //   Class aramak için "." (nokta) kullanıyoruz.       Tüm html kodlarinda class ismi arama
        WebElement searchButon = driver.findElement(By.cssSelector(".btn-default.btn-lg"));
        searchButon.click();

        // Tüm buttonların içerisindeki class ismini arama : >>>>    button.btn-default
        //child-parent (ogul-baba)    span.input-group-btn>button


        /* todo   ID
        button[id=list-view]
        button#list-view
         */
        // liste gorunumu                                           id ile bulduk
        WebElement listButton = driver.findElement(By.cssSelector("button#list-view"));
        listButton.click();
        /* todo class adi ile bulduk
            button.btn.btn-default.active>i
            .fa.fa-th-list
            button>i.fa.fa-th-list
         */

        /*
        todo contains * isareti ile bulunur
        button[onclick*=cart]
            */

        driver.findElement(By.cssSelector("button[onclick*=cart]")).click();
        Thread.sleep(1500);

        /*
        todo Starts with-- >    Başlangıçtaki karakter ile bulma  ^ ile buluruz.    ^=
        html kodu : wishlist.add('40');

        button[onclick^='w']
        */

        WebElement alert = driver.findElement(By.cssSelector("div.alert"));
        // Allert gormek icin yazdirdik
        // System.out.println(alert.getText());
        String textAlert = alert.getText();   // Assert icin text lazim

        // Benim istedigim sonuc
        String myAlert = "Success: You have added iPhone to your shopping cart!\n×";

       //todo 1.Yöntem  asserTrue ile
        // Assert.assertTrue("Ürün eklenirken sorun olustu",textAlert.contains(myAlert));

      // todo 2.Yöntem  assertEquals  ile
        Assert.assertEquals("HATA",myAlert,textAlert);


        System.out.println("Ürun Basari ile eklenmistir...");

          /*
                 todo  nth of type
     ilkii bulmak için:     class ismi button-group olan div in içerisindeki, 1. buttonu ver  -------     div.button-group>button:first-of-type
     sonuncuyu bulmak için: div.button-group>button:last-of-type
     ortadakini veya herhngi bir tanesini bulmak için : div.button-group>button:nth-of-type(2)


          todo  google arama kısmı için    ul.erkvQe>li:nth-of-type(2)

         */

        driver.findElement(By.cssSelector("span#cart-total")).click();
        Thread.sleep(1000);

        WebElement totalPrice = driver.findElement(By.cssSelector(".table-bordered>tbody>:last-of-type>last-of-type"));

        System.out.println(totalPrice.getText());

        Assert.assertEquals("$123.20",totalPrice.getText());

        System.out.println("Fiyat karta islenmistir");

    }
}
