package Hafta01.Gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _02_Navigating extends BaseStaticDriver {
    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("http://www.practiceselenium.com/");

        Thread.sleep(3000);
        WebElement link = driver.findElement(By.linkText("Check Out"));
        link.click();

        Thread.sleep(3000);
        driver.navigate().back();  // todo  oldugu sayfadan onceki sayfaya geri gider

        Thread.sleep(3000);
        driver.navigate().forward(); // todo  oldugu sayfadan sonraki sayfaya ileri gider

        driver.manage().window().maximize();  // todo tarayiciyi tam ekran yapar...


        Thread.sleep(3000);
        driver.quit();
    }
}
