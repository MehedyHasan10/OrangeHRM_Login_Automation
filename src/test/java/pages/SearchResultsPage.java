package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SearchResultsPage extends Form {
    private final IButton toolsMenuButton = getElementFactory().getButton(By.xpath("//div[@id='vector-page-tools-dropdown']"), "Tools Menu Button");
    private final IButton downloadAsPdfButton = getElementFactory().getButton(By.xpath("//li[@id='coll-download-as-rl']"), "Download As PDF Button");
    private final ILabel searchResultHeader = getElementFactory().getLabel(By.xpath("//span[@class='mw-page-title-main']"), "Search Result Header");
    private final IButton pageInformationButton = getElementFactory().getButton(By.xpath("//li[@id='t-info']"), "Page Information Button");

    public SearchResultsPage() {
        super(By.xpath("//header[@class='vector-header mw-header']"), "Wikipedia Search Results Page");
    }

    @Step("Get the search result header text")
    public String getResultHeaderText() {
        return searchResultHeader.getText();
    }

    @Step("Click the Tools menu to open additional options")
    public void clickToolsMenuButton() {
        toolsMenuButton.click();
    }

    @Step("Click the 'Download as PDF' option")
    public void clickDownloadAsPdfButton() {
        downloadAsPdfButton.click();
    }

    @Step("Click the 'Page Information' option")
    public void clickPageInformationButton() {
        pageInformationButton.click();
    }
}
