package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class _00_Soru extends BaseDriver {
    //        Test Senaryosu
//        1- https://www.facebook.com/  sayfasına gidiniz
//        2- CreateNewAccount a tıklatınız.
//        3- Açılan yeni pencerede isim, soyisim ve emaili giriniz.
//        4- Doğum tarihinizi Select sınıfı ile seçiniz
//        5- Email i tekrar girmenizi isteyen bir input daha açıldığını
//          öncesinde de görünmediğini, sonrasında da göründüğünü
//          assert ile doğrulayınız.

    @Test
    public void Test(){

        driver.navigate().to("https://www.facebook.com/");
        MyFunc.Bekle(2);
        //cookies cikarsa
        List<WebElement> cookiesAccept=driver.findElements(By.xpath("//button[text()='Allow essential and optional cookies']"));
        if (cookiesAccept.size() > 0)
            cookiesAccept.get(0).click();

        WebElement create= driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
        create.click();

        MyFunc.Bekle(1);
        WebElement name= driver.findElement(By.xpath("//input[@name='firstname']"));
        name.sendKeys("emrah");
        MyFunc.Bekle(1);
        WebElement surname= driver.findElement(By.xpath("//input[@name='lastname']"));
        surname.sendKeys("guney");
        MyFunc.Bekle(1);
        WebElement reEmail= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        System.out.println("reEmail.isDisplayed() = " + reEmail.isDisplayed());
        Assert.assertFalse(reEmail.isDisplayed());

        WebElement email= driver.findElement(By.xpath("//input[@name='reg_email__']"));
        email.sendKeys("emrahgun@hotmail.com");
        MyFunc.Bekle(1);
        WebElement emailConfirm= driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
        emailConfirm.sendKeys("emrahgun@hotmail.com");
        System.out.println("reEmail.isDisplayed2 = " + reEmail.isDisplayed());
        Assert.assertTrue(reEmail.isDisplayed());
        WebElement password= driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
        password.sendKeys("123456emrah");
        MyFunc.Bekle(1);

        WebElement day= driver.findElement(By.xpath("//select[@name='birthday_day']"));
        Select Dday=new Select(day);
        Dday.selectByVisibleText("28");
        MyFunc.Bekle(1);
        WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
        Select Mmonth=new Select(month);
        Mmonth.selectByVisibleText("Eyl");
        MyFunc.Bekle(1);
        WebElement year= driver.findElement(By.xpath("//select[@name='birthday_year']"));
        Select Yyear=new Select(year);
        Yyear.selectByVisibleText("1993");
        MyFunc.Bekle(1);


    }
}
