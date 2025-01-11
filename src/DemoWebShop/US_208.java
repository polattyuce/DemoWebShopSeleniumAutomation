package DemoWebShop;

import Utlity.BaseDriverLogin;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class US_208 extends BaseDriverLogin {

    @Test
    public void NegativeKuponveHediyeKartıKullanımı() {
        Actions aksiyonlar = new Actions(driver); //aksiyonDriver

        WebElement element = driver.findElement(By.xpath("(//ul[@class='top-menu']//li)[2]"));
        Action aksiyon = aksiyonlar.moveToElement(element).build(); // üzerine gittin
        aksiyon.perform(); // üzerinde olduğunu etkinleştir.

        WebElement desktops = driver.findElement(By.xpath("((//ul[@class='top-menu']//li)[2]/ul/li/a)[1]"));
        desktops.click();

        WebElement addToCard = driver.findElement(By.xpath("(//div[@class='buttons'])[5]"));
        addToCard.click();

        WebElement addToCard2 = driver.findElement(By.id("add-to-cart-button-74"));
        addToCard2.click();

        WebElement shoppingCart = driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCart.click();

        WebElement DiscountCode = driver.findElement(By.xpath("(//div[@class='coupon-code']//input)[1]"));
        DiscountCode.sendKeys("anksjgnsa2");

        WebElement Applycoupon = driver.findElement(By.xpath("(//div[@class='coupon-code']//input)[2]"));
        Applycoupon.click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='coupon-box']//div[@class='message']"))));
        WebElement massage = driver.findElement(By.xpath("//div[@class='coupon-box']//div[@class='message']"));
        Assert.assertTrue("Hatalı kod değil", massage.getText().toLowerCase().contains("couldn't be"));

        WebElement GiftCards= driver.findElement(By.xpath("(//div[@class='coupon-code']//input)[3]"));
        GiftCards.sendKeys("sahgjaksgjksad");

        WebElement Addgiftcard= driver.findElement(By.xpath("(//div[@class='coupon-code']//input)[4]"));
        Addgiftcard.click();

        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='giftcard-box']//div[@class='message']"))));
        WebElement massage2 = driver.findElement(By.xpath("//div[@class='giftcard-box']//div[@class='message']"));
        Assert.assertTrue("Hatalı kod değil", massage2.getText().toLowerCase().contains("couldn't be"));

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
