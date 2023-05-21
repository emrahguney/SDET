package _01_xPathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseDriver {
    /*
  1) Bu siteye gidin. -> http://demoqa.com/text-box
  2) Full Name kısmına "Automation" girin.
  3) Email kısmına "Testing@gmail.com" girin.
  4) Current Address kısmına "Testing Current Address" girin.
  5) Permanent Address kısmına "Testing Permanent Address" girin.
  6) Submit butonuna tıklayınız.
  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.
 8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/
    @Test
    public  void Test() {
        driver.get("http://demoqa.com/text-box");

        WebElement fullname= driver.findElement(By.xpath("//*[@class='mt-2 row']/div[@class='col-md-9 col-sm-12']/input[@class=' mr-sm-2 form-control']"));
        fullname.sendKeys("Automation");
        MyFunc.Bekle(1);
        WebElement email=driver.findElement(By.xpath("//*[@class='mt-2 row']/div[@class='col-md-9 col-sm-12']/input[@type='email']"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(1);
        WebElement Cadress= driver.findElement(By.xpath("//*[@class='mt-2 row']/div[@class='col-md-9 col-sm-12']/textarea[@class='form-control' and @placeholder='Current Address']"));
        Cadress.sendKeys("Testing Current Address");
        MyFunc.Bekle(1);
        WebElement Padress= driver.findElement(By.xpath("(//*[@class='mt-2 row']/div[@class='col-md-9 col-sm-12']/textarea[@class='form-control'])[2]"));
        Padress.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(1);
        WebElement submit= driver.findElement(By.xpath("//*[@class='mt-2 justify-content-end row']/div[@class='text-right col-md-2 col-sm-12']/button"));
        submit.click();
        MyFunc.Bekle(1);

        WebElement fullnameCheck= driver.findElement(By.xpath("//*[@id='name']"));
        WebElement emailCheck=driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']/p[@class='mb-1'][2]"));
        WebElement CadressCheck=driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']/p[@class='mb-1'][3]"));
        WebElement PadressCheck=driver.findElement(By.xpath("//*[@class='border col-md-12 col-sm-12']/p[@class='mb-1'][4]"));

        System.out.println(fullnameCheck.getText());
        System.out.println(fullnameCheck.getAttribute("value"));

        Assert.assertEquals(fullnameCheck.getText().substring(5), fullname.getAttribute("value"));
        Assert.assertTrue(emailCheck.getText().contains(email.getAttribute("value")));
        Assert.assertTrue(CadressCheck.getText().contains(Cadress.getAttribute("value")));
        Assert.assertTrue(PadressCheck.getText().contains(Padress.getAttribute("value")));
        //Assert.assertEquals(fullnameCheck.getText().startsWith("Auto"), fullname.getAttribute("value"));
BekleKapat();
    }
}
