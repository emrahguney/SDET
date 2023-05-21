package _01_xPathOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseDriver {/*1) Bu siteye gidin. -> https://www.snapdeal.com/

2) "teddy bear" aratın ve Search butonuna tıklayın.

3) Bu yazının göründüğünü doğrulayınız. -> (We've got 297 results for 'teddy bear')
Not: Bu yazıdaki sayı değişiklik gösterebilir. Önemli olan cümle kalıbı.
*/
    @Test
    public void Test() {

        driver.get("https://www.snapdeal.com");
        WebElement search=driver.findElement(By.xpath("//*[@class='col-xs-14 search-box-wrapper']/input"));
        search.sendKeys("teddy bear");
        MyFunc.Bekle(1);
        WebElement searchClick= driver.findElement(By.xpath("//*[@class='searchformButton col-xs-4 rippleGrey']/span"));
        searchClick.click();
        MyFunc.Bekle(1);
        WebElement teddybearResults= driver.findElement(By.xpath("(//*[@class='search-result-txt-section  marT12']/span)[1]"));
        MyFunc.Bekle(1);
        Assert.assertTrue(teddybearResults.getText().equals("We've got 317 results for teddy bear"));
        BekleKapat();
    }
}
