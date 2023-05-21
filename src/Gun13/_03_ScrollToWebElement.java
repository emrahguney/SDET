package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class _03_ScrollToWebElement extends BaseDriver {
    @Test
    public void Test1() {


        driver.manage().deleteAllCookies();//cookiesleri sildik
        driver.get("https://www.copado.com/robotic-testing");

        MyFunc.Bekle(2);
        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement element= driver.findElement(By.xpath("//a[text()='Read story']"));
        js.executeScript("arguments[0].scrollIntoView(true);",element); //element e kadar kaydirir.

        //element.click();-> tiklatma ozelligini kaybettiren elementlerin altinda oldugunda tiklanamaz
        js.executeScript("arguments[0].click();",element);//html icinden elemente ulasir ve tiklatir
                            //elementi aliyor argumens[0] icine atiyor aslinda arguments[0]-> element oluyor bu elemente ulasip tiklar


        MyFunc.Bekle(5);
        BekleKapat();

    }
}
