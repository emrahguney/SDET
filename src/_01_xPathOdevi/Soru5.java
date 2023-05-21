package _01_xPathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseDriver {
    @Test
    public  void Test() {
        /*Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Fake Alerts' tıklayınız.

Show Alert Box'a tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.*/

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(1);
        WebElement fakeAlertclick=driver.findElement(By.xpath("//*[@class='page-body']/ul/li[5]/ul/li[2]/a"));
        fakeAlertclick.click();
        MyFunc.Bekle(1);

        WebElement showAlert= driver.findElement(By.xpath("//*[@class='centered']/input[@onclick='show_alert()']"));
        showAlert.click();
        MyFunc.Bekle(1);

        WebElement result= driver.findElement(By.xpath("//*[@class='dialog-button']"));
        result.click();

        BekleKapat();
    }
}
