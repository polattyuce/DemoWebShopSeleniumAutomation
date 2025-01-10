package DemoWebShop;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_203 extends BaseDriver {

    @Test
    public void Logout(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement logIn=driver.findElement(By.xpath("//a[text()='Log in']"));
        logIn.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("rojow22711@xcmexico.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("pksnkgnfdgjısan832");

        WebElement logInButtom=driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        logInButtom.click();

        WebElement logOut=driver.findElement(By.xpath("//a[text()='Log out']"));
        logOut.click();

        BekleKapat();
    }
}
