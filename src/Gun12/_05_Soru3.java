package Gun12;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

/*
    Senaryo:
    https://www.selenium.dev/ adresindeki ayrı tab da açılan linklere tıklatınız.
    Açılan bütün yeni tablardaki sayfaların title ve url lerini yazdırınız.
    Daha sonra Anasayfa harici diğer tüm sayfaları kapatınız.
 */
public class _05_Soru3 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://www.selenium.dev/");
String anaSayfaWindowId= driver.getWindowHandle();

        List<WebElement>linkler=driver.findElements(By.cssSelector("a[target='_blank']"));

        for (WebElement link:linkler)

            if (!link.getAttribute("href").contains("mail"))
                link.click();

        Set<String> windowsIdler=driver.getWindowHandles();

        for (String id:windowsIdler){

            driver.switchTo().window(id);//siradaki tabdaki window a gecmis oldum
            System.out.println("title = "+driver.getTitle()+",   url = "+driver.getCurrentUrl());
        }

        //anasayfa harici kapama

        for (String id: windowsIdler){
            if (id.equals(anaSayfaWindowId)){
                continue;
            }
            driver.switchTo().window(id);//siradaki tabdaki window a gecmis oldum
            driver.close();
        }

            BekleKapat();




    }
}
