import Utility.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class a  extends BaseDriver {
    @Test
    public void Test1() {

     /* Task 1:
"http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html" sitesine gidiniz.
Click me to start timer butonun atiklatiniz.
wait kullanarak Selenium,QTP ve Webdriver yazilari gorulene kadar bekletiniz.
Webdriver goruluyor mu dogrulugunu kontrol ediniz.

Task 2:
https://qatest.twoplugs.com/ sitesine gidiniz.
What do I need to sign up? sorusuna tiklatiniz.
"You need a facebook account or a valid email address to sign up." texti gorulene kadar bekletiniz.
Text gorunuyor mu dogrulayiniz.

Task 3:
https://google.com/ sitesine gidiniz.
search kismina selenium gonderip Enter'a basiniz.
Element tiklanabilir olana kadar bekletiniz.
Sonuclar kismindan ilk sonucun selenium icerdigini kontrol ediniz.  */

        driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-use-explicit-wait-in-selenium.html");
        WebElement clickme= driver.findElement(By.xpath("//button[@onclick='timedText()']"));
        clickme.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='WebDriver']")));

        WebElement titleweb= driver.findElement(By.xpath("(//p[text()])[1]"));

        System.out.println("bitti");

        Assert.assertTrue(titleweb.getText().contains("WebDriver"));

    }
    @Test
    public void Test2() {
        driver.get("https://qatest.twoplugs.com/");
        WebElement element= driver.findElement(By.xpath("//span[text()='What do I need to sign up?']"));
        element.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[text()='You need a facebook account or a valid email address to sign up.']")));

        WebElement title= driver.findElement(By.xpath("//p[text()='You need a facebook account or a valid email address to sign up.']"));

        Assert.assertTrue(title.getText().contains("You need a facebook account or a valid email address to sign up"));
    }
    @Test
    public void Test3(){

        driver.get("https://google.com/");
        WebElement element= driver.findElement(By.xpath("//input[@type='text']"));
        element.sendKeys("selenium");
        Actions actions=new Actions(driver);
        Action action=actions.moveToElement(element).keyDown(Keys.ENTER).keyUp(Keys.ENTER).build();
        action.perform();

        WebElement selenium= driver.findElement(By.xpath("//h3[text()='Selenium']"));
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));

        wait.until(ExpectedConditions.elementToBeClickable(selenium));

        Assert.assertEquals("Selenium", selenium.getText());


    }

}
/*CHROME DA SIKINTI OLURSA BUNU YAZ
ChromeOptions options = new ChromeOptions();
options.addArguments("--remote-allow-origins=*");
driver = new ChromeDriver(options);*/