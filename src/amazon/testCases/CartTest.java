package amazon.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CartTest {
    //  # Sign in Functionality test
//•	Open Chrome browser
//•	Enter amazon sign in url in address bar
//•	Click on Cart button
//•	Click on Continue Button
//•	Verify Home page displayed properly
//.Your Amazon Cart is empty display

    public static void main(String[] args) throws InterruptedException {}

        String chromeDriver = "webdriver.chrome.driver";
        String chromeDriverPath = "lib/browserDriver/chromedriver";
        String url = "https://www.amazon.com/";
        String shoppingCartIcon = "//*[@id=\"nav-cart-count-container\"]/span[2]";
        String cart = "Cart";
        String cartHomePageActualText = "//*[@id=\"sc-active-cart\"]/div/div[2]/div[1]/h2";
        String expectedText = "\"Your Amazon Cart is empty\"";

        public void shoppingCart() throws InterruptedException {
        System.setProperty(chromeDriver,chromeDriverPath);
        WebDriver webDriver= new ChromeDriver();
        webDriver.get(url);
      // webDriver.manage().window().fullscreen();
          webDriver.findElement(By.xpath(shoppingCartIcon)).click();
//        Thread.sleep(3000);
        String actualText=webDriver.findElement(By.xpath(cartHomePageActualText)).getText();
        Assert.assertEquals(cartHomePageActualText,expectedText);
         Thread.sleep(3000);
         webDriver.close();

    }
}
