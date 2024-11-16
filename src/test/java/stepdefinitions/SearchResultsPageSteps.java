package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchResultsPage;

public class SearchResultsPageSteps {
    private final SearchResultsPage searchResultsPage = new SearchResultsPage();
    
    @Then("The article page for {string} should be open")
    public void articlePageIsOpen(String articleTitle) {
        Assert.assertEquals(articleTitle,searchResultsPage.forResultHeaderText(),"The article page is not opened");
    }
    
    @When("I click the tools menu button")
    public void clickToolsMenuButton(){
        searchResultsPage.clickToolsMenu();
    }
    
    @When("I click  the Download as PDF button")
    public void clickDownloadAsPdfButton(){
        searchResultsPage.clickDownloadAsPdf();
    }
    
    @When("I click the Page information button")
    public void clickPageInformation(){
        searchResultsPage.clickPageInformation();
    }
}
