package Gun12;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Set;

public class _04_WindowsGiris  extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("https://www.selenium.dev/");

        //su asamada ana sayfadayim
        //bulunulan windowid yi almak icin
        String anasayfaWindowID= driver.getWindowHandle();
        System.out.println("anasayfaWindowID = " + anasayfaWindowID);

        //bu sayfada yeni pencere accak olan linkleri nasil aliriz->Bunlarin ortak ozelligi(a taglerin yeni sayfa acanlarin ortak yonleri); target=_blank olanlardir->yeni sayfada acmasinin parametresidir
        List<WebElement>linkler=driver.findElements(By.cssSelector("a[target='_blank']"));
        for (WebElement link:linkler){
            if (!link.getAttribute("href").contains("mail"))//href i mail yazisi olmayanlara tikla
                link.click();

        }

        //su asamada butun sayfalar acildi
        Set<String> windowsIdler=driver.getWindowHandles();//acilan windowslarin idsini verir
        for (String id:windowsIdler){
            System.out.println("id="+id);

            //su anda en son acilan sayfadayim ana sayfaya gecmek icin
            driver.switchTo().window(anasayfaWindowID);//ana sayfaya gectim

            MyFunc.Bekle(10);
            BekleKapat();
        }

    }
}
