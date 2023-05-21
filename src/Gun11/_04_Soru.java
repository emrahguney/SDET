package Gun11;
import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
public class _04_Soru extends BaseDriver {
    /*
    Senaryo
    1-  https://www.demoblaze.com/index.html  siteyi açınız.
    2- Samsung galaxy s6  linkine tıklayınız.
    3- Sepete ekleyiniz.
    4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz*/
    @Test
    public void Test1() {
        driver.navigate().to("https://www.demoblaze.com/index.html");

        WebElement link= driver.findElement(By.linkText("Samsung galaxy s6"));
        link.click();

        WebElement sepeteEklelinki= driver.findElement(By.linkText("Add to cart"));
        sepeteEklelinki.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
        wait.until(ExpectedConditions.alertIsPresent());//alert cikana kadar bekle

        driver.switchTo().alert().accept();

        WebElement anaSayfa= driver.findElement(By.id("nava"));
        anaSayfa.click();
        BekleKapat();
    }
}/*locator bulmasıyla ilgili bekletmeler için
bütün elemanlarda geçerli ve sadece bir kez
yazılan bekletme : imlicitlyWait

-- elemente özel ve her türlü değişimi süresiyle
ilgili sadece o elemente çalışan bekletme
ExplicitWait

MyFunc.Bekle : verilen süre kadar
intelliji durduruyor
*/