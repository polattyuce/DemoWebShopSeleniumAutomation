package Utlity;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseDriverLogin {
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

        Login();
    }


    public static void BekleKapat()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }

    public static void Login(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn=driver.findElement(By.xpath("//a[text()='Log in']"));
        logIn.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("rojow22711@xcmexico.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("pksnkgnfdgjısan832");

        WebElement logInButtom=driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        logInButtom.click();
    }


}
