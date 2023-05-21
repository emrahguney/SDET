package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.tracing.opentelemetry.SeleniumSpanExporter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _03_HaftaSonuOdevi extends BaseDriver {
    //driver.get("https://www.saucedemo.com/");
    //1.odev)Bu siteden 3 tane random urun secilecek ve toplamlar kontrol edilecek

    @Test
    public  void Test() {

        driver.navigate().to("https://www.saucedemo.com/");
        WebElement userName= driver.findElement(By.xpath("//input[@id='user-name']"));
        userName.sendKeys("standard_user");
        MyFunc.Bekle(1);
        WebElement Password= driver.findElement(By.xpath("//input[@id='password']"));
        Password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);

        WebElement LoginButton= driver.findElement(By.xpath("//input[@id='login-button']"));
        LoginButton.click();
        MyFunc.Bekle(1);
//GIRIS TAMAM

List<WebElement> urunResimleri=driver.findElements(By.xpath("//a[contains(@id,'img_link')]"));

    int[] urunResim = new int[urunResimleri.size()];

    int sayi = 0;
//urun resimlerini sayiya at

    for (int i = 0; i < urunResim.length; i++) {
        if (urunResimleri.get(i).getAttribute("id").contains("img_link")) {

            sayi= i;
            urunResim[i] = sayi;
        }
    }

        System.out.println(Arrays.toString(urunResim));

    ArrayList<Integer> sayilar = new ArrayList<>();
    for (int i = 0; i < urunResim.length+1; i+=0) {
        int random = (int) (Math.random() * urunResim.length);

        if (sayilar.contains(urunResim[random])) {
            continue;
        } else sayilar.add(urunResim[random]);

        if (sayilar.size() == 6) {
            break;
        }

    }

        System.out.println("sayilar="+sayilar);
    //BURAYA KADAR TAMAM

   for (int i = 0; i < urunResim.length; i++) {

        MyFunc.Bekle(1);
        if(urunResimleri.get(sayilar.get(i)).getAttribute("id").contains("img_link")){
            urunResimleri.get(sayilar.get(i)).click();
        }
       for (int j = 0; j <1 ; j++) {


        MyFunc.Bekle(1);
        WebElement urunKabul = driver.findElement(By.xpath("//*[contains(@class,'btn_primary')]"));
        WebElement urunRed;
        WebElement backToProducts = driver.findElement(By.xpath("//img[@class='back-image']"));
        MyFunc.Bekle(1);
        if (urunKabul.getAttribute("class").contains("btn_primary")) {
            urunKabul.click();
            MyFunc.Bekle(1);

        }
        MyFunc.Bekle(1);
        driver.navigate().back();
       MyFunc.Bekle(1);
        //backToProducts.click();

   }
    }

}
    }

