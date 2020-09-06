package Alistirmalar.Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Deneme_2 extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.aktardiyari.com/");
        WebElement e =driver.findElement(By.id("anasayfa-slider-container"));

        System.out.println(e.getAttribute("style"));

        Thread.sleep(3000);
        driver.quit();

    }
}
