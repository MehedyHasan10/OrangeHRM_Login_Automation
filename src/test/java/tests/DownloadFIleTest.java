package assessment;


import org.awaitility.Awaitility;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class DownloadFIleTest extends DownloadFileBaseTest {

    private final String SEARCH_QUERY = "Albert Einstein";
    private final String PDF_FILE_NAME = "Albert_Einstein.pdf";
    private final String FILE_PATH = getAbsoluteResourcePath() + File.separator + PDF_FILE_NAME;
    private final File downloadedFile = new File(FILE_PATH);
    private final By SEARCH_BUTTON = By.xpath("//button[@type='submit']");
    private final By TOOLS_MENU_BUTTON = By.id("vector-page-tools-dropdown-checkbox");
    private final By DOWNLOAD_AS_PDF_BUTTON = By.xpath("//span[normalize-space()='Download as PDF']");
    private final By DOWNLOAD_BUTTON = By.xpath("//button[@type='submit']");

    @Test
    public void downloadArticleAsPDF() {

        driver.findElement(By.id("searchInput")).sendKeys(SEARCH_QUERY);
        driver.findElement(SEARCH_BUTTON).click();
        driver.findElement(TOOLS_MENU_BUTTON).click();
        driver.findElement(DOWNLOAD_AS_PDF_BUTTON).click();
        driver.findElement(DOWNLOAD_BUTTON).click();


        Awaitility.await()
                .atMost(MAX_WAIT, TimeUnit.SECONDS)
                .until(() -> downloadedFile.exists());


        Assert.assertTrue(downloadedFile.exists(), "The PDF file was not downloaded successfully.");
    }

    @AfterMethod
    public void cleanup() {

        if (downloadedFile.exists()) {
            boolean deleted = downloadedFile.delete();
            Assert.assertTrue(deleted, "Failed to delete the downloaded PDF file.");
        }
    }
}





