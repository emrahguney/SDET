package Gun14;

import Utility.BaseDriver;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

public class _01_EkranKaydet extends BaseDriver {
    @Test
    public  void Test1() throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");

        WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("emrah");

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("1234");

        WebElement submit= driver.findElement(By.cssSelector("button[type='submit']"));
        submit.click();

        //hata
        List<WebElement> hataMesaji=driver.findElements(By.cssSelector("div[role='alert']"));

        if (hataMesaji.size()>0){
            //hata varsa ekran kaydet
            System.out.println("Hata olustu");
            TakesScreenshot ts=(TakesScreenshot) driver;//1.Asama ekran goruntu alma degiskenini tanimladim
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE);//2. asama ekran goruntusu alindi,hafizada suan

            //hafizadaki bu bilgiyi dosya olarak kaydetme islemine geldik
           FileUtils.copyFile(hafizadakiHali,new File("C:\\Users\\Monster\\IdeaProjects\\SDET5\\hata\\screenshot.png"));
           //3.Asama hafizadaki bu bilgiyi dosya olarak verilen path e kaydet

        }
        //TODO: burada her hata da ayni dosyayi yeniliyor ve uzerine yaziyor.Biz istiyoruzki her dosya ayri olsun yani her kayit ayri olsun bunu nasil yaparsiniz
        //      LocalDateTime alıcaksın bilgileri
        //      YılAyGunSaatDakikaSan -> 2022_10_07_1319_20.png

        BekleKapat();

    }
}
