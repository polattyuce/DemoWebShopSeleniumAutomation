package Utlity;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriver {
    public static WebDriver driver;
    public static WebDriverWait wait;
    public static JavascriptExecutor js;

    static
    {
        driver=new ChromeDriver();

        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        js=(JavascriptExecutor)driver;

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }


    public static void BekleKapat()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }

}
