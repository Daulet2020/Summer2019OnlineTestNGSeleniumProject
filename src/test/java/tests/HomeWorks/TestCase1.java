package tests.HomeWorks;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import utils.BrowserFactory;
import utils.BrowserUtils;

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
        BrowserUtils.wait(3);
        WebElement activitiesTabLocator = driver.findElement(By.xpath("//span[@class='title title-level-1' and contains(text(), 'Activities')]"));
        activitiesTabLocator.click();
        BrowserUtils.wait(3);
        WebElement calEventsLocator = driver.findElement(By.xpath("//span[@class='title title-level-2' and text()='Calendar Events']"));
        calEventsLocator.click();
        BrowserUtils.wait(5);
        WebElement pageSubtitleLocator = driver.findElement(By.xpath("//div[contains(text(), 'Options')]"));
        System.out.println(pageSubtitleLocator.getText());
        Assert.assertTrue(pageSubtitleLocator.isDisplayed());
        driver.close();


    }

}
