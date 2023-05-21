package Gun14;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.Dimension;

public class _02_WindowSize extends BaseDriver {

    @Test
    public void Test1(){
        driver.get("https://www.youtube.com/");

        Dimension boyut=new Dimension(800,600);
        driver.manage().window().setSize(boyut);


        BekleKapat();
    }
}
