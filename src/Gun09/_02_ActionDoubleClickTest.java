package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionDoubleClickTest extends BaseDriver {
    @Test
    public  void Test() {
        driver.get("https://demoqa.com/buttons");
        MyFunc.Bekle(1);
        WebElement element= driver.findElement(By.id("doubleClickBtn"));
        MyFunc.Bekle(1);

        Actions actions=new Actions(driver);

        Action action=actions.moveToElement(element).doubleClick().build();
        action.perform();
        BekleKapat();
        //actions.doubleClick(element).build().perform();
        //actions.moveToElement(element).doubleClick().build().perform();
        //yukardaki 2 kodda olur ama bunlari genelde kullanilmasi dogru degildir.

    }
}
