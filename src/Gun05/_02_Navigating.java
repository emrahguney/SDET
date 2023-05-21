package Gun05;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_Navigating extends BaseDriver
{
    public static void main(String[] args) {
        //navigate; sitede ileri geri gitmeye yariyor navigasyon gibi
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        MyFunc.Bekle(3);

        WebElement element= driver.findElement(By.id("alerttest"));
        //WebElement element2= driver.findElement(By.linkText("Alerts (JavaScript)"));->LinkTest ile bulma
        element.click();
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());//o anda bulundugun URL yi verir

        driver.navigate().back();//tarayici history isinden geri geldim.
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());//o anda bulundugun URL yi verir

        driver.navigate().forward();
        MyFunc.Bekle(3);

        System.out.println(driver.getCurrentUrl());//o anda bulundugun URL yi verir

        BekleKapat();
    }
}
