package amazon.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SignIn {
   public static void main(String[] args) throws InterruptedException {
//  # Sign in Functionality test
//•	Open Chrome browser
//•	Enter amazon sign in url in address bar
//•	Click on Sign button
//•	Enter valid email id
//•	Click on Continue Button
//•	Enter valid password
//•	Click on Sign in button
//•	Verify Home page displayed properly


        String chromeDriver = "webdriver.chrome.driver";
        String chromeDriverPath = "lib/browserDriver/chromedriver";
        String url = "https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
        String emailBox = "//*[@id=\"ap_email\"]";
        String emailId = "pnt30242@gmail.com";
        String continueButton = "//*[@id=\"continue\"]";
        String passwordBox = "//*[@id=\"ap_password\"]";
        String password = "Pnt@30242";
        String signInButton = "//*[@id=\"signInSubmit\"]";
        String actualText = "//*[@id=\"nav-logo\"]/a/span[1]";
        String expectedText = "\"Amazon Home Page\"";

       System.setProperty(chromeDriver, chromeDriverPath);
       WebDriver webDriver = new ChromeDriver();
       webDriver.get(url);
       webDriver.findElement(By.xpath(emailBox)).sendKeys(emailId);
       webDriver.findElement(By.xpath(continueButton)).click();
       Thread.sleep(3000);
       webDriver.findElement(By.xpath(passwordBox)).sendKeys(password);
       webDriver.findElement(By.xpath(signInButton)).click();
       Thread.sleep(3000);
       String actulText=webDriver.findElement(By.xpath(actualText)).getText();
       Assert.assertEquals(actualText, expectedText);
       Thread.sleep(3000);
       webDriver.close();

   }
}