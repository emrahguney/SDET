package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class _05_FindingByClassName {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");

        WebElement name= driver.findElement(By.className("form-textbox"));//locatorda "form-textbox validate[required]"  boyle yaziyorsa(bosluklu olunca) 2 tane classi vardir 1 tanesini yazsak olur
        name.sendKeys("emrah");

        //Soru: Birden fazla ayni locator a sahip eleman bulursa findElement ne yapar?
        //cevap: ilk element i bulur

        List<WebElement> labels=driver.findElements(By.className("form-sub-label"));//sadece "form-sub-label" leri buluyor."form-sub-label-container" ları aramaya dahil etmiyor
        System.out.println(labels.size());
        for (WebElement e:labels){
            System.out.println("e = " + e.getText());
        }
        //aranilan eleman bulunamazsa ;
        //findElement-> NoSuchElement hatasi verir
        //findElements->findElements is size i 0 olan List verir, yani hata vermez.

        MyFunc.Bekle(3);
        driver.quit();
    }
}
