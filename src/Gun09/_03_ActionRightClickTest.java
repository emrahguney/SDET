package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionRightClickTest extends BaseDriver {

    @Test
    public  void Test() {

        driver.get("https://demoqa.com/buttons");
        MyFunc.Bekle(1);
        WebElement element= driver.findElement(By.id("rightClickBtn"));
        MyFunc.Bekle(1);

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).contextClick().build();//contextClick=right click
        aksiyon.perform();

        //new Actions(driver).contextClick(element).build().perform(); yukardaki kodlari tek hamlede yazma budur ama best practice degildir
        BekleKapat();

    }
}
