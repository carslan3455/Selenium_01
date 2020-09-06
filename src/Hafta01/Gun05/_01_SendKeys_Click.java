package Hafta01.Gun05;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;


public class _01_SendKeys_Click extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.practiceselenium.com/");

        Thread.sleep(3000);
        WebElement link = driver.findElement(By.linkText("Check Out"));
        // todo bulunan link tiklatma
        link.click();

        WebElement email = driver.findElement(By.id("email"));
        // todo text gonderme
        email.sendKeys("info@techno.study");

        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Techno Study");

        WebElement adres = driver.findElement(By.id("address"));
        adres.sendKeys("Merhaba Selenium biz geldik : Yeni testerlar...");


        WebElement buton= driver.findElement(By.className("btn-primary"));
        buton.click();

        WebElement menu= driver.findElement(By.id("wsb-element-00000000-0000-0000-0000-000450914921"));
        String menuTxt = menu.getText();
        Assert.assertEquals("Menu",menuTxt);

        // todo bulundugu sayfanin link veriyor getCurrentUrl
        String url =driver.getCurrentUrl();
        Assert.assertEquals("http://www.practiceselenium.com/menu.html?",url);



        Thread.sleep(3000);
        driver.quit();
    }
}
