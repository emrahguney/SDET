package _00_CSSSelectorOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru6 extends BaseDriver {/*Bu siteye gidiniz. https://testpages.herokuapp.com/styled/index.html

Fake Alerts'e tıklayınız.

Show modal dialog buttonuna tıklayınız.

Ok'a tıklayınız.

Alert kapanmalıdır.*/

    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement Falert=driver.findElement(By.cssSelector("[id='fakealerttest']"));
        MyFunc.Bekle(2);

        Falert.click();
        MyFunc.Bekle(2);
        WebElement modal= driver.findElement(By.cssSelector("[id='modaldialog']"));
        modal.click();
        MyFunc.Bekle(2);
        WebElement ok=driver.findElement(By.cssSelector("[id='dialog-ok']"));
        ok.click();

        BekleKapat();
    }
}
