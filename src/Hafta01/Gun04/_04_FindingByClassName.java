package Hafta01.Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class _04_FindingByClassName {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        // console daki aciklamalari sessize aldik...
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        WebElement e=driver.findElement(By.className("editor_collections"));

        System.out.println(e.getText());

        Thread.sleep(3000);
        driver.quit();

    }
}
