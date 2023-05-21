package Gun05;

import Utility.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _01_FindingElements_tag extends BaseDriver {

    public static void main(String[] args) {

        driver.get("https://www.hepsiburada.com/");

        List<WebElement> linkler=driver.findElements(By.tagName("a"));//a tagi ile baslayan tum elemanlari bul

        for (WebElement a:linkler){
            System.out.print("a.getAttribute(\"href\") = " + a.getAttribute("href"));
            System.out.print("a.getAttribute(\"title\") = " + a.getAttribute("title"));
            System.out.println("a.getAttribute(\"rel\") = " + a.getAttribute("rel"));
        }


        for (WebElement a:linkler){//ekrandaki gozukmeyen linkleri bulduk
           if (a.getText().isEmpty()){
               System.out.print("a.getAttribute(\"href\") = " + a.getAttribute("href"));
               System.out.print("a.getAttribute(\"title\") = " + a.getAttribute("title"));
               System.out.println("a.getAttribute(\"rel\") = " + a.getAttribute("rel"));
           }
        }

        

        BekleKapat();

    }
}
