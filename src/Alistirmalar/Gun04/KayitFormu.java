package Alistirmalar.Gun04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class KayitFormu {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:/Users/arslan/Selenium/Driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation/");

        driver.findElement(By.id("email_create")).sendKeys("gulsahgoruken35@gmail.com");        //*
        driver.findElement(By.id("SubmitCreate")).click();

        Thread.sleep(3000);
        driver.findElement(By.id("uniform-id_gender2")).click();                // *
        driver.findElement(By.id("customer_firstname")).sendKeys("Gulsah");
        driver.findElement(By.id("customer_lastname")).sendKeys("Goruken");
        driver.findElement(By.id("passwd")).sendKeys("Grkn.123");       // psswrd kisa

        Select days=new Select(driver.findElement(By.id("days")));
        days.selectByValue("20");

        Select months=new Select(driver.findElement(By.id("months")));
        months.selectByValue("2");

        Select years=new Select(driver.findElement(By.id("years")));
        years.selectByValue("1984");
        driver.findElement(By.id("company")).sendKeys("Technostudy");
        driver.findElement(By.id("address1")).sendKeys("Landberg Street.12");
        driver.findElement(By.id("address2")).sendKeys("NYC 2345");
        driver.findElement(By.id("city")).sendKeys("NewYork City");

        Select city=new Select(driver.findElement(By.id("id_state")));
        city.selectByValue("32");
        driver.findElement(By.id("postcode")).sendKeys("10006");
        driver.findElement(By.id("other")).sendKeys("StayHome");
        driver.findElement(By.id("phone")).sendKeys("124243243243234");
        driver.findElement(By.id("phone_mobile")).sendKeys("434465465465454");
        driver.findElement(By.id("submitAccount")).click();




        Thread.sleep(3000);
        driver.quit();


    }
}
