package Gun10;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import sun.text.normalizer.Utility;

public class _01_ActionHoverOverSoru extends BaseDriver {
    @Test
    public void Test() {
//     https://www.etsy.com/ sayfasına gidiniz.
//    Jewellery -> Neckless -> Bib Neckless click
//    tıklatma işleminden sonra URL de
//    bib-necklaces kelimesinin geçtiğini doğrulayın.

        /*Cookies cikarsa;
        List<WebElement> cookiesAccept= driver.findElements(By.cssSelector("[class='wt-btn wt-btn--filled wt-mb-xs-0']"));
        if (cookiesAccept.size() > 0) // varsa
            cookiesAccept.get(0).click(); // kapat, tıklat
        */
        driver.get("https://www.etsy.com/");
        WebElement element1= driver.findElement(By.xpath("//span[@id='catnav-primary-link-10855']"));
        MyFunc.Bekle(1);
        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar.moveToElement(element1).build();
        aksiyon.perform();
        MyFunc.Bekle(1);
        WebElement necklaces= driver.findElement(By.xpath("//span[@id='side-nav-category-link-10873']"));
        MyFunc.Bekle(1);
        //Actions aksiyonlar1=new Actions(driver);
        MyFunc.Bekle(1);

        Action aksiyon1=aksiyonlar.moveToElement(necklaces).build();
        aksiyon1.perform();
        MyFunc.Bekle(1);

        WebElement bibneck= driver.findElement(By.xpath("//a[@id='catnav-l3-10881']"));
        bibneck.click();
        MyFunc.Bekle(1);

        //WebElement bibText= driver.findElement(By.xpath("//h1[@class='wt-text-heading-01 wt-display-inline wt-mb-xs-2 wt-overflow-hidden']"));
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("bib-necklaces"));

BekleKapat();

    }
}
