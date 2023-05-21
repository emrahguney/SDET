package _02_ActionOdevi;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/*http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html
         buradaki bütün şehirleri bütün ülkere doğru şekilde topluca dağıtınız.*/
public class Odev3 extends BaseDriver {
    @Test
    public void Test1() {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        List<WebElement> citieslist=driver.findElements(By.xpath("//ul[@id='allItems']/li"));

        List<WebElement> countriesNations=driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']/div/ul"));

        Actions actions = new Actions(driver);
int c=0;
        for (WebElement cityL : citieslist) {
            for (WebElement countryN : countriesNations) {

                if (cityL.getAttribute("groupid").substring(1).equals(countryN.getAttribute("id").substring(1))) {

                    actions.clickAndHold(cityL).build().perform();
                    MyFunc.Bekle(1);
                    actions.moveToElement(countryN).release().build().perform();
                    c++;
                    if (c==citieslist.size()){

                        break;
                    }

                }

            }

        }
        MyFunc.Bekle(2);
        driver.switchTo().alert().accept();
        MyFunc.Bekle(2);

        BekleKapat();



        }
    }