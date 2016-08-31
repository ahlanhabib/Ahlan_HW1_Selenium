package Common;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;
public class Base {
    public WebDriver driver= null;

    @BeforeMethod
    @Parameters({"url"})
    public void setUp(String url){
        System.setProperty("webdriver.gecko.driver", "A:\\New folder\\Selenium\\Browsers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }
    @AfterMethod
    public void cleanUp(){
        driver.quit();
    }

    public void clickByCss(String Locator){
        driver.findElement(By.cssSelector(Locator)).click();
    }
     public void clickByXpath(String Locator){
        driver.findElement(By.xpath(Locator)).click();
    }
    public void typeByXpath(String locator, String value){
        driver.findElement(By.xpath(locator)).sendKeys(value);
    }
    public void typeByCss(String locator, String value){
        driver.findElement(By.cssSelector(locator)).sendKeys(value);
    }
    public void sleepFor(int sec) throws InterruptedException{
        Thread.sleep(sec * 3000);
    }
}