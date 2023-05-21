package Gun11;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.time.Duration;

/*1- HTML (DOM) nini içinde locator olarak yüklenmesi java hızlı çalıştığından problem oluyor findElement

2- kod olarak HTML içinde var ama , CHROME tarafından görüntülenmesi, yani gözükür hale gelmesi ayrı bir
   durum. Elemanın hazır hale gelmesi java hızlı çalıştığından problem oluyor Click

3- HTML içinde var görünür değil Sayfanın değişim süresi*/
/*


 */
public class _01_WaitsGiris extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");

        WebElement btn= driver.findElement(By.xpath("//button[text()='Click me to start timer']"));
        btn.click();

        Duration muhlet=Duration.ofSeconds(120);//bu sureden erken bulunursa surenin tamamini kullanmaz buldugu surede islem biter
        driver.manage().timeouts().implicitlyWait(muhlet); // Bütün weblementlerin element bazında, elemente özel işlem yapılmadan önce
        // hazır hale gelmesi verilen mühlet yani süre. // eğer 2 sn yüklerse 30 sn. beklemez.


       // MyFunc.Bekle(30);//bu programi durduruyor // sayfaylada bir ilgisi olmadigi icin sonuna kadar bekler

        WebElement mesaj= driver.findElement(By.xpath("//p[text()='WebDriver']"));

    }
}
