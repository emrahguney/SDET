package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_YonTuslariSecim extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://demoqa.com/auto-complete");

        WebElement txtBox= driver.findElement(By.id("autoCompleteSingleInput"));

        MyFunc.Bekle(1);
        Actions actions=new Actions(driver);
        Action aksiyon=actions.moveToElement(txtBox).click().sendKeys("b").build();
        aksiyon.perform();
        MyFunc.Bekle(1);
       // Action aksiyon2=actions.keyDown(Keys.ARROW_DOWN).keyDown(Keys.ENTER).build();
       // aksiyon2.perform();
        MyFunc.Bekle(1);
        aksiyon=actions.sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        aksiyon.perform();



        BekleKapat();



    }
}
