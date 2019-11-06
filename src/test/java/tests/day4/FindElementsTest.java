package tests.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserFactory;
import utils.BrowsersUtils;

public class FindElementsTest {
    public static void main(String[] args) {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/forgot_password");
        String expectedTitle = driver.getTitle();
        // Step1. Open inspector in chrome and find locator for the element
        // Step 2.  Create object of WebElement
        // Step 3. Use webelement
        WebElement button = driver.findElement(By.id("forgot_password"));
        button.click();

        String actualTitle = driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Test passed");
        }else {
            System.out.println("Test Failed");
            System.out.println("Expected title " + expectedTitle);
            System.out.println("Actual title " + actualTitle);
        }

        BrowsersUtils.wait(2);
        driver.close();



    }
}
