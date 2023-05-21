package Gun09;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionClickTest extends BaseDriver {

    @Test
    public  void Test() {

        driver.get("https://demoqa.com/buttons");
        WebElement element= driver.findElement(By.xpath("//button[text()='Click Me']"));

        Actions aksiyonlar=new Actions(driver); //web sayfasi aksiyonlara acildi

        Action aksiyon=  aksiyonlar.moveToElement(element).click().build();
        //elementin uzerinde click icin git orda bekle. aksiyonu hazirla
        System.out.println("Aksiyon hazirlandi");

        MyFunc.Bekle(3);

        aksiyon.perform();//aksiyonu gerceklestir,isleme al,uygula,icra et
        System.out.println("aksiyon gerceklestir");

        BekleKapat();
    }
}
