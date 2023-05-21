package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Odev1 extends BaseDriver {
    //1) https://formsmarts.com/form/yu?mode=h5 sitesini acin
    //2) Business i cekleyin(Business a tik at)
    //3)discover XYZ ye tiklatin ve online Advertising i secin
    //4)Every day i secin
    //5) Good u secin
    //6) using XYZ yi tiklatin ve 3. secenegi secin
    //CSS Selector ile coz

    @Test
    public  void Test() {


        driver.get("https://formsmarts.com/form/yu?mode=h5");

        MyFunc.Bekle(1);
        WebElement business= driver.findElement(By.cssSelector("[type='radio'][value='Business']"));
        business.click();

        MyFunc.Bekle(1);
        WebElement dropDownDiscover= driver.findElement(By.cssSelector("select[id$='_4588']"));
        dropDownDiscover.click();

        MyFunc.Bekle(1);
        WebElement optionOnlineAdvertising= driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optionOnlineAdvertising.click();

        MyFunc.Bekle(1);
        WebElement buttonEveryDay= driver.findElement(By.cssSelector("[type='radio'][value='Every Day']"));
        buttonEveryDay.click();

        MyFunc.Bekle(1);
        WebElement goodRadio= driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodRadio.click();

        MyFunc.Bekle(1);
        WebElement howLongDropdown= driver.findElement(By.cssSelector("select[id$='_4597']"));
        howLongDropdown.click();

        MyFunc.Bekle(1);
        WebElement secenek=driver.findElement(By.cssSelector("select[id$='_4597']> :nth-child(4)"));
        secenek.click();

        MyFunc.Bekle(1);
        goodRadio.click();


        BekleKapat();
    }

}
