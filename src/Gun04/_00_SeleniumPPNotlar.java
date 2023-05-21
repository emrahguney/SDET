package Gun04;

public class _00_SeleniumPPNotlar {
    public static void main(String[] args) {
        /*
       1) Selenium la yapacağımız işlemlerin özeti
       (a)    Siteyi/Sayfayı aç

	(b)    Eleman bul
	(c)    Bu elemana işlemlerini yaptır
             ......
        	    (i)     Eleman bul
                (i+1) Bu elemanla işlemlerini yaptır.
                (i+2) Doğrulama / Assert ile sonuçlandır

2) SITEYI ACMA
driver.get("website URL");
driver.quit(); //bu komutu bir alternatifi de close() dur.
quit(): bütün açılmış tarayıcıları kapatır.
close(): sadece aktif olanı kapatır.

THREAD.SLEEP->Thread.sleep(3000); // 3 saniye bekle ? ->Bu komutu sadece debug yaparken kullanacağız.
İş görüşmelerinde bu komuttan bahsetmiyoruz.Alternatifleri var onlar ilerde anlatılacak.

3)ELEMAN BULMA
driver.findElement(By.);->komutu ile buluruz

Eleman bulmak için By.  dan sonra aşağıdaki metodları kullanacağız.
-id
-name
-className
-linkText
-PartialLinkText
-Tag name
-Css selector
-Xpath

Eleman bulunamazsa hata üretir.

driver.findElement(By.id("id"));
driver.findElement(By.name("name"));
driver.findElement(By.className("class name buraya yazılır"));
driver.findElement(By.linkText("linkin tam text i buraya yazılır"));
driver.findElement(By.partialLinkText("linkin text inin bir parçası"));
driver.findElement(By.tagName("tagAdı"));
driver.findElement(By.cssSelector("tagAdı[özellikAdi=‘değer’]"));
driver.findElement(By.xpath("//tagAdı[@özellikAdi=‘değer’]"));

4)ELEMANLAR BULMA
driver.findElements(By.);

Bulunulan sayfadaki verilen kritere göre bütün elelamanları bulur.
Bulamazsa list i boş oalrak döndürür.

List<WebElement> elements = driver.findElements(By.tagName("li"));
for (WebElement element: elements) {
System.out.println(element.getText());
}

5)ELEMANIN TEXT INI ALMA VE CLICK

WebElement submitButton = driver.findElement(By.id("id"))
String text = submitButton.getText(); // görünen text ini verir
Elemana Click yapmak için ise;
submitButton.click();

6)ELEMANIN OZELLIKLERINI ALMA
WebElement submitButton = driver.findElement(By.id("id"))
String deger = submitButton.getAttribute("özellikeAdı");

Yok ise null değeri döndürür.

7)driver.navigate.to("url") ve driver.get("url")

driver.navigate.to :

geçmişi tutabiliyor, back ve next yapabiliyoruz.
sayfanın tümünün yüklenmesini beklemez.
driver.navigate.back;
driver.navigate.forward;

driver.get :
geçmişi tutmaz.
Sayfanın tümünün yüklenmesini bekler.


















          */
    }
}
