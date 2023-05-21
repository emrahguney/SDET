package Gun09;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _05_ActionDragAndDropTest extends BaseDriver {
    @Test
    public void Test() {

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        Actions aksiyonlar=new Actions(driver);

        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement norway= driver.findElement(By.id("box101"));

      /*  //1.yontem
        aksiyonlar.dragAndDrop(oslo,norway).build().perform();//osloy u norway e at

        //2.yontem
        aksiyonlar.clickAndHold(oslo).build().perform();//oslo ya tiklat ve al
        aksiyonlar.moveToElement(norway).release().build().perform();//norwayin uzerine git ve birak*/

        //1.yontemin sagliklisi
        Action aksiyon=aksiyonlar.dragAndDrop(oslo,norway).build();
        aksiyon.perform();
        //2.yontemin sagliklisi
        aksiyon=aksiyonlar.clickAndHold(oslo).build();
        aksiyon.perform();




        BekleKapat();
    }
}