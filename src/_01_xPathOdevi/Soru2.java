package _01_xPathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseDriver {
    @Test
    public  void Test() {
/*1) Bu siteye gidin. -> https://demo.applitools.com/

2) Username kısmına "ttechno@gmail.com" girin.

3) Password kısmına "techno123." girin.

4) "Sign in" buttonunan tıklayınız.

5) "Your nearest branch closes in: 30m 5s" yazısının göründüğünü doğrulayınız.

 */

        driver.get("https://demo.applitools.com");
        WebElement username= driver.findElement(By.xpath("(//*[@class='form-group']/input[@class='form-control'])[1]"));
        username.sendKeys("ttechno@gmail.com");
        MyFunc.Bekle(1);
        WebElement password= driver.findElement(By.xpath("(//*[@class='form-group']/input[@class='form-control'])[2]"));
        password.sendKeys("techno123.");
        MyFunc.Bekle(1);
        WebElement sign= driver.findElement(By.xpath("//*[@class='buttons-w']/a"));
        sign.click();
        MyFunc.Bekle(1);
        WebElement time=driver.findElement(By.xpath("//*[@class='element-wrapper compact pt-4']/h6[1]"));
        MyFunc.Bekle(1);

        Assert.assertTrue(time.getText().equals("Your nearest branch closes in: 30m 5s"));
    BekleKapat();
    }
}
