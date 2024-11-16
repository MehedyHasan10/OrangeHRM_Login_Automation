package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.SearchResultsPage;

public class SearchResultsPageSteps {
    private final SearchResultsPage searchResultsPage = new SearchResultsPage();

    @Then("The article page for {string} should be open")
    public void isArticlePageOpen(String articleTitle) {
        Assert.assertEquals(articleTitle, searchResultsPage.getResultHeaderText(), "The article page is not opened");
    }

    @When("I click the tools menu button")
    public void clickOnToolsMenuButton() {
        searchResultsPage.clickToolsMenuButton();
    }

    @When("I click  the Download as PDF button")
    public void clickOnDownloadAsPdfButton() {
        searchResultsPage.clickDownloadAsPdfButton();
    }

    @When("I click the Page information button")
    public void clickOnPageInformationButton() {
        searchResultsPage.clickPageInformationButton();
    }
}
