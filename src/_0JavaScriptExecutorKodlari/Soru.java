package _0JavaScriptExecutorKodlari;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Soru extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://the-internet.herokuapp.com/infinite_scroll");

        List<WebElement> texts=driver.findElements(By.xpath("//div[@class='jscroll-added']"));

        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 20000);");

        for (int i = 0; i < 1 ; i+=0) {
            texts=driver.findElements(By.xpath("//div[@class='jscroll-added']"));
            MyFunc.Bekle(2);
            js.executeScript(("window.scrollBy(0, 20000);") );
            if (texts.size()>10){
                break;
            }
        }

        for (WebElement text: texts){
            System.out.println(text.getText());
        }
    }
}
