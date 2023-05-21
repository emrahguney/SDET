package Gun07;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Optional;

public class TestHomeWork extends BaseDriver {

    @Test
    public  void test() {
    driver.navigate().to("https://www.saucedemo.com/");//driver.get("https://www.saucedemo.com/"); dersende olur
        WebElement username= driver.findElement(By.xpath("//*[@class='form_group']/input[@class='input_error form_input' and @placeholder='Username']"));
        username.sendKeys("standard_user");
        MyFunc.Bekle(1);
        WebElement password= driver.findElement(By.xpath("//*[@class='form_group']/input[@placeholder='Password']"));
        password.sendKeys("secret_sauce");
        MyFunc.Bekle(1);
        WebElement login=driver.findElement(By.xpath("//*[@type='submit']"));
        login.click();
        MyFunc.Bekle(1);
        WebElement SLBackpack=driver.findElement(By.xpath("//*[@class='inventory_item_img']/a/img[@alt='Sauce Labs Backpack']"));
        SLBackpack.click();
        MyFunc.Bekle(1);
        WebElement SLBackpackAdd= driver.findElement(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory']"));
        SLBackpackAdd.click();
        MyFunc.Bekle(1);

        WebElement Back= driver.findElement(By.xpath("//*[@class='btn btn_secondary back btn_large inventory_details_back_button']"));//driver.navigate().back(); diyebiliriz
        Back.click();MyFunc.Bekle(1);
        WebElement SLBTshirt= driver.findElement(By.xpath("//*[@class='inventory_item_img']/a/img[@alt='Sauce Labs Bolt T-Shirt']"));
        SLBTshirt.click();MyFunc.Bekle(1);
        WebElement SLBTshirtAdd= driver.findElement(By.xpath("//*[@class='btn btn_primary btn_small btn_inventory']"));
        SLBTshirtAdd.click();MyFunc.Bekle(1);
        WebElement Back2= driver.findElement(By.xpath("//*[@class='btn btn_secondary back btn_large inventory_details_back_button']"));
        Back2.click();MyFunc.Bekle(1);
        WebElement shopLink= driver.findElement(By.xpath("//*[@class='shopping_cart_link']"));
        shopLink.click();MyFunc.Bekle(1);
        WebElement checkOut= driver.findElement(By.xpath("//*[@class='btn btn_action btn_medium checkout_button']"));
        checkOut.click();MyFunc.Bekle(1);
        WebElement FN= driver.findElement(By.xpath("//*[@class='form_group']/input[@placeholder='First Name']"));
        FN.sendKeys("NAME");
        MyFunc.Bekle(1);
        WebElement LN= driver.findElement(By.xpath("//*[@class='form_group']/input[@placeholder='Last Name']"));
        LN.sendKeys("LASTNAME");
        MyFunc.Bekle(1);
        WebElement ZIP= driver.findElement(By.xpath("//*[@class='form_group']/input[@placeholder='Zip/Postal Code']"));
        ZIP.sendKeys("735560");
        MyFunc.Bekle(1);
        WebElement CONTINUE= driver.findElement(By.xpath("//*[@type='submit']"));
        CONTINUE.click();
        MyFunc.Bekle(1);

        WebElement S1= driver.findElement(By.xpath("(//*[@class='inventory_item_price'])[1]"));
        WebElement S2=driver.findElement(By.xpath("(//*[@class='inventory_item_price'])[2]"));
        Double s1=Double.parseDouble(S1.getText().substring(1));
        Double s2=Double.parseDouble(S2.getText().substring(1));

        double price=s1+s2;


        WebElement itemTotal= driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        double it=  Double.parseDouble(itemTotal.getText().substring(13));
        WebElement itemtax=driver.findElement(By.xpath("//*[@class='summary_tax_label']"));
        double tax=Double.parseDouble(itemtax.getText().substring(6));
        WebElement total= driver.findElement(By.xpath("//*[@class='summary_total_label']"));
        double totalP=Double.parseDouble(total.getText().substring(8));
        double iTax=it + tax;

        Assert.assertEquals("testfail1", totalP, iTax, 0.0);
        Assert.assertEquals("testfail2", it, price,0.0);

        Assert.assertTrue("testfail3", (totalP== iTax));
        Assert.assertTrue("testfail4", (it== price));

        BekleKapat();

    }

}
/*1- https://www.saucedemo.com/
2- login işlemini yapınız.

3- Sauce Labs Backpack  a tıklatın ve sepete ekletin.
4- Sonra geri dönün (Back to products e tıklatın)

5- Sauce Labs Bolt T-Shirt  a tıklatın ve sepete ekleyin.
6- sepete tıklatın
7- CheckOut a tıklatın

8- kullanıcı bilgilerini doldurup Continue ya tıklatın-->
9- Burada her bir eşyanın ücretlerinin toplamının aşağıdaki
   Item total e eşit olup olmadığını Assert ile test ediniz.

   Bu soruda tamamen xPath kullanilacaktir
*/