package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _02_FindingById {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");//sayfaya gittik

        /*eleman aramakutusu = aramakutusunu bul;*/
        WebElement name= driver.findElement(By.id("first_8"));//elemani id ILE bul

        //aramakutusu.yaziGonder("usb");
       name.sendKeys("emrah");//kutucuklara yazi gonderme

        WebElement surname=driver.findElement(By.id("last_8"));
        surname.sendKeys("guney");

        MyFunc.Bekle(1);
      //  name.clear();//name deki ismi siler
        MyFunc.Bekle(1);
       // surname.clear();//surname deki ismi siler
        MyFunc.Bekle(1);
        //Chrome da sagtik incele dedikten sonra;
        // Chrome da ctrl+f ye basıldığında inspect bölümünde(inspect bolumu aktifken) arama kutusunu acar
        // first_name yazarsak bütün kelimelerde arar
        // #first_name yazarsak bütün ID paramtrelerinde arar
        //LABELID
        WebElement labelFirstName=driver.findElement(By.id("sublabel_8_first"));
        System.out.println("labelFirstName = " + labelFirstName.getText());

        WebElement labellastname=driver.findElement(By.id("sublabel_8_last"));
        System.out.println("labellastname = " + labellastname.getText());
        MyFunc.Bekle(2);
        //BUTTONID
        WebElement submitButton= driver.findElement(By.id("input_2"));
        submitButton.click();//clearlari kaldirman lazim
        MyFunc.Bekle(2);

        driver.quit();
    }
}
//chrome da incele dedikten sonra html kodlarinda arama yapabilirsin html acikkken, aktifken "ctrl+f" e basarsan asagida bir kutucuk acilir(locator)(Find by string... diye yaziyor kutucukta)
//mesela bir ismi girince ornegin first_8 yazinca birden fazla sonuc cikabilir ama biz id olan first_8 i bulmak istiyoruz onun icinde arama kutusuna "#first_8 " olarak yazariz
//arama kutusunda basina "#" bu isareti koyup aramak istedigimiz kodu yazarsak o kodu sadece id kisimlarda olan kodu veya kodlari gosterir,arar.
// Yani kisaca "#"bunun anlami arama kutusunda "id " olarak gecer
//classlari aramada ise "." basina koyarak arariz
