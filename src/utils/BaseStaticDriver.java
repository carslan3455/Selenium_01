package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class BaseStaticDriver {

    public static WebDriver driver;

    // todo direk bu class cagirildigi anda canli olmasi icin static blok icine alindi
    static {
        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
        // console daki aciklamalari sessize aldik...
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        // hangi browserı kullanacağımı ve tarayıcının path ini verdik

        driver = new ChromeDriver();  // çalıştıracağımız driverı kontrol edecek değişkeni tanımladık

    }
}
