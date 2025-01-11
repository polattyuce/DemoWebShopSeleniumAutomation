package DemoWebShop;

import Utlity.BaseDriver;
import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class US_206 extends BaseDriverLogin {

    @Test
    public void Ordering() {

        WebElement laptop = driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]"));
        laptop.click();

        WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCart.click();

        WebElement country = driver.findElement(By.id("CountryId"));
        Select ulke = new Select(country);
        ulke.selectByValue("2");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("StateProvinceId")));
        WebElement state = driver.findElement(By.id("StateProvinceId"));
        Select sehir = new Select(state);
        sehir.selectByValue("64");

        WebElement ZipPostalCode = driver.findElement(By.id("ZipPostalCode"));
        ZipPostalCode.sendKeys("16010");

        WebElement checkBox = driver.findElement(By.id("termsofservice"));
        checkBox.click();

        WebElement checkout = driver.findElement(By.id("checkout"));
        checkout.click();

        WebElement contunie2 = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
        contunie2.click();

        WebElement contunie3 = driver.findElement(By.xpath("(//input[@type='button'])[3]"));
        contunie3.click();

        WebElement contunie4 = driver.findElement(By.xpath("(//input[@type='button'])[4]"));
        contunie4.click();

        WebElement cashOnDelivery = driver.findElement(By.id("paymentmethod_0"));
        cashOnDelivery.click();

        WebElement contunie5 = driver.findElement(By.xpath("(//input[@type='button'])[5]"));
        contunie5.click();

        WebElement contunie6 = driver.findElement(By.xpath("(//input[@type='button'])[6]"));
        contunie6.click();

        WebElement confirm = driver.findElement(By.xpath("(//input[@type='button'])[7]"));
        confirm.click();

        WebElement successfullyMassage = driver.findElement(By.xpath("//div[@class='title']/strong"));
        Assert.assertTrue("Sipariş başarılı şekide verilemedi", successfullyMassage.getText().toLowerCase().contains("successfully"));

        BekleKapat();
    }
}
