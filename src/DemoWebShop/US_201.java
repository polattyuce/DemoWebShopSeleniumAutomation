package DemoWebShop;

import java.lang.annotation.Target;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_201 extends BaseDriver {

    @Test
    public void RegisterUserKullanıcıKaydı(){
        driver.get("https://demowebshop.tricentis.com/");

        WebElement register=driver.findElement(By.xpath("//a[text()='Register']"));
        register.click();

        WebElement male=driver.findElement(By.id("gender-male"));
        male.click();

        WebElement firstName=driver.findElement(By.id("FirstName"));
        firstName.sendKeys("Şerafettin");

        WebElement lastName=driver.findElement(By.id("LastName"));
        lastName.sendKeys("Çakır");

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("rojow22711@xcmexico.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("pksnkgnfdgjısan832");

        WebElement passwordConfirm=driver.findElement(By.id("ConfirmPassword"));
        passwordConfirm.sendKeys("pksnkgnfdgjısan832");

        WebElement registerButton=driver.findElement(By.id("register-button"));
        registerButton.click();

        BekleKapat();
    }
}
