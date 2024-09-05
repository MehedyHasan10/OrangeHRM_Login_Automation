package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;


public class BaseTest {

protected WebDriver driver;
    protected WebDriverWait wait;
    protected final String URL = "https://the-internet.herokuapp.com/";
    protected static final String PRECISE_TEXT_XPATH = "//*[text()='%s']";
    protected static final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]";
    protected static final String RELATIVE_RESOURCE_PATH = "C:\\Users\\Admin\\Downloads\\";
    protected static final int MAX_WAIT = 20;

@BeforeMethod
public void setup(){
    driver = new ChromeDriver();
    driver.get(URL);
    driver.manage().window().maximize();
    wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT));
}

@AfterMethod
    public void teardown(){
    driver.quit();
}

}

