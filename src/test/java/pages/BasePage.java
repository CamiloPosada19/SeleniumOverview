package pages;
import java.time.Duration;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
    protected static WebDriver driver;
    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
    }

    public static void navigateTo(String url) {
        driver.get(url);
  
    }

    protected WebElement Find(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    protected WebElement FindByID(String locator){
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
    }
    public void clickElement(String locator){
        Find(locator).click();
    }

    public void clickElementID(String locator){
        FindByID(locator).click();
    }
    
    public static void closeBrowser() {
        driver.quit();
    }
    public void write(String locator, String keysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(keysToSend);
    }

    public void writeByID(String locator, String keysToSend){
        FindByID(locator).clear();
        FindByID(locator).sendKeys(keysToSend);
    }
    public void selectFromDropdownByValue(String locator, String value){
        Select dropdown = new Select(FindByID(locator));
        dropdown.selectByValue(value);
    }
    
    public String getText(String locator){
        return Find(locator).getText();
    }
}