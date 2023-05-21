package Gun14;

import Utility.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class dsa extends BaseDriver {


    @Test
    public void TEST(){

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username= driver.findElement(By.name("username"));
        username.sendKeys("Admin");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement loginButton= driver.findElement(By.xpath("//button[@type='submit']"));
        loginButton.click();

        WebElement nameText= driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']"));
        System.out.println(nameText.getText());
        String name=nameText.getText();
        WebElement admin= driver.findElement(By.xpath("//span[text()='Admin']"));
        admin.click();
        WebElement addButton= driver.findElement(By.xpath("//button[text()=' Add ']"));
        addButton.click();

        WebElement employee= driver.findElement(By.xpath("//div[@class='oxd-form-row']//input"));
        employee.sendKeys(name);
        WebElement a=driver.findElement(By.xpath("//div[role='listbox']//"));
        a.click();

    }

}
