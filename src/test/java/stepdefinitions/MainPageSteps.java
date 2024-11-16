package stepdefinitions;

import constants.Languages;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;

public class MainPageSteps {
    private final MainPage mainPage = new MainPage();

    @Then("Main page is displayed")
    public void isMainPageOpen() {
        Assert.assertTrue(mainPage.state().isDisplayed(), "Main Page is not displayed");
    }

    @When("I input {string} in the search field")
    public void inputSearchName(String name) {
        mainPage.inputSearchName(name);
    }

    @When("I select {string} from the language dropdown")
    public void selectLanguage(String language) {
        Languages langEnum = Languages.valueOf(language.toUpperCase());
        mainPage.selectLanguage(langEnum);
    }

    @When("I click the submit button")
    public void clickOnSubmitButton() {
        mainPage.clickSubmitButton();
    }
}
