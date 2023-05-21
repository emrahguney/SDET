package Gun08;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.*;

public class Soru extends BaseDriver {

    @Test
    public void Test()
    {driver.navigate().to("https://www.saucedemo.com/");
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

        //SIMDI ELEMANLARI RASTGELE EKLEME

        List<WebElement> products=driver.findElements(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        //System.out.println(products.size());
int shop=0;


int[] rastg =new int[products.size()];
int sayi=0;
        for (int i = 0; i < rastg.length ; i++) {
         if (products.get(i).getAttribute("class").contains("btn btn_primary")){
             sayi=i;
             rastg[i]=sayi;
         }

        }System.out.println("rastg = " + Arrays.toString(rastg));

        ArrayList<Integer> rast=new ArrayList<>();
        for (int i = 0; i < rastg.length ; i++) {
            int random= (int) (Math.random() * rastg.length);
            if (rast.contains(rastg[random])){
                continue;
            }else rast.add(rastg[random] );

            if (rast.size()==3){
                break;
            }

        }

        System.out.println(rast);




      for (int i = 0; i < rast.size() ; i++) {


            MyFunc.Bekle(1);

            products.get(rast.get(i)).click();
            MyFunc.Bekle(1);

           // WebElement shopping=driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
          /*  shop=Integer.parseInt(shopping.getText());

            if (shop==3){
                break;
            }*/

        }








































       /* int random=(int)(Math.random()* products.size());
        products.get(random).click();
        MyFunc.Bekle(1);
        WebElement addToCart= driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
        addToCart.click();
        MyFunc.Bekle(1);
        WebElement backToProducts= driver.findElement(By.xpath("//button[@id='back-to-products']"));
        backToProducts.click();
        MyFunc.Bekle(1);
        WebElement badge=driver.findElement(By.xpath("//span[@class='shopping_cart_badge']"));
        Integer intBadge=Integer.parseInt(badge.getText());
        MyFunc.Bekle(1);
        do {if ((addToCart.equals(driver.findElement((By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory']")))))) {
            continue;
        }
            products.get(random).click();
            MyFunc.Bekle(1);
            if ((addToCart.equals(driver.findElement((By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory']")))))){
                continue;
            }MyFunc.Bekle(1);
            backToProducts.click();
            MyFunc.Bekle(1);

            }while(intBadge<6);*/

    }
}
