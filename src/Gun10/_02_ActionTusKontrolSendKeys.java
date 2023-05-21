package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_ActionTusKontrolSendKeys extends BaseDriver {
    @Test
    public void Test1() {
        driver.get("https://demoqa.com/auto-complete");

        WebElement element= driver.findElement(By.id("autoCompleteSingleInput"));
        //element.sendKeys("Emrah");

        //shift e shift i biraktim mrah ->Emrah

        Actions actions=new Actions(driver);

        Action aksiyon= actions
                .moveToElement(element)//kutucuga gel
                .click()//icine tikla
                .keyDown(Keys.SHIFT)//shift  bas
                .sendKeys("e")//shift+e->E
                .keyUp(Keys.SHIFT)//shift i birak
                .sendKeys("mrah")//yaziyi gonder
                .build();
                //aksiyon hazirlandi

                                                                    //keyDown->tusa bas demek                   keyUp->tusu birak demek
        MyFunc.Bekle(1);
        aksiyon.perform();
        BekleKapat();



    }
}
