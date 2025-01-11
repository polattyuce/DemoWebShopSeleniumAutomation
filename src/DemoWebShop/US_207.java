package DemoWebShop;

import Utlity.BaseDriverLogin;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_207 extends BaseDriverLogin {

    @Test
    public void surveyResponse() {

//        WebElement excellent = driver.findElement(By.id("Excellent"));
//        excellent.click();
//
//        WebElement oylama = driver.findElement(By.id("vote-poll-1"));
//        oylama.click();

        List<WebElement> socuçlar = driver.findElements(By.xpath("//div[@id='poll-block-1']//ul//li"));
        for (WebElement sonuc : socuçlar) {
            System.out.println("Sonuçlar = " + sonuc.getText()); // Elemanın metin değerini yazdır
        }


        BekleKapat();
    }

}
