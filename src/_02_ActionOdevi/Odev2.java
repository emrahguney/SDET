package _02_ActionOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Odev2 extends BaseDriver {
/*http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html
         buradaki bütün öğrencileri bütün kutucukları doldurana kadar atınız.*/
    @Test
    public  void Test() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");


        List<WebElement> liste=driver.findElements(By.xpath("//ul[@id='allItems']/li"));

        System.out.println(liste.size());

       List<WebElement> takimlar=driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']/div/ul"));


        Actions actions=new Actions(driver);


        for (WebElement list:liste){
            for (WebElement webElement : takimlar) {
                actions.clickAndHold(list).build().perform();
                MyFunc.Bekle(1);
                actions.moveToElement(webElement).release().build().perform();
            }
        }


        }





}
