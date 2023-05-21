package _04_GenelSeleniumOdevleri2;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class TestCase extends BaseDriver {

    @Test
    public void Test1(){

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement alert= driver.findElement(By.id("alerttest"));
        MyFunc.Bekle(1);
        alert.click();
        MyFunc.Bekle(1);
        System.out.println("URL = "+driver.getCurrentUrl());

    }

    @Test
    public void Test2(){
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement alert= driver.findElement(By.id("alerttest"));
        MyFunc.Bekle(1);
        alert.click();
        MyFunc.Bekle(1);
        System.out.println("URL = "+driver.getCurrentUrl());
        driver.navigate().back();
        MyFunc.Bekle(1);
        WebElement basicajax= driver.findElement(By.id("basicajax"));
        basicajax.click();
        MyFunc.Bekle(1);
        System.out.println("URL 2 = "+driver.getCurrentUrl());


    }
    @Test
    public void Test3(){
            driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
            WebElement FBPlayG= driver.findElement(By.id("findby"));
            FBPlayG.click();
            MyFunc.Bekle(1);
            WebElement fifthText= driver.findElement(By.id("p5"));
        System.out.println(fifthText.getText());


    }
    @Test
    public void Test4(){

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement search= driver.findElement(By.id("searchtest"));
        search.click();
        WebElement title= driver.findElement(By.xpath("//div[@class='page-body']/h1"));
        System.out.println(title.getText());

        WebElement searchButton= driver.findElement(By.name("btnG"));
        searchButton.click();
        System.out.println("URL = "+driver.getCurrentUrl());

    }

    @Test
    public void Test5(){
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate= driver.findElement(By.id("calculate"));
        calculate.click();
MyFunc.Bekle(1);
        WebElement number1= driver.findElement(By.id("number1"));
        number1.sendKeys("100");
        MyFunc.Bekle(1);
        WebElement number2= driver.findElement(By.id("number2"));
        number2.sendKeys("50");
        MyFunc.Bekle(1);
        WebElement calculate2= driver.findElement(By.id("calculate"));
        calculate2.click();
        MyFunc.Bekle(1);
        WebElement answer= driver.findElement(By.id("answer"));
        System.out.println("answer = "+answer.getText());


    }
    @Test
    public void Test6(){
        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakealert= driver.findElement(By.id("fakealerttest"));
        fakealert.click();
MyFunc.Bekle(1);
        WebElement alertbox= driver.findElement(By.id("fakealert"));
        alertbox.click();
        MyFunc.Bekle(1);
        WebElement ok= driver.findElement(By.id("dialog-ok"));
        ok.click();

    }

    @Test
    public void Test7(){

        driver.navigate().to("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakealert= driver.findElement(By.id("fakealerttest"));
        fakealert.click();
        MyFunc.Bekle(1);
        WebElement modal= driver.findElement(By.id("modaldialog"));
        modal.click();
        MyFunc.Bekle(1);
        WebElement ok= driver.findElement(By.id("dialog-ok"));
        ok.click();
    }
    @Test
    public void Test8(){
        driver.navigate().to("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");
        WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(60));
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.id("normal-btn-success")));
        WebElement Nsuccess= driver.findElement(By.id("normal-btn-success"));
        Nsuccess.click();

        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[1]")));
        WebElement close= driver.findElement(By.xpath("(//button[@class='close'])[1]"));
        close.click();

