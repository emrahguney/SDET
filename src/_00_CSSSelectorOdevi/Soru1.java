package _00_CSSSelectorOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseDriver
    /*

  1) Bu siteye gidin. -> http://demoqa.com/text-box

  2) Full Name kısmına "Automation" girin.

  3) Email kısmına "Testing@gmail.com" girin.

  4) Current Address kısmına "Testing Current Address" girin.

  5) Permanent Address kısmına "Testing Permanent Address" girin.

  6) Submit butonuna tıklayınız.

  7) Full Name'in, "Automation"ı içinde bulundurduğunu doğrulayın.

  8) Email'in, "Testing"ı içinde bulundurduğunu doğrulayın.

*/ {
    @Test
    public  void Test() {
        driver.get("http://demoqa.com/text-box");

        WebElement name= driver.findElement(By.cssSelector("input[id='userName']"));

        name.sendKeys("Automation");

        MyFunc.Bekle(1);

        WebElement email=driver.findElement(By.cssSelector("input[id='userEmail']"));
        email.sendKeys("Testing@gmail.com");
        MyFunc.Bekle(1);

        WebElement adress=driver.findElement(By.cssSelector("textarea[id='currentAddress']"));
        adress.sendKeys("Testing Current Address");
        MyFunc.Bekle(1);

        WebElement permanent=driver.findElement(By.cssSelector("textarea[id='permanentAddress']"));
        permanent.sendKeys("Testing Permanent Address");
        MyFunc.Bekle(1);

        WebElement submit=driver.findElement(By.cssSelector("button[id='submit']"));
        submit.click();

        WebElement ad=driver.findElement(By.cssSelector("p[id='name']"));
        WebElement adres=driver.findElement(By.cssSelector("p[id='email']"));
        WebElement Cadres=driver.findElement(By.cssSelector("p[id='currentAddress']"));
        WebElement Padres=driver.findElement(By.cssSelector("p[id='permanentAddress']"));


        //1.cozum yolu
        Assert.assertTrue(name.getAttribute("value").equals("Automation"));
        Assert.assertTrue(email.getAttribute("value").equals("Testing@gmail.com"));
        Assert.assertTrue(adress.getAttribute("value").equals("Testing Current Address"));
        Assert.assertTrue(permanent.getAttribute("value").equals("Testing Permanent Address"));

        //2. cozum yolu
        Assert.assertTrue(ad.getText().equals("Name:Automation"));
        Assert.assertTrue(adres.getText().equals("Email:Testing@gmail.com"));
        Assert.assertTrue(Cadres.getText().equals("Current Address :Testing Current Address"));
        Assert.assertTrue(Padres.getText().equals("Permananet Address :Testing Permanent Address"));

        MyFunc.Bekle(3);
        BekleKapat();
    }
}
