package amazon;

import amazon.testCases.Main;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestAmazon extends Main {
    @Test
    public void testSetLognIn() throws InterruptedException {
        logIn();
        Assert.assertEquals("Amazon Sign-In", driver.getTitle());
    }
    @Test
    public void testTryPrime() throws InterruptedException {
        tryPrimeButton();
        Assert.assertEquals("Amazon.com: Amazon Prime", driver.getTitle());
    }
    @Test
    public void testShoppingCart() throws InterruptedException {
        shoppingCart();
    }
    @Test
    public void testamazonBasic() throws InterruptedException {
        amazonBasic();
    }
    @Test
    public void testSellButton() throws InterruptedException {
        sellButton();
    }
    @Test
    public void testSetProductSearch() throws InterruptedException {
        setProductSearch();
    }
    @Test
    public void testsetSelectYourAddressd() throws InterruptedException {
        setSelectYourAddressd();
    }
    @Test
    public void testamazonBurgerButtonIsDiplayed() {
        amazonBurgerButtonIsDiplayed();
    }
    @Test
    public void testamazonBurgerButtonIsEnable() {
        amazonBurgerButtonIsEnable();
    }
    @Test
    public void testGiftCardButtonDisplay() {
        giftCardButtonDisplay();
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Gift Cards')]")).isDisplayed());
    }
    @Test
    public void testGiftCardHomePageDisplay() {
        giftCardHomePageDisplay();
        Assert.assertEquals("Amazon.com Gift Cards", driver.getTitle());
    }
    @Test
    public void testEGiftCardClickable() {
        eGiftCardButtonIsClickAble();
    }

    @Test
    public void testBirthDayButtonClickable() throws InterruptedException {
        birthDayButtonIsActive();
        Assert.assertEquals("Amazon.com Gift Cards", driver.getTitle());
    }
    @Test
    public void testRedeemGiftCard() throws InterruptedException {
        redeemGiftCard();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ap_email']")).isDisplayed());
    }
    @Test
    public void testViewYourBalance() throws InterruptedException {
        viewYourBalace();
        Assert.assertEquals("Amazon Sign-In", driver.getTitle());
    }
    @Test
    public void testReloadYourBalance() throws InterruptedException {
        reloadYourBalance();
        Assert.assertEquals("Reload Your Balance", driver.getTitle());
    }
    @Test
    public void testAmazonCash() throws InterruptedException {
        amazonCash();
        Assert.assertEquals("Amazon Cash", driver.getTitle());
    }
    @Test
    public void testByBrand() throws InterruptedException {
        byBrand();
        Assert.assertEquals("Amazon.com: : Gift Cards", driver.getTitle());
    }
    @Test
    public void testSearchBoxTypeAble() {
        searchBoxIsTypable();
        System.out.println(driver.getTitle());
        Assert.assertTrue(driver.findElement(By.xpath("//a[contains(text(),'Coupons')]")).isDisplayed());
    }
    @Test
    public void testLandingCuponePage() throws InterruptedException {
        landingCuponePage();
        System.out.println(driver.getTitle());
        Assert.assertEquals("Amazon Coupons @ Amazon.com", driver.getTitle());
    }
    @Test
    public void testLandingRecentlyClippedPage() throws InterruptedException {
        landingRecentlyClippedPage();
        Assert.assertTrue(driver.findElement(By.xpath("//img[@class='vpc_coupon_bar_image vpc_clickable vpc_coupon_bar_scissors']")).isDisplayed());
    }
    @Test
    public void testBowlOfCarrot() throws InterruptedException {
        landingMostPopularpage();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='a-dropdown-prompt']")).isDisplayed());
    }
    @Test
    public void testSearchCouponBoxIsTypable() throws InterruptedException {
        searchCouponBoxIsTypable();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='vpcCateogryBarHeaderText a-size-medium a-color-primary']")).isDisplayed());
    }
    @Test
    public void testLandingFire7Page() {
        landingOnFire7Page();
        Assert.assertTrue(driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-bold']")).isDisplayed());
    }
    @Test
    public void testBestSellersButton(){
        bestSellersButton();
        Assert.assertEquals("Amazon.com Best Sellers: The most popular items on Amazon",driver.getTitle());
    }
    @Test
    public void testCustomerServicesButton() throws InterruptedException {
        customerServices();
        Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[2]/div[1]/h1")).isDisplayed());
    }
    @Test
    public void testtodaysDealButton() throws InterruptedException {
        todaysDeals();
        Assert.assertEquals("Gold Box Deals | Today's Deals - Amazon.com",driver.getTitle());
    }
    @Test
    public void testNewRelease(){
        newRelease();
        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"zg_banner_text_wrapper\"]")).isDisplayed());
    }
    @Test
    public void testFindAGift() throws InterruptedException {
        findAGiftButton();
        Assert.assertEquals("Gifts for Everyone | Amazon.com Gift Finder",driver.getTitle());
    }
}

