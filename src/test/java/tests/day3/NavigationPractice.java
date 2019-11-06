package tests.day3;

import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowsersUtils;

public class NavigationPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = BrowserFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://google.com");
        BrowsersUtils.wait(3);
        System.out.println(driver.getTitle());
        driver.navigate().to("http://amazon.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();




    }





}
