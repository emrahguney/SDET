package _01_xPathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseDriver {
/*Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]
Calculate'e tıklayınız.
    İlk input'a herhangi bir sayı giriniz.
    İkinci input'a herhangi bir sayı giriniz.
Calculate button'una tıklayınız.
Sonucu alınız.
Sonucu yazdırınız.
*/
    @Test
    public  void Test() {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate= driver.findElement(By.xpath("//*[@class='page-body']/ul[4]/li[7]/a"));
        calculate.click();
        MyFunc.Bekle(1);
        WebElement firstValue= driver.findElement(By.xpath("//*[@action='calculate.php']/input[1]"));
        firstValue.sendKeys("234");
        MyFunc.Bekle(1);
        WebElement secondValue=driver.findElement(By.xpath("//*[@action='calculate.php']/input[2]"));
        secondValue.sendKeys("432");
        MyFunc.Bekle(1);
        WebElement CalculateClick=driver.findElement(By.xpath("//*[@action='calculate.php']/input[3]"));
        CalculateClick.click();
        MyFunc.Bekle(1);
        WebElement result=driver.findElement(By.xpath("//*[@action='calculate.php']//following-sibling::span"));
        MyFunc.Bekle(1);

        System.out.println(result.getText());

BekleKapat();
    }
}
