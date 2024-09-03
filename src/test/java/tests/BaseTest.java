package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest {

protected WebDriver driver;
    protected final String URL = "https://the-internet.herokuapp.com/";
    protected static final String PRECISE_TEXT_XPATH = "//*[text()='%s']";
    protected static final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]";
    protected static final String RELATIVE_RESOURCE_PATH = "src/test/resources/";

@BeforeMethod
public void setup(){
    driver = new ChromeDriver();
    driver.get(URL);
    driver.manage().window().maximize();
}

@AfterMethod
    public void teardown(){
    driver.quit();
}

}

