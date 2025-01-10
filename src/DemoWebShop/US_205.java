package DemoWebShop;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_205 extends BaseDriver {

    @Test
    public void NegativeLogin(){

        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn = driver.findElement(By.xpath("//a[text()='Log in']"));
        logIn.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("fsdfsafsadf@xcmexico.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("dagdfgssdfgfa");

        WebElement logInButtom = driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        logInButtom.click();

        WebElement girisYapildiMassage=driver.findElement(By.cssSelector("[class='validation-summary-errors'] span"));
        Assert.assertTrue("Giriş yapıldı",girisYapildiMassage.getText().contains("unsuccessful"));

        BekleKapat();

    }
}
