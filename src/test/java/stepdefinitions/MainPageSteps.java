package stepdefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();
    
    @Then("Main page is displayed")
    public void isMainPageOpen() {
        Assert. assertTrue(mainPage.state().isDisplayed(), "Main Page is not displayed");
    }

    @When("^I input \"(.*)\" in the search field$")
    public void forSearchName(String name){
        mainPage.searchForName(name);
    }

    @When("^I select \"(.*)\" from the language dropdown$")
    public void selectLanguage(String language){
        mainPage.selectForLanguage(language);
    }
    
    @When("I click the submit button")
    public void clickSubmitButton() {
        mainPage.clickSubmitButton();
    }
}
