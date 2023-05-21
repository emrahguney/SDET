package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _04_IntroAlert extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickMe= driver.findElement(By.xpath("//button[@onclick='myAlertFunction()']"));
        MyFunc.Bekle(1);
        clickMe.click();

        MyFunc.Bekle(1);
        //alert aciliyor
        driver.switchTo().alert().accept();//alert kutusunu OK kismina bas, boylece kapandi
        BekleKapat();

    }
}
/*Interview sorusu
-Alertlari

*/