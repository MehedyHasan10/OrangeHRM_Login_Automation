package tests;

import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class FileDownloadTest extends BaseTest {

    private final By FILE_DOWNLOAD = By.xpath(String.format(PRECISE_TEXT_XPATH, "File Download"));
    private final String FILE_NAME = "text.txt";
    private final By FILE_NAME_XPATH = By.xpath(String.format(PARTICULAR_TEXT_XPATH, FILE_NAME));
    private final String FILE_PATH = RELATIVE_RESOURCE_PATH + FILE_NAME;
    private final File downloadedFile = new File(FILE_PATH);

    @Test
    public void fileDownloadTest() {
        driver.findElement(FILE_DOWNLOAD).click();
        Assert.assertTrue(driver.findElement(FILE_NAME_XPATH).isDisplayed(), "File is not displayed");
        driver.findElement(FILE_NAME_XPATH).click();
        Assert.assertTrue(isFileExists(downloadedFile), "File was not downloaded successfully");
    }

    private boolean isFileExists(File file) {    // Method to check if the file exists by waiting until it appears
        try {
            // Uses Awaitility to wait up to MAX_WAIT seconds for the file to exist
            Awaitility.await()
                    .atMost(MAX_WAIT, TimeUnit.SECONDS)
                    .until(file::exists);
        } catch (Exception e) {

            return false;   // Returns false if the file does not exist within the timeout period
        }

        return true;    // Returns true if the file exists
    }

    @AfterMethod
    public void deleteFile() {    // Deletes the file if it exists after the test is run
        if (downloadedFile.exists()) {
            downloadedFile.delete();
        }
    }
}
