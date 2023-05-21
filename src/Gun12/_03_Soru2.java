package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_Soru2 extends BaseDriver {
    @Test
    public void Test1(){
/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

        driver.get("http://chercher.tech/practice/frames");

        driver.switchTo().frame(0);

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Turkey");

        driver.switchTo().parentFrame();
        driver.switchTo().frame(1);

        WebElement input2=driver.findElement(By.xpath("//select[@id='animals']"));

        Select Sinput2=new Select(input2);
        Sinput2.selectByIndex(2);

       driver.switchTo().parentFrame();

        driver.switchTo().frame(0);
        driver.switchTo().frame(0);

       WebElement checkBox= driver.findElement(By.xpath("//input[@id='a']"));
       checkBox.click();

  //     driver.switchTo().parentFrame();  bir onceki
//        driver.switchTo().parentFrame();  bir onceki


       driver.switchTo().defaultContent();//direk olarak anasayfaya gider


    }
}