WebElement disp= driver.findElement(By.xpath("(//div[@style='display: none;'])[2]"));
        Assert.assertTrue(disp.isEnabled());
    }

    @Test
    public void Test9(){
        driver.navigate().to("http://demo.seleniumeasy.com/bootstrap-alert-messages-demo.html");
        WebDriverWait waits=new WebDriverWait(driver,Duration.ofSeconds(60));
        waits.until(ExpectedConditions.visibilityOfElementLocated(By.id("normal-btn-success")));
        WebElement Nsuccess= driver.findElement(By.id("normal-btn-success"));
        Nsuccess.click();
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//button[@class='close'])[1]")));
        WebElement close= driver.findElement(By.xpath("(//button[@class='close'])[1]"));
        close.click();
        MyFunc.Bekle(1);
        WebElement disp= driver.findElement(By.xpath("(//div[@style='display: none;'])[2]"));
        MyFunc.Bekle(1);
        Assert.assertFalse(disp.isDisplayed());

    }
    @Test
    public void Test10(){
        driver.get("http://demo.seleniumeasy.com/basic-checkbox-demo.html");
        WebElement check= driver.findElement(By.id("check1"));
        check.click();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='Uncheck All']")));
        WebElement Uncheck= driver.findElement(By.xpath("//input[@value='Uncheck All']"));
        System.out.println(Uncheck.getAttribute("value"));

    }
    @Test
    public void Test11(){
int wednesday=0;
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");
        List<WebElement> days= driver.findElements(By.xpath("//select[@class='form-control']/option"));
        do {


            int random= (int) (Math.random() *days.size() );

            WebElement select= driver.findElement(By.xpath("//select[@class='form-control']"));
            select.click();
            MyFunc.Bekle(1);
            days.get(random).click();

            if (random==4){
                wednesday++;
            }

        }while(wednesday<5);
        System.out.println("carsamba secim sayisi = "+wednesday);

        Assert.assertEquals(5,wednesday);
    }

    @Test
    public void Test12(){

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        WebElement input= driver.findElement(By.xpath("//*[text()='Input Forms']"));
        input.click();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Ajax Form Submit'])[2]")));
        WebElement ajaxForm= driver.findElement(By.xpath("(//*[text()='Ajax Form Submit'])[2]"));

        ajaxForm.click();
        Actions actions=new Actions(driver);
        WebElement name= driver.findElement(By.id("title"));
        actions.moveToElement(name).click().sendKeys("emrah").build().perform();

        WebElement comment= driver.findElement(By.id("description"));
        actions.moveToElement(comment).click().sendKeys("TechnoStudy").build().perform();

        WebElement submit= driver.findElement(By.id("btn-submit"));
        actions.moveToElement(submit).click().build().perform();

        WebElement text= driver.findElement(By.xpath("//*[text()='Form submited Successfully!']"));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Form submited Successfully!']")));

        Assert.assertTrue(text.isDisplayed());

    }

    @Test
    public void Test13(){
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        Actions actions=new Actions(driver);
        WebElement listbox= driver.findElement(By.xpath("//*[text()='List Box']"));
        actions.moveToElement(listbox).click().build().perform();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));

        WebElement bootsrap=wait.until(ExpectedConditions.visibilityOfElementLocated((By.xpath("(//*[text()='Bootstrap List Box'])[2]"))));
        actions.moveToElement(bootsrap).click().build().perform();

        WebElement Bduallist=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='bootstrap-duallist ']")));
        actions.moveToElement(Bduallist).click().build().perform();
        WebElement Dapibus= driver.findElement(By.xpath("(//li[text()='Dapibus ac facilisis in'])[1]"));
        actions.moveToElement(Dapibus).click().build().perform();

        WebElement toRight= driver.findElement(By.xpath("//span[contains(@class,'right')]"));
        WebElement toLeft= driver.findElement(By.xpath("//span[contains(@class,'left')]"));
        actions.moveToElement(toRight).click().build().perform();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='bootstrap-duallist ']")));

        WebElement BduallistRight=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='bootstrap-duallist ']")));
        actions.moveToElement(BduallistRight).click().build().perform();
        WebElement DapibusRight= driver.findElement(By.xpath("(//li[text()='Dapibus ac facilisis in'])[2]"));
        actions.moveToElement(DapibusRight).click().build().perform();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

        WebElement Crast=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Cras justo odio']")));
        WebElement Morbi=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Morbi leo risus'])[1]")));

        WebElement DapibusLeft= driver.findElement(By.xpath("(//li[text()='Dapibus ac facilisis in'])[1]"));


        actions.moveToElement(Crast).click().build().perform();
        actions.moveToElement(Morbi).click().build().perform();
        actions.moveToElement(DapibusLeft).click().build().perform();
        actions.moveToElement(toLeft).click().build().perform();

    }
    @Test
    public void Test14(){
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        Actions actions=new Actions(driver);
        WebElement message= driver.findElement(By.xpath("//input[@id='user-message']"));
        actions.moveToElement(message).click().sendKeys("TechnoStudy").build().perform();

        WebElement showMessage= driver.findElement(By.xpath("//button[@onclick='showInput();']"));
        actions.moveToElement(showMessage).click().build().perform();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));

        WebElement Mymessage= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@id='display']")));

        System.out.println(Mymessage.getText());


    }
    @Test
    public void Test15(){
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        Actions actions=new Actions(driver);
        WebElement number1= driver.findElement(By.id("sum1"));
        actions.moveToElement(number1).click().sendKeys("123").build().perform();

        WebElement number2 = driver.findElement(By.id("sum2"));
        actions.moveToElement(number2).click().sendKeys("321").build().perform();

        WebElement total= driver.findElement(By.cssSelector("[onclick='return total()']"));
        actions.moveToElement(total).click().build().perform();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));

        WebElement result=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("displayvalue")));
        System.out.println(result.getText());

        Assert.assertEquals("444", result.getText());

    }
    @Test
    public void Test16(){

        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        Actions actions=new Actions(driver);

        WebElement inputForms=driver.findElement(By.xpath("//a[text()='Input Forms']"));
        actions.moveToElement(inputForms).click().build().perform();

        WebElement radioForm= driver.findElement(By.xpath("(//a[text()='Radio Buttons Demo'])[2]"));
        actions.moveToElement(radioForm).click().build().perform();

        WebElement checked=driver.findElement(By.id("buttoncheck"));
        actions.moveToElement(checked).click().build().perform();

        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));

        WebElement notChecked=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='radiobutton']")));

        System.out.println(notChecked.getText());//Radio button is Not checked
        Assert.assertTrue(notChecked.getText().contains("Radio button is Not checked"));

        WebElement maleInput= driver.findElement(By.cssSelector("[value='Male'][name='optradio']"));
        actions.moveToElement(maleInput).click().build().perform();

        actions.moveToElement(checked).click().build().perform();

        WebElement maleChecked=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='radiobutton']")));

        System.out.println(maleChecked.getText());
        Assert.assertTrue(maleChecked.getText().contains("Radio button 'Male' is checked"));

        WebElement Female= driver.findElement(By.xpath("(//input[@value='Female'])[1]"));
        actions.moveToElement(Female).click().build().perform();
        actions.moveToElement(checked).click().build().perform();

        WebElement femaleInput=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='radiobutton']")));
        System.out.println(femaleInput.getText());
        Assert.assertTrue(femaleInput.getText().contains("Radio button 'Female' is checked"));




    }
    @Test
    public void Test17(){
        driver.get("http://demo.seleniumeasy.com/basic-first-form-demo.html");
        Actions actions=new Actions(driver);
        WebElement inputForms= driver.findElement(By.xpath("//*[text()='Input Forms']"));
        actions.moveToElement(inputForms).click().build().perform();
        WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
        WebElement radioButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[text()='Radio Buttons Demo'])[2]")));
        actions.moveToElement(radioButton).click().build().perform();
        WebElement MMale=driver.findElement(By.xpath("(//input[@value='Male'])[2]"));
        actions.moveToElement(MMale).click().build().perform();
        WebElement MAge= driver.findElement(By.xpath("(//input[@value='0 - 5'])"));
        actions.moveToElement(MAge).click().build().perform();
        WebElement getV= driver.findElement(By.xpath("//*[text()='Get values']"));
        actions.moveToElement(getV).click().build().perform();
        WebElement Vtext=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class='groupradiobutton']")));
        System.out.println(Vtext.getText());
        System.out.println("***************************");
        WebElement MAge2= driver.findElement(By.xpath("(//input[@value='5 - 15'])"));
        actions.moveToElement(MAge2).click().build().perform();
        actions.moveToElement(getV).click().build().perform();
        System.out.println(Vtext.getText());
        System.out.println("***************************");
        WebElement MAge3= driver.findElement(By.xpath("(//input[@value='15 - 50'])"));
        actions.moveToElement(MAge3).click().build().perform();
        actions.moveToElement(getV).click().build().perform();
        System.out.println(Vtext.getText());
        System.out.println("***************************");
        WebElement Female=driver.findElement(By.cssSelector("[value='Female'][name='gender']"));
        actions.moveToElement(Female).click().build().perform();
        WebElement FAge= driver.findElement(By.xpath("(//input[@value='0 - 5'])"));
        actions.moveToElement(FAge).click().build().perform();
        actions.moveToElement(getV).click().build().perform();
        System.out.println(Vtext.getText());
        System.out.println("***************************");
        WebElement FAge2= driver.findElement(By.xpath("(//input[@value='5 - 15'])"));
        actions.moveToElement(FAge2).click().build().perform();
        actions.moveToElement(getV).click().build().perform();
        System.out.println(Vtext.getText());
        System.out.println("***************************");
        WebElement FAge3= driver.findElement(By.xpath("(//input[@value='15 - 50'])"));
        actions.moveToElement(FAge3).click().build().perform();
        actions.moveToElement(getV).click().build().perform();
        System.out.println(Vtext.getText());
    }
    @Test
    public void Test18(){
        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");
        Actions actions=new Actions(driver);
        WebElement task= driver.findElement(By.id("task-table-filter"));
        actions.moveToElement(task).click().sendKeys("in progress").build().perform();


WebElement inprogress= driver.findElement(By.xpath("//table[@class='table table-hover']/tbody"));
        System.out.println(inprogress.getText());

    }@Test
    public void Test19(){

        driver.get("http://demo.seleniumeasy.com/table-search-filter-demo.html");
        WebElement FN=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].removeAttribute('disabled')",FN);
        FN.click();

        FN.sendKeys("an");

        List<WebElement> list=driver.findElements(By.xpath("//table[@class='table']//tr"));

        for (WebElement webElement : list) {
            if (webElement.getText().equals("")) {
                continue;
            }
            String[] name = webElement.getText().split(" ");


            System.out.println(name[2]);


        }




    }

    @Test
    public void Test20() {
driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");


        List<WebElement> takimlar=driver.findElements(By.xpath("//table[@style='text-align:right;']//td[contains(@style,'left')]"));
        for (WebElement t:takimlar){
            System.out.println(t.getText());
        }
    }
    @Test
    public void Test21(){
        
        driver.get("https://en.wikipedia.org/wiki/FIFA_World_Cup");
    WebElement Atitle= driver.findElement(By.xpath("(//td[@class='infobox-data']//a)[3]"));
    Atitle.click();
WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));

WebElement participation=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//td[@class='infobox-data'])[13]")));
        System.out.println("Argentina participation = "+participation.getText().substring(0,2));

    }


}
