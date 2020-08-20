package amazon;

import amazon.testCases.Main;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon extends Main {
    @Test
    public void testSetLonIn()throws InterruptedException{
        setlogIn();
        String actulText=webDriver.findElement(By.xpath(actualText)).getText();
        Assert.assertEquals(actulText,expectedText);
    }
    @Test
    public void testShoppingCart() throws InterruptedException {
        shoppingCart();
        String actualText=webDriver.findElement(By.xpath(cartHomePageActualText)).getText();
        Assert.assertEquals(cartHomePageActualText,expectedText);
    }
    @Test
    public void testTryPrime() throws InterruptedException {
        setTryPrimeButton();
        String actualText=webDriver.findElement(By.xpath(primeActualText)).getText();
        Assert.assertEquals(primeActualText,primeExpectedText);
    }
}