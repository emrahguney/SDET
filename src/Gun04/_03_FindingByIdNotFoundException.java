package Gun04;

import Utility.MyFunc;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _03_FindingByIdNotFoundException{
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://form.jotform.com/221934510376353");
try {
    WebElement labelFirstName = driver.findElement(By.id("hataliLocator"));
    //Exception in thread "main" org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {"method":"css selector","selector":"#hataliLocator"}
    //Locator u(By.id kismi) hatali verdik boyle hata verdi
    //  System.out.println("labelFirstName = " + labelFirstName.getText());
}catch (Exception ex){
    System.out.println("WebElement bulunamadi = "+ex.getMessage());
}

        MyFunc.Bekle(3);
        driver.quit();
        driver.close();
    }
}
