package DemoWebShop;

import Utlity.BaseDriverLogin;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class US_209 extends BaseDriverLogin {

    @Test
    public void SiparişGeçmişiniBilgisayaraİndirme() {

        WebElement account = driver.findElement(By.xpath("//a[text()='rojow22711@xcmexico.com']"));
        account.click();

        WebElement orders = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//div[@class='listbox']/ul/li)[3]/a")));
        orders.click();

        WebElement details = driver.findElement(By.xpath("(//div[@class='buttons'])[1]"));
        details.click();

        WebElement pdf = driver.findElement(By.xpath("(//div[@class='page-title']/a)[2]"));
        pdf.click();

        BekleKapat();
    }
}
