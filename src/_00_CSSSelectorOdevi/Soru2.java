package _00_CSSSelectorOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseDriver/*1) Bu siteye gidin. -> https://demo.applitools.com/

2) Username kısmına "ttechno@gmail.com" girin.

3) Password kısmına "techno123." girin.

4) "Sign in" buttonunan tıklayınız.

5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.
*/ {@Test
    public  void test() {
    driver.get("https://demo.applitools.com/");
    WebElement user= driver.findElement(By.cssSelector("[id='username']"));
    user.sendKeys("ttechno@gmail.com");
    MyFunc.Bekle(1);
    WebElement password= driver.findElement(By.cssSelector("[id='password']"));
    password.sendKeys("techno123.");
    MyFunc.Bekle(1);
    WebElement sign=driver.findElement(By.cssSelector("[id='log-in']"));
    sign.click();

    WebElement time=driver.findElement(By.cssSelector("[id='time']"));

    Assert.assertTrue(time.getText().equals("Your nearest branch closes in: 30m 5s"));



    MyFunc.Bekle(2);
    BekleKapat();
    }
}
