package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_AlertPart3 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe= driver.findElement(By.xpath("//button[@onclick='myPromptFunction()']"));
        MyFunc.Bekle(1);
        clickMe.click();

        MyFunc.Bekle(1);

        //alert aciliyor
        driver.switchTo().alert().sendKeys("emrahguney");
        driver.switchTo().alert().accept();
        MyFunc.Bekle(1);
        WebElement txtActual= driver.findElement(By.id("prompt-demo"));

        Assert.assertTrue("BEklenen yazi gozuktumu",txtActual.getText().contains("emrah"));
        BekleKapat();

    }
}
