package tests.VyTrack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class LoginPage {


    public static class loginPage {
        public static void main(String[] args) {
            WebDriver driver = BrowserFactory.getDriver("chrome");
            driver.get("https://qa2.vytrack.com/user/login");
           //By NAME
             WebElement input = driver.findElement(By.name("_username"));
            //BY ID
            //WebElement input = driver.findElement(By.id("prependedInput"));
            input.sendKeys("user192");
            System.out.println(input.getAttribute("value"));
            //BY NAME
            WebElement input2 = driver.findElement(By.name("_password"));
            //BY ID
            //WebElement input2 = driver.findElement(By.id("prependedInput2"));
            input2.sendKeys("UserUser123");
            System.out.println(input2.getAttribute("value"));
            WebElement button = driver.findElement(By.name("_submit"));
           // WebElement button = driver.findElement(By.id("_submit"));
            button.click();
            String expectedUrl = "https://qa2.vytrack.com/";
            if(driver.getCurrentUrl().equals(expectedUrl)){
                System.out.println("Test Passed, You are on the Home Page");
            }else {
                System.out.println("Test Failed");
            }

            driver.close();
        }
    }
}
