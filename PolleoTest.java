package com.example;

import org.openqa.selenium.;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.;
import static org.testng.Assert.;

public class PolleoSportTest {
    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;

    @BeforeClass(alwaysRun = true)
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "C:\drivers\chromedriver-win64");
        driver = new ChromeDriver();
        baseUrl = "https://www.google.com/";
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testGoogleSearchAndClickAd() {
        driver.get("https://www.google.com/search?q=polleo+sport");
        driver.findElement(By.xpath("//div[@id='tads']/div[3]/div/div/div/div/a/div/span")).click();
        assertTrue(driver.getCurrentUrl().contains("polleosport.hr"));
    }

    @Test
    public void testDeclineCookiePopupAndVisitHomepage() {
        driver.get("https://polleosport.hr");
        driver.findElement(By.id("CybotCookiebotDialogBodyButtonDecline")).click();
        String currentUrl = driver.getCurrentUrl();
        assertEquals(currentUrl, "https://polleosport.hr/");
    }

    @Test
    public void testNavigateToLoginAndRegisterPage() {
        driver.get("https://polleosport.hr");
        driver.findElement(By.xpath("//span[4]/a/img")).click();
        driver.get("https://polleosport.hr/login");
        driver.findElement(By.linkText("Kreirajte korisnički račun")).click();
        String currentUrl = driver.getCurrentUrl();
        assertTrue(currentUrl.contains("register"));
    }

    @Test
    public void testAddItemToCartAndSelectOption() {
        driver.get("https://polleosport.hr");
        driver.findElement(By.xpath("//img[@alt='Zoe Oat Bar, 65g 1+1 GRATIS']")).click();
        driver.findElement(By.id("button-cart-available")).click();
        new Select(driver.findElement(By.id("input-option"))).selectByVisibleText("Double Chocolate");
        driver.findElement(By.linkText("+")).click();
        assertTrue(driver.findElement(By.id("button-cart-available")).isDisplayed());
    }

    @Test
    public void testSearchAndCompletePurchase() {
        driver.get("https://polleosport.hr");
        driver.findElement(By.xpath("//div[@id='my-header']/div/div[2]/div/div[6]/div/span[2]/a/img")).click();
        driver.findElement(By.xpath("//div[@id='right-panel']/div/div[2]/input")).sendKeys("Osijek");
        driver.findElement(By.xpath("//div[@id='right-panel']/div/div[2]/div[2]/div/span/a")).click();
        driver.findElement(By.xpath("//div[6]/div/div/a/div/div/img")).click();
        driver.findElement(By.xpath("//form[@id='basket']/div/table/tbody/tr/td[6]/a[2]")).click();
        assertTrue(driver.getCurrentUrl().contains("order"));
    }

    @AfterClass(alwaysRun = true)
    public void tearDown() throws Exception {
        driver.quit();
    }

    private boolean isElementPresent(By by) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
}
