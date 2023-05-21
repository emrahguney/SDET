package _0JavaScriptExecutorKodlari;

public class Kodlar {
    public static void main(String[] args) {
        /*
         1)Wait: Selenium, elementin sayfaya yüklenmesi için birkaç saniye beklemesi gerektiğinden, bazen beklemeniz gerekebilir. Bunun için WebDriverWait kullanabilirsiniz:

            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("elementId")));
            element.sendKeys("Your text");

        2)JavaScript Executor: JavaScript ile elementin görünür hale getirilmesi de bir çözüm olabilir. Bunu JavascriptExecutor kullanarak yapabilirsiniz:
                WebElement element = driver.findElement(By.id("elementId"));
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", element);
            element.sendKeys("Your text");

          3)Iframe: Eğer hata bir iframe'de meydana geliyorsa, iframe'e geçiş yapmanız gerekebilir:
            driver.switchTo().frame("frameName");
WebElement element = driver.findElement(By.id("elementId"));
element.sendKeys("Your text");
driver.switchTo().defaultContent();

    4)Disable ise ne yapilir(BU ONEMLI)

    "Etkin olmayan" (disabled) bir element, kullanıcının etkileşime geçemeyeceği bir elementdir. Bu nedenle, bu tür elementlere veri göndermek veya tıklamak mümkün değildir.

    Ancak, bazı durumlarda, disabled özelliği kaldırarak etkileşimde bulunmak mümkün olabilir. Bu özellik, sayfanın tasarımına ve kullanılan web teknolojisine bağlı olarak değişebilir.

    Örneğin, bir düğme öğesinin etkin olmamasını kaldırmak için aşağıdaki adımları takip edebilirsiniz:

    4.1)Sayfanın kaynak kodunu inceleyerek, etkileşim yapmak istediğiniz elementin HTML öğesini ve özelliklerini belirleyin. Etkin olmayan bir düğme öğesi için HTML'de disabled özelliği kullanılır.

    4.2)Selenium WebDriver kullanarak elementi seçin.

    WebElement element = driver.findElement(By.id("elementId"));

    4.3)JavaScript Executor kullanarak, elementin "disabled" özelliğini kaldırın.

    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].removeAttribute('disabled')", element);

    4.4)Şimdi, seçili element üzerinde etkileşim yapabilirsiniz.

    element.click();
    element.sendKeys("Your text");

    5)Sayfanın Scroll Edilmesi:
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("window.scrollBy(0, 500)");

    6)Elementin Görünür Hale Getirilmesi:

    WebElement element = driver.findElement(By.id("elementId"));
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].scrollIntoView(true);", element);

    Bu örnek kod, belirtilen "elementId" ile belirtilen HTML öğesinin görünür hale getirilmesini sağlar.

    7)Alert Kutusu Kapatma:

    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("window.alert = function(){};");

    Bu örnek kod, bir alert kutusu açıldığında, alert kutusunu kapatır ve sayfanın işlevselliğini sürdürür.

    8)Elementin Özelliklerinin Değiştirilmesi:

    WebElement element = driver.findElement(By.id("elementId"));
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("arguments[0].setAttribute('value', 'Your Text')", element);

    Bu örnek kod, belirtilen "elementId" ile belirtilen HTML öğesinin "value" özelliğinin "Your Text" ile değiştirilmesini sağlar.

    9)Yeni Sayfa Açma:

    JavascriptExecutor executor = (JavascriptExecutor) driver;
    executor.executeScript("window.open('https://www.example.com/','_blank');");

    Bu örnek kod, yeni bir pencere açar ve "https://www.example.com/" adresine yönlendirir.
JavaScript Executor, bazı işlemler için faydalı bir araçtır.
Ancak, sayfanın güvenliğini riske atabileceği ve beklenmedik sonuçlara neden olabileceği için, doğru şekilde kullanılmalıdır.

    10)Sayfa yenileme:

        JavascriptExecutor executor = (JavascriptExecutor) driver;
        executor.executeScript("location.reload()");

    11)Elementin genişliği ve yüksekliğinin alınması:

    WebElement element = driver.findElement(By.id("elementId"));
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    Long height = (Long) executor.executeScript("return arguments[0].clientHeight;", element);
    Long width = (Long) executor.executeScript("return arguments[0].clientWidth;", element);

Bu örnek kod, belirtilen "elementId" ile belirtilen HTML öğesinin genişliği ve yüksekliğinin alınmasını sağlar.

    12)Elementin sayfanın en üstünde olup olmadığını kontrol etme:

    WebElement element = driver.findElement(By.id("elementId"));
JavascriptExecutor executor = (JavascriptExecutor) driver;
Boolean isAtTop = (Boolean) executor.executeScript("return arguments[0].getBoundingClientRect().top == 0;", element);

Bu örnek kod, belirtilen "elementId" ile belirtilen HTML öğesinin sayfanın en üstünde olup olmadığını kontrol eder.

    13)Sayfanın tamamının kaydırılması:

    JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("window.scrollTo(0, document.body.scrollHeight)");

Bu örnek kod, sayfanın en altına kaydırır.

14)Sayfadaki tüm linklerin açılması:

JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("var links = document.getElementsByTagName('a');" +
                       "for(var i=0; i<links.length; i++){" +
                       "links[i].target='_blank';" +
                       "links[i].click();}");

Bu örnek kod, sayfadaki tüm linklerin yeni bir pencerede açılmasını sağlar.

15)Elementin arka plan renginin değiştirilmesi:

WebElement element = driver.findElement(By.id("elementId"));
JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("arguments[0].style.backgroundColor = 'yellow';", element);

16)Sayfanın başına dönülmesi:

JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("window.scrollTo(0, 0)");

17)Alert kutusuna metin gönderme:

JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("window.prompt('Please enter your name:', 'Your name here');");

18)Elementin "title" özelliğinin değiştirilmesi:

WebElement element = driver.findElement(By.id("elementId"));
JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("arguments[0].setAttribute('title', 'new title');", element);

Bu örnek kod, belirtilen "elementId" ile belirtilen HTML öğesinin "title" özelliğini "new title" olarak değiştirir.

19)Elementin görünürlüğünün değiştirilmesi:

WebElement element = driver.findElement(By.id("elementId"));
JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("arguments[0].style.display = 'none';", element);

Bu örnek kod, belirtilen "elementId" ile belirtilen HTML öğesinin görünürlüğünü kaldırır.

20)Elementin kaybolmasını beklemek için bir "wait" işlevi oluşturma:

public void waitForElementToDisappear(By locator) {
    JavascriptExecutor executor = (JavascriptExecutor) driver;
    WebDriverWait wait = new WebDriverWait(driver, 10);
    wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
}
Bu örnek kod, belirtilen "locator" ile belirtilen öğenin kaybolmasını bekleyen bir "wait" işlevi oluşturur.

21)Sayfanın yavaşça kaydırılması:

JavascriptExecutor executor = (JavascriptExecutor) driver;
executor.executeScript("window.scrollTo(0, document.body.scrollHeight);");
Thread.sleep(2000);
executor.executeScript("window.scrollTo(0, 0);");

Bu örnek kod, sayfanın en altına yavaşça kaydırır, 2 saniye bekleme yapar ve sonra sayfanın en üstüne yavaşça kaydırır.




















        */
    }
}
