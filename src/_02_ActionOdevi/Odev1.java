package _02_ActionOdevi;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.List;
public class Odev1 extends BaseDriver {
    @Test
    public void Test() {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        List<WebElement> sehirler = driver.findElements(By.xpath("//div[@id='answerDiv']/div"));
        List<WebElement> ulkeler = driver.findElements(By.xpath("//div[@id='questionDiv']/div[@class='dragDropSmallBox']"));
        Actions actions = new Actions(driver);
        String[] SEHIR=new String[sehirler.size()];
        String []ULKE=new String[ulkeler.size()];
        for (int i = 0; i < SEHIR.length ; i++) {
            SEHIR[i]=sehirler.get(i).getAttribute("id");
            ULKE[i]=ulkeler.get(i).getAttribute("id");}
  for (int i = 0; i <sehirler.size() ; i++) {
            for (int j = 0; j <ulkeler.size() ; j++) {
                if (SEHIR[i].substring(1).equals(ULKE[j].substring(1)))
                {actions.clickAndHold(sehirler.get(i)).build().perform();
                    MyFunc.Bekle(1);
                    actions.moveToElement(ulkeler.get(j)).release().build().perform();
                    MyFunc.Bekle(1);break;
                }
            }
        }
    }
    @Test
    public void TestIkinciCozum(){
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        List<WebElement> options = driver.findElements(By.xpath("//div[@id='answerDiv']/div"));
        List<WebElement> boxes = driver.findElements(By.xpath("//div[@id='questionDiv']/div[@class='dragDropSmallBox']"));
        Actions actions = new Actions(driver);
        for (WebElement opt:options){
            for (WebElement box:boxes){
                if (box.getAttribute("id").substring(1).equals(opt.getAttribute("id").substring(1))){
                    actions.clickAndHold(opt).moveToElement(box).build().perform();
                    MyFunc.Bekle(1);
                    actions.moveToElement(box).release().build().perform();
                }
            }
        }
    }





























       /* for (int i = 0; i < cevap.size() ; i++) {
            Action action = actions.clickAndHold(soru.get(i)).build();

            action.perform();

            for (int j = 0; j < soru.size() ; j++) {
                MyFunc.Bekle(1);
                actions.moveToElement(cevap.get(j)).release().perform();
                MyFunc.Bekle(1);
                actions.clickAndHold(cevap.get(j)).build().perform();
                MyFunc.Bekle(1);
                Duration muhlet=Duration.ofSeconds(30);
                WebDriverWait bekle=new WebDriverWait(driver, muhlet);
              //  bekle.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='destinationBox']/div")));

                WebElement renk= driver.findElement(By.xpath("//div[@class='destinationBox']/div"));
                if (cevap.get(j).getAttribute(renk.getAttribute("class")).contains("wrongAnswer")){
                    for (int k = j; k < cevap.size() ; k++) {
                        MyFunc.Bekle(1);
                        actions.clickAndHold(cevap.get(k)).build().perform();
                        MyFunc.Bekle(1);
                        actions.moveToElement(cevap.get(k+1)).release().perform();
                        MyFunc.Bekle(1);


                        if(cevap.get(j).getAttribute(renk.getAttribute("class")).contains("correctAnswer")){
                            break;
                        }
                    }
                }
                actions.clickAndHold(cevap.get(j)).build();
                actions.moveToElement(cevap.get(j+1)).release().perform();



            }

        }*/

    }

