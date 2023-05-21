package Gun13;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class _01_Scrollintro extends BaseDriver {
   /*selenium javascript window scroll
https://www.browserstack.com/guide/selenium-scroll-tutorial
BU SAYFAYA BAK*/
/*
    Selenium da Sayfayı aşağı kaydırılması gereken durumlar vardır:
    Bunlar , sayfa kaydırıldıkça yüklenen elemanlar için

    Bu işlem javascriptexecuter ile yapılır.Bu interface sayesinde
    sayfa kaydırma işlemi ve javascript komutları çalıştırılabilir
    sayfa üzerinde.

    ("window.scrollTo(0, 3000);")    -> Verilen pixel e kadar gider.
    ("window.scrollBy(0, 3000);")    -> bulunduğu yerden , Verilen kadar daha ileri gider.
    ("window.scrollTo(0, document.body.scrollHeight);")   -> sayfanın sonuna kadar gider.
    ("arguments[0].scrollIntoView(true);", element)       -> Verilen elemente kadar gider.
                                                   true : element sayfanın üstünde gözükene kadar,
                                                   false: element sayfanın altına gözükene kadar
                                                   default true;

   element.click() -> normal click
   action click()  -> action click
   ("arguments[0].click();", element)    -> javascript click()  -> javascript click.
 */

    @Test
    public void Test1() {

        driver.get("https://p-del.co/");
        MyFunc.Bekle(2);
  //      Actions actions=new Actions(driver);//driver uzerinden aksiyon islemleri icin
//        Select select=new Select(element);//bir tane element icin

        //JavaScript komutlarini calistirmak icin once js degiskeni tanimlandi
        JavascriptExecutor js=(JavascriptExecutor)driver;//cast yapildi

        js.executeScript("window.scrollBy(0,3000)");
        //(0,1500)->(x,y) Sayfayi x; pozitif ise saga kadar, negatif ise sola kadar kaydirir.
//                        Sayfayi y; pozitif ise asagiya kadar kaydirir, negatif ise yukari kaydirir

        MyFunc.Bekle(2);

        js.executeScript("window.scrollBy(0,-3000)");
        MyFunc.Bekle(2);


        BekleKapat();
    }
}
