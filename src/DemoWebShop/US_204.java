package DemoWebShop;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_204 extends BaseDriver {

    @Test
    public void Login() {
        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn = driver.findElement(By.xpath("//a[text()='Log in']"));
        logIn.click();

        WebElement email = driver.findElement(By.id("Email"));
        email.sendKeys("rojow22711@xcmexico.com");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("pksnkgnfdgjısan832");

        WebElement logInButtom = driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        logInButtom.click();

        WebElement girisYapildiMassage=driver.findElement(By.xpath("//a[text()='rojow22711@xcmexico.com']"));
        Assert.assertTrue("Giriş yapılmadı",girisYapildiMassage.getText().contains("rojow22711"));

        BekleKapat();
    }
}
