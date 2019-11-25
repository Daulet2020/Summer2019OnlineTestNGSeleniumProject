package tests.HomeWorks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;

public class TestCase1 {
    public static void main(String[] args) {
        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("https://qa2.vytrack.com/user/login");
        WebElement input = driver.findElement(By.name("_username"));
        //BY ID
        //WebElement input = driver.findElement(By.id("prependedInput"));
        input.sendKeys("storemanager85");
        System.out.println(input.getAttribute("value"));
        //BY NAME
        WebElement input2 = driver.findElement(By.name("_password"));
        //BY ID
        //WebElement input2 = driver.findElement(By.id("prependedInput2"));
        input2.sendKeys("UserUser123");
        WebElement button = driver.findElement(By.name("_submit"));
        button.click();
        WebElement button1 = driver.findElement(By.className("dropdown dropdown-level-1"));
        button1.click();

    }

}
