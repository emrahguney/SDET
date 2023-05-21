package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class _01_OpeningWebsite {
    public static void main(String[] args)  {
        //1-Hepsiburada.com sayfasina git
        //2- arama kutusununa usb yaz
        //3-Ara butonuna bas
        //4-Cikan urunlerin aciklamasinda USB kelimesini kontrol.

        WebDriver xxx=new ChromeDriver();
        xxx.get("https://www.google.com");
        //bu asagidaki kodlari "xxx" den isteyecegiz

        //eleman aramakutusu = aramakutusunu bul;
        //aramakutusu.yaziGonder("usb");
        //elemanlar= urunListesiniAl;
        //for dongusu ile kontrol et

//elemanin konumunu(class,id,name, type...) bulmaya Locator denir

        xxx.quit();
        MyFunc.Bekle(5);

    }
}
