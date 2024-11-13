package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class PdfDownloadPage extends Form {
    private final IButton clickDownloadButton = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Click Download Button");
    private final ILabel fileNameLabel = getElementFactory().getLabel(By.xpath("//div[@class='mw-electronpdfservice-selection-label-desc']"), "Check File Name");

    public PdfDownloadPage() {
        super(By.xpath("//h1[@id='firstHeading']"), "Wikipedia Pdf Download Page");
    }

    @Step("Click the download button to start the PDF download")
    public void clickDownloadButton() {
        clickDownloadButton.click();
    }

    @Step("Retrieve the name of the file to be downloaded")
    public String getDownloadFileName() {
        return fileNameLabel.getText();
    }
}   
