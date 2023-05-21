package _01_xPathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru6 extends BaseDriver {
    /*Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html
Fake Alerts'e tıklayınız.
Show modal dialog buttonuna tıklayınız.
Ok'a tıklayınız.
Alert kapanmalıdır.*/
    @Test
    public void Test() {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(1);
        WebElement fakeAlertclick=driver.findElement(By.xpath("//*[@class='page-body']/ul/li[5]/ul/li[2]/a"));
        fakeAlertclick.click();
        MyFunc.Bekle(1);

        WebElement showmodal= driver.findElement(By.xpath("//*[@class='centered']/input[@class='styled-click-button' and @onclick='show_modal()']"));
        showmodal.click();
        MyFunc.Bekle(1);

        WebElement result= driver.findElement(By.xpath("//*[@class='dialog-button']"));
        result.click();

        BekleKapat();

    }
}
