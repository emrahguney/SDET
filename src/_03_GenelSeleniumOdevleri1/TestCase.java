package _03_GenelSeleniumOdevleri1;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScriptKey;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TestCase extends BaseDriver {

    @Test
    public void Test1(){

        for (int i = 0; i <5 ; i++) {
            driver.get("https://testsheepnz.github.io/BasicCalculator.html");
            int rnd1=(int)(Math.random()*100);
            int rnd2=(int)(Math.random()*100);
String RND1=String.valueOf(rnd1);
String RND2=String.valueOf(rnd2);
            WebElement firstN= driver.findElement(By.id("number1Field"));
            WebElement secondN= driver.findElement(By.id("number2Field"));
            MyFunc.Bekle(1);
            firstN.sendKeys(RND1);
            MyFunc.Bekle(1);
            secondN.sendKeys(RND2);
            MyFunc.Bekle(1);
            WebElement operation= driver.findElement(By.name("selectOperation"));
            Select select=new Select(operation);
            select.selectByIndex(i);
String sonucSTR = "";
            if (i==0){
                Double random1=Double.parseDouble(RND1);
                Double random2=Double.parseDouble(RND2);
                double sonuc=random1+random2;
                sonucSTR=String.valueOf(sonuc);
            }else if (i==1){
                Double random1=Double.parseDouble(RND1);
                Double random2=Double.parseDouble(RND2);
                double sonuc=random1-random2;
                sonucSTR=String.valueOf(sonuc);
            }else if (i==2){
                Double random1=Double.parseDouble(RND1);
                Double random2=Double.parseDouble(RND2);
                double sonuc=random1*random2;
                sonucSTR=String.valueOf(sonuc);
            }else if (i==3){
                Double random1=Double.parseDouble(RND1);
                Double random2=Double.parseDouble(RND2);
                double sonuc=random1/random2;
                sonucSTR=String.valueOf(sonuc);
            }else {
                String sonuc=RND1+RND2;
                Double sonucD=Double.parseDouble(sonuc);
                sonucSTR=String.valueOf(sonucD);
            }
            MyFunc.Bekle(1);
            WebElement calculate= driver.findElement(By.id("calculateButton"));
            calculate.click(); MyFunc.Bekle(1);
            Duration muhlet=Duration.ofSeconds(30);
            WebDriverWait bekle=new WebDriverWait(driver, muhlet);
            bekle.until(ExpectedConditions.visibilityOfElementLocated(By.id("numberAnswerField")));
            WebElement answer= driver.findElement(By.id("numberAnswerField"));
            System.out.println("sonucSTR = " + sonucSTR.length());
            Double a=Double.parseDouble(answer.getAttribute("value"));
            String answerS=String.valueOf(a);
            System.out.println("answer in valuesi = "+answerS);
            System.out.println("if deki sonuc = "+sonucSTR);
            Assert.assertEquals(answerS, sonucSTR);
        }

    }@Test
    public void Test2(){
driver.get("https://www.youtube.com/");
WebElement search=driver.findElement(By.cssSelector("input[id='search']"));
        MyFunc.Bekle(1);
search.sendKeys("Selenium");
        MyFunc.Bekle(1);
WebElement searchButton= driver.findElement(By.id("search-icon-legacy"));
searchButton.click();
        MyFunc.Bekle(1);
        List<WebElement> videos=driver.findElements(By.xpath("//a[@id='video-title']"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, 20000);");
        for (int i = 0; i < 8 ; i+=0) {
            videos=driver.findElements(By.xpath("//a[@id='video-title']"));
            MyFunc.Bekle(2);
js.executeScript(("window.scrollBy(0, 20000);") );
            System.out.println(videos.size());
            if (videos.size()>=79){
                break;
            }
            }
        System.out.println(videos.get(79).getText());
        System.out.println(videos.get(79).getAttribute("title"));

        }
    }

