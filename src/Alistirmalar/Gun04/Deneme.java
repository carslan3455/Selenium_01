package Alistirmalar.Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class Deneme extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {

        driver.get("https://www.aktardiyari.com/");
        WebElement e = driver.findElement(By.linkText("Aktar Diyarı'nı Neden Kurduk?"));

        System.out.println(e.getAttribute("href"));

        Thread.sleep(3000);
        driver.quit();
    }
}
