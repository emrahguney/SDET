package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _06_FindingByLinkText {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.hepsiburada.com/");
//linklerde "<a" tag inde aranacak birsey yoksa(id ,name vs.) linkde ne yaziliyorsa ona gorede arabiliyoruz
        //LinkText yoluyla eleman bulma islemi sadece a tag inde(<a href) kullanilabilir.
        WebElement siparislerimLinki= driver.findElement(By.linkText("Siparişlerim"));//tam gorunen lik text ini verecegiz
        //gozuken text i Siparislerim olan "a" tag li webelement
        System.out.println("siparislerimLinki = " + siparislerimLinki.getText());

        //getAttribute ile 'siparislerimLinki' nde olan parametleri aliyoruz
        System.out.println("siparislerimLinki.getAttribute(href) = " + siparislerimLinki.getAttribute("href"));
        System.out.println("siparislerimLinki.getAttribute(\"title\") = " + siparislerimLinki.getAttribute("title"));
        System.out.println("siparislerimLinki.getAttribute(\"rel\") = " + siparislerimLinki.getAttribute("rel"));

        //partialLinkText
        WebElement link2= driver.findElement(By.partialLinkText("Süper Fiyat"));
        //gorunen link text inin bir parcasi verilebiliyor.Siyah renkli yazili kisminin bir kismini  alip tamamini yazdirdik
        System.out.println("link2.getText() = " + link2.getText());

        MyFunc.Bekle(3);
        driver.quit();
    }
}
