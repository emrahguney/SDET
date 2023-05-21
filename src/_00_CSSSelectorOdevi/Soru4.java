package _00_CSSSelectorOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseDriver {/*4-

Bu websitesine gidiniz. [https://testpages.herokuapp.com/styled/index.html]

Calculate'e tıklayınız.

    İlk input'a herhangi bir sayı giriniz.

    İkinci input'a herhangi bir sayı giriniz.

Calculate button'una tıklayınız.

Sonucu alınız.

Sonucu yazdırınız.
*/

    public static void main(String[] args) {



        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement calculate=driver.findElement(By.cssSelector("[id='calculate']"));
        calculate.click();
        MyFunc.Bekle(1);
        WebElement input1= driver.findElement(By.cssSelector("[id='number1']"));
        input1.sendKeys("100");
        MyFunc.Bekle(1);
        WebElement input2= driver.findElement(By.cssSelector("[id='number2']"));
        input2.sendKeys("50");
        MyFunc.Bekle(1);
        WebElement result=driver.findElement(By.cssSelector("[id='calculate']"));
        result.click();
        MyFunc.Bekle(1);
        WebElement answer=driver.findElement(By.cssSelector("span[id='answer']"));
        MyFunc.Bekle(1);
        System.out.println(answer.getText());
        MyFunc.Bekle(1);
        BekleKapat();
    }
}
