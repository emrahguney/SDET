package _00_CSSSelectorOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseDriver {
    /*3-
1) Bu siteye gidin. -> https://www.snapdeal.com/

2) "teddy bear" aratın ve Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.

*/
    @Test
    public  void test() {
        driver.get("https://www.snapdeal.com/");
        WebElement search= driver.findElement(By.cssSelector("[id='inputValEnter']"));
        search.click();
        search.sendKeys("teddy bear");

        WebElement cl= driver.findElement(By.cssSelector("[class='sd-icon sd-icon-search-under-catagory lfloat']"));
        cl.click();

        WebElement findBear= driver.findElement(By.cssSelector("div[id='searchMessageContainer']>div"));

        Assert.assertTrue(findBear.getText().equals("We've got 314 results for teddy bear"));

        MyFunc.Bekle(2);
        BekleKapat();
    }
}
