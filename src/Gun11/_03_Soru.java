package Gun11;

import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class _03_Soru extends BaseDriver {

    @Test
    public void Test1() {
/*
Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
        XPATHSIZ YAPILACAK
 */
        driver.navigate().to("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");

        WebElement name= driver.findElement(By.cssSelector("input[id='title']"));
        name.sendKeys("emrah");
        WebElement comment= driver.findElement(By.cssSelector("textarea[id='description']"));
        comment.sendKeys("good");

        WebElement submit= driver.findElement(By.cssSelector("input[id='btn-submit']"));
        submit.click();

    // imlicitlyWait elemanın locator bulması süresiyle ilgili buradaki zaten elemanlar hemen bulunuyor
        // burada kriter bulunan elemanın görünen yazısının oluşma süresi
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); // findElement


       // bekle.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='submit-control']")));
        Duration muhlet=Duration.ofSeconds(30);
        WebDriverWait bekle=new WebDriverWait(driver, muhlet);

        bekle.until(ExpectedConditions.textToBe(By.id("submit-control"),"Form submited Successfully!"));
        WebElement succes= driver.findElement(By.cssSelector("div[id='submit-control']"));


        Assert.assertEquals(succes.getText(),"Form submited Successfully!");

        BekleKapat();
    }
}