package Gun08;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class _02_SelectClassGiris extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.amazon.com.tr/");

        WebElement webMenu1= driver.findElement(By.id("searchDropdownBox"));
        //bu element select tag i ile basliyorsa, sen bunu SELECT e cast yap ve oyle kullan

        Select ddMenu1= new Select(webMenu1);//elementi daha rahat kullanilabilir SELECT nesnesi haline donusturdu.
        //ddMenu1.selectByIndex(4);//ister bu sekilde secebilirsin : indexle
        //ddMenu1.selectByValue("search-alias=electronics");//ister bu sekilde secebilirsin : value ile
        ddMenu1.selectByVisibleText("Elektronik");//ister bu sekilde secebilirsin : gorunen string ile

        System.out.println("ddMenu1.getOptions().size() = " + ddMenu1.getOptions().size());
        BekleKapat();

    }
}
