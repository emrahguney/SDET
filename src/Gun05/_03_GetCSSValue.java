package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_GetCSSValue extends BaseDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");

        WebElement inputValEnter= driver.findElement(By.id("inputValEnter"));
      //  <input autocomplete="off" name="keyword" type="text" class="col-xs-20 searchformInput keyword"
        // id="inputValEnter" onkeypress="clickGo(event, this)" placeholder="Search products &amp; brands"
        //  value="" strtindx="" endindx="">

        //elemanin parametrelerine ulasmak icin getAttribute u kullaniyoruz
        System.out.println("inputValEnter.getAttribute(\"class\") = " + inputValEnter.getAttribute("class"));

        //Class in karsiligi olan CSS-Sekillendirme degerlerini almak icin getCssValue kullanilir
        System.out.println("getCssValue(color) = "+inputValEnter.getCssValue("color"));
        System.out.println("getCssValue(font-size) = "+inputValEnter.getCssValue("font-size"));
        System.out.println("inputValEnter.getCssValue(\"background\") = " + inputValEnter.getCssValue("background"));
        //incele dedigimizde html in saginda yazan color font-size background vs. oradan buluyoruz

//rgba=red green blue opacity(alfa)

        BekleKapat();
    }
}
