package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.PdfDownloadPage;
import utils.FileUtils;

import java.io.File;

import static aquality.selenium.browser.AqualityServices.getBrowser;

public class PdfDownloadSteps {
    private final PdfDownloadPage pdfDownloadPage = new PdfDownloadPage();
    private final String downloadDirectory = getBrowser().getDownloadDirectory();

    @When("I click the download button")
    public void clickDownloadButton(){
        pdfDownloadPage.clickDownloadButton();
    }
    
    @Then("The file should be downloaded")
    public void isFileDownloaded(){
        File downloadedFile = new File(downloadDirectory, pdfDownloadPage.getDownloadFileName());
        boolean isDownloaded = FileUtils.isFileExist(downloadedFile);
        Assert.assertTrue(isDownloaded, "File is not downloaded.");
    }
}
