package Hafta01.Gun05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

import java.util.List;

public class _03_FindingElements_Tag extends BaseStaticDriver {

    public static void main(String[] args) throws InterruptedException {
        driver.navigate().to("http://www.practiceselenium.com/");

      //  WebElement  e= driver.findElement()

        // todo tagName yani etiketi "li" olan bütün elemanlari Liste at dedik ve forech ile yazdirdik

        List<WebElement> liste = driver.findElements(By.tagName("li"));

        for (WebElement e: liste ) {
            System.out.println(e.getText());
        }


        Thread.sleep(3000);
        driver.quit();


    }
}
