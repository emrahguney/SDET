package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_Soru extends BaseDriver {
    @Test
    public void Test1() {
     /*
   Senaryo :
   https://chercher.tech/practice/frames sitesine gidiniz
   Ekranda gözüken ilk kutucuğa Türkiye yazınız.
   Daha sonra animals dan seçeneklerinden avatar ı seçiniz.
 */

        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0);//name ve id oldukca yavas calisiyor, index hizli : index>name>id

        // //b[@id='topic']/following-sibling::input
        // b[id='topic']~input
        // #topic+input
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
        input.sendKeys("Turkiye");

        driver.switchTo().parentFrame();//driver.switchTo().defaultContent(); ayni islemi yapar cunku 1 kademe iceri girmistik.
        driver.switchTo().frame(1);

        WebElement input2= driver.findElement(By.xpath("//select[@id='animals']"));

        Select input2Menu=new Select(input2);
        input2Menu.selectByIndex(3);
    }
}
