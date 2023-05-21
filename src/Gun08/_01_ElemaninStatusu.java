package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_ElemaninStatusu extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement thuesday= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println("thuesday.isDisplayed() = " + thuesday.isDisplayed());//gozukuyormu
        System.out.println("thuesday.isEnabled() = " + thuesday.isEnabled());//aktifmi
        System.out.println("thuesday.isSelected() = " + thuesday.isSelected());//secilimi, checked mi

        thuesday.click();
        MyFunc.Bekle(1);
        System.out.println("thuesday.isSelected() = " + thuesday.isSelected());

        WebElement saturday= driver.findElement(By.id("gwt-debug-cwCheckBox-Saturday-input"));
        System.out.println("saturday.isDisplayed() = " + saturday.isDisplayed());
        System.out.println("saturday.isEnabled() = " + saturday.isEnabled());
        System.out.println("saturday.isSelected() = " + saturday.isSelected());

        saturday.click();
        MyFunc.Bekle(1);

        BekleKapat();

    }
}
