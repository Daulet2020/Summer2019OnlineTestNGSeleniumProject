package tests.VyTrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowsersUtils;
public class VyTrackNegative {
    public static void main(String[] args) {
        //chrome driver will be used to connect with browser
        WebDriver driver = BrowserFactory.getDriver("chrome");
        //will open the url vytrack website
        driver.get("https://qa2.vytrack.com/user/login");
        //findElement byname :to get the log in box
        WebElement username=driver.findElement(By.name("_username"));
        BrowsersUtils.wait(3);
        //sendkeys to enter username
        username.sendKeys("elisa");
        BrowsersUtils.wait(3);
        //findElement byname :to get the password box
        WebElement password =driver.findElement(By.name("_password"));
        //sendKeys: to enter the password
        BrowsersUtils.wait(3);
        password.sendKeys("123456");
        WebElement login=driver.findElement(By.id("_submit"));
        BrowsersUtils.wait(3);
        //to login the page
        login.click();
        String expectedMessage="Invalid user name or password.";
        WebElement ActualMessage = driver.findElement(By.xpath("//div[@class='alert alert-error']"));
        if(ActualMessage.equals(expectedMessage)) {
            System.out.println("Invalid password and test passes");
        }
        else {
            System.out.println("Test failed");
        }
        BrowsersUtils.wait(4);
        driver.quit();
    }
}
