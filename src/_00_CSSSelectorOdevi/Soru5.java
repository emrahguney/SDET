package _00_CSSSelectorOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru5 extends BaseDriver {/*5-

Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Fake Alerts' tıklayınız.

Show Alert Box'a tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.*/

    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alert=driver.findElement(By.cssSelector("[id='fakealerttest']"));
        MyFunc.Bekle(2);
        alert.click();
        MyFunc.Bekle(2);
        WebElement alertbox= driver.findElement(By.cssSelector("[id='fakealert']"));
        alertbox.click();
        MyFunc.Bekle(2);
        WebElement button= driver.findElement(By.cssSelector("[id=dialog-ok]"));
        button.click();
        MyFunc.Bekle(2);
        BekleKapat();
    }
}
