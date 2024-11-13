package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class SearchResultsPage extends Form {
    private final IButton clickToolsMenuButton = getElementFactory().getButton(By.xpath("//div[@id='vector-page-tools-dropdown']"), "Click Tools Menu");
    private final IButton clickDownloadAsPdfButton = getElementFactory().getButton(By.xpath("//li[@id='coll-download-as-rl']"), "Click Download As PDF Button");
    private final ILabel searchResultHeader = getElementFactory().getLabel(By.xpath("//span[@class='mw-page-title-main']"), "Search Result Header");
    private final IButton pageInfoButton = getElementFactory().getButton(By.xpath("//li[@id='t-info']"), "Click Page Information Button");

    public SearchResultsPage() {
        super(By.xpath("//header[@class='vector-header mw-header']"), "Wikipedia Search Results Page");
    }

    @Step("Get the search result header text")
    public String forResultHeaderText() {
        return searchResultHeader.getText();
    }

    @Step("Click the Tools menu to open additional options")
    public void clickToolsMenu() {
        clickToolsMenuButton.click();
    }

    @Step("Click the 'Download as PDF' option")
    public void clickDownloadAsPdf() {
        clickDownloadAsPdfButton.click();
    }

    @Step("Click the 'Page Information' option")
    public void clickPageInformation() {
        pageInfoButton.click();
    }
}
