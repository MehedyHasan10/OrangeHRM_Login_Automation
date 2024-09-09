package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

public class BaseTest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected final String URL = "https://the-internet.herokuapp.com/";
    protected static final String PRECISE_TEXT_XPATH = "//*[text()='%s']";
    protected static final String PARTICULAR_TEXT_XPATH = "//*[contains(text(),'%s')]";
    protected static final String RELATIVE_RESOURCE_PATH = "target/downloads/";
    protected static final String PATH ="C:\\Users\\Admin\\Downloads\\";
    protected static final int MAX_WAIT = 10;

    @BeforeMethod
    public void setup() {

        ChromeOptions options = new ChromeOptions();
        // Set the download directory to the target/downloads folder within the project
        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", getAbsoluteResourcePath());
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);
        driver.get(URL);
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(MAX_WAIT));
    }

    @AfterMethod
    public void teardown() {
        driver.quit();
    }

    // Helper method to get the absolute path for file operations
    protected String getAbsoluteResourcePath() {
        File file = new File(RELATIVE_RESOURCE_PATH);
        return file.getAbsolutePath();
    }
}
