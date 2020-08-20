package amazon.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Main {

    public WebDriver webDriver;
    public String chromeDriver = "webdriver.chrome.driver";
    public String chromeDriverPath = "lib/browserDriver/chromedriver";
    public String url="https://www.amazon.com/";
    public String signInurl = "https://www.amazon.com/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&";
    public String emailBox = "//*[@id=\"ap_email\"]";
    public String emailId = "pnt30242@gmail.com";
    public String continueButton = "//*[@id=\"continue\"]";
    public String passwordBox = "//*[@id=\"ap_password\"]";
    public String password="Pnt@30242";
    public String signInButton = "//*[@id=\"signInSubmit\"]";
    public String actualText="//*[@id=\"nav-logo\"]/a/span[1]";
    public String expectedText="\"Amazon Home Page\"";

    @BeforeMethod
    public void welcome() {
        System.out.println("Welcome to Amazon Automation world");
    }
    public void lounchBrowser(String driverUrl,String driverPath, String signInurlurl){
        //for chromeBrowser
        System.setProperty(driverUrl, driverPath);
        webDriver= new ChromeDriver();
        webDriver.get(signInurlurl);
    }
    public void setUp(String driverUrl,String driverPath, String url) {
        System.setProperty(driverUrl, driverPath);
        webDriver= new ChromeDriver();
        webDriver.get(url);
    }
//        @AfterMethod
//    public void closeBrowser() {
//        webDriver.close();
 //   }
/*
Test Amazon signIn
 */
//  # Sign in Functionality test

//•	Open Chrome browser
//•	Enter amazon sign in url in address bar
//•	Click on Sign button
//•	Enter valid email id
//•	Click on Continue Button
//•	Enter valid password
//•	Click on Sign in button
//•	Verify Home page displayed properly
    public void setlogIn() throws InterruptedException {
        lounchBrowser(chromeDriver,chromeDriverPath,url);
        webDriver.findElement(By.xpath(emailBox)).sendKeys(emailId);
        webDriver.findElement(By.xpath(continueButton)).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath(passwordBox)).sendKeys(password);
        webDriver.findElement(By.xpath(signInButton)).click();
        Thread.sleep(3000);
    }


/*
testing amazon shopping cart
 */
   public String shoppingCartIcon = "//*[@id=\"nav-cart-count-container\"]/span[2]";
   public String cart = "Cart";
    public String cartHomePageActualText = "#sc-active-cart > div > div.a-column.a-span8.a-span-last > div.a-row.sc-your-amazon-cart-is-empty > h2";
    public String expectedCartText = "\"Your Amazon Cart is empty\"";

    public void shoppingCart() throws InterruptedException {
        System.setProperty(chromeDriver,chromeDriverPath);
        WebDriver webDriver= new ChromeDriver();
        webDriver.get(url);
        webDriver.findElement(By.xpath(shoppingCartIcon)).click();
        Thread.sleep(3000);
        webDriver.close();
    }
        /*
    Test Try Prime button
     */
    //  # Sign in Functionality test
//•	Open Chrome browser
//•	Enter amazon home page url in address bar hit enter
//•	Click on Try Prime Button
//•	Verify Home page displayed properly

   public String tryPrimeButton="//*[@id=\"nav-link-prime\"]";
    public String primeActualText="//*[@id=\"prime-hero-header\"]/div[1]/img";
    public String primeExpectedText="\"Prime\"";

    public void setTryPrimeButton() throws InterruptedException {
        System.setProperty(chromeDriver,chromeDriverPath);
        WebDriver webDriver=new ChromeDriver();
        webDriver.get(url);
        webDriver.findElement(By.xpath(tryPrimeButton)).click();
        Thread.sleep(3000);
        webDriver.findElement(By.xpath(primeActualText)).getText();
        Thread.sleep(3000);
        webDriver.close();
    }



}
