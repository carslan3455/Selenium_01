package Mentor.BurakBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Form {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation");
        driver.manage().window().maximize();

        driver.findElement(By.id("email_create")).sendKeys("techn0oo@study.com");

        driver.findElement(By.id("SubmitCreate")).click();
        Thread.sleep(2000);

        driver.findElement(By.id("id_gender2")).click();
        driver.findElement(By.id("customer_firstname")).sendKeys("Cigdem");
        driver.findElement(By.id("customer_lastname")).sendKeys("Ars");
        driver.findElement(By.id("passwd")).sendKeys("ars.1234");

        Thread.sleep(3000);

        Select days = new Select(driver.findElement(By.id("days")));  // todo id
        days.selectByValue("17");                                   // bizim verdigimiz deger

        Select mounts = new Select(driver.findElement(By.id("months")));
        mounts.selectByValue("9");

        Select years = new Select(driver.findElement(By.id("years")));
        years.selectByValue("1982");

        driver.findElement(By.id("company")).sendKeys("Techno Study");

        driver.findElement(By.id("address1")).sendKeys("Landberg Street. 12");

        driver.findElement(By.id("address2")).sendKeys("NYC 4587");

        driver.findElement(By.id("city")).sendKeys("New York City");

        Select city = new Select(driver.findElement(By.id("id_state")));
        city.selectByValue("32");

        driver.findElement(By.id("postcode")).sendKeys("10006");

        driver.findElement(By.id("id_country")).sendKeys("Stay Home");

        driver.findElement(By.id("phone")).sendKeys("73638268324854793");

        driver.findElement(By.id("phone_mobile")).sendKeys("4979635763");

        driver.findElement(By.id("alias")).sendKeys("Merhaba Ben geldim....");

        driver.findElement(By.id("submitAccount")).click();





        Thread.sleep(2000);
        driver.quit();

    }
}
