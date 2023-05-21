package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://chercher.tech/practice/frames");

        //id=frame1     name=iamframe   index?:bulundugu sayfadaki kod sirasi
        driver.switchTo().frame(0);//name ve id oldukca yavas calisiyor, index hizli : index>name>id

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']+input"));
         input.sendKeys("Turkiye");

        // iframe içindeki bir locator da işlem yapılacaksa önce o iframe geçmem lazım.
        // driver.switchTo().frame(0);  // ilgili odaya (iframe) geç
        // driver.switchTo().parentFrame(); // bir önceki odaya geç, parent e geç
        // driver.switchTo().defaultContent(); // ilk ana sayfaya direk geçer

        BekleKapat();

    }
}
//NOT:a[@target="blank"] yeni web sayfasini acar