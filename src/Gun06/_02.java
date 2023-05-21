package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02 extends BaseDriver {

    @Test//sen bir testsin test gibi davran manasina gelir
    public void Test1() /*main ile test yapmiyoruz*/ {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement text = driver.findElement(By.cssSelector("[id='user-message']"));
        text.sendKeys("emrahguney");

        WebElement click = driver.findElement(By.cssSelector("[onclick='showInput();']"));
        click.click();
        WebElement input = driver.findElement(By.cssSelector("[id='display']"));
        MyFunc.Bekle(2);

        /*if (input.getText().equals("emrahguney"))
            System.out.println("test basarili");
        else System.out.println("basarisiz");*/

        Assert.assertEquals("emrahguney", input.getText());//Verilen deger TRUE mu
        //Hata yok ise yani icindeki deger TRUE ise hic bilgi vermez.
        //Hata var ise gosterir
        // Assert.assertTrue("hata",input.getText().equals("hatali mesaj")); hata mesaji->java.lang.AssertionError: hata

        MyFunc.Bekle(2);

        BekleKapat();
    }

    @Test
    public void Test2() /*main ile test yapmiyoruz*/ {
        WebDriver xxx=new ChromeDriver();
        xxx.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement text = xxx.findElement(By.cssSelector("input[id='user-message']"));
        text.sendKeys("emrahguney");

        WebElement click = xxx.findElement(By.cssSelector("[onclick='showInput();']"));
        click.click();
        WebElement input = xxx.findElement(By.cssSelector("[id='display']"));
        MyFunc.Bekle(2);

        /*if (input.getText().equals("emrahguney"))
            System.out.println("test basarili");
        else System.out.println("basarisiz");*/


        //Hata var ise gosterir
        Assert.assertTrue("hata", input.getText().equals("hatali mesaj"));
       // hata mesaji->java.lang.AssertionError:hata

        MyFunc.Bekle(2);

        BekleKapat();
    }
    @Test
    public  void Test3()  {

        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement name= driver.findElement(By.cssSelector("input[id='user-message']"));
        name.click();
        MyFunc.Bekle(1);
        name.sendKeys("emrahguney");

        WebElement Click=driver.findElement(By.cssSelector("button[type='button'][class='btn btn-default'][onclick='showInput();']"));
        Click.click();
        MyFunc.Bekle(1);

        WebElement checkname= driver.findElement(By.cssSelector("span[id='display']"));

        Assert.assertEquals(name.getAttribute("value"),checkname.getText());
        MyFunc.Bekle(1);

        BekleKapat();




    }

}
