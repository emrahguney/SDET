package Gun06;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_FindingByCssSelector extends BaseDriver {
    public static void main(String[] args) {
       driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement text= driver.findElement(By.cssSelector("input[id='user-message']"));
        text.sendKeys("emrahguney");

        WebElement click=driver.findElement(By.cssSelector("[onclick='showInput();']"));
        click.click();
        WebElement input=driver.findElement(By.cssSelector("[id='display']"));
        MyFunc.Bekle(2);
        if (input.getText().equals("emrahguney"))
            System.out.println("test basarili");
        else System.out.println("basarisiz");
        MyFunc.Bekle(2);

        BekleKapat();
       /** ozelliklerinden yola cikarak bulma islemine(parametrelerinden secerek) CSS Selector denir*/

    }
}
