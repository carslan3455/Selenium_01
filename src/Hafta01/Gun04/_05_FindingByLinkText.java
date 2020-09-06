package Hafta01.Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.BaseStaticDriver;

public class _05_FindingByLinkText extends BaseStaticDriver {
    // todo utils deki BaseStaticDriver extend yaptik orada hazir yazili kod burda aktif oluyor

    public static void main(String[] args) throws InterruptedException {

        driver.get("http://www.practiceselenium.com/");

        WebElement e=driver.findElement(By.linkText("Check Out"));
        System.out.println(e.getAttribute("data-title"));

        Thread.sleep(3000);
        driver.quit();

    }
}
