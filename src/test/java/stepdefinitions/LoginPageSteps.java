package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.LoginPage;

public class LoginPageSteps {
    private final LoginPage loginPage = new LoginPage();
    
    @When("User enters username {string}")
    public void enterUserName(String userName) {
        loginPage.enterUserName(userName);
    }
    
    @And("User enters password {string}")
    public void enterUserPassword(String password) {
        loginPage.enterUserPassword(password);
    }

    @And("User clicks on login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }
    
    @Then("Error message {string} should be displayed")
    public void getErrorMessage(String errorMessage) {
        Assert.assertTrue(loginPage.getErrorMessage().toLowerCase().contains(errorMessage.toLowerCase()), "Error message does not contain the expected text.");
    }
    
    @And("User should remain on the login page")
    public void isLoginPageDisplayed() {
        Assert.assertTrue(loginPage.state().isDisplayed(), "Login page is not displayed.");
    }
    
    @Then("Error message under username field should be {string}")
    public void getUserInputErrorMessage(String errorMessage) {
        Assert.assertTrue(loginPage.getUserInputErrorMessage().toLowerCase().contains(errorMessage.toLowerCase()), "User Input Error Message does not contain the expected text.");
    }
    
    @And("Error message under password field should be {string}")
    public void getUserPasswordErrorMessage(String errorMessage) {
        Assert.assertTrue(loginPage.getUserPasswordErrorMessage().toLowerCase().contains(errorMessage.toLowerCase()), "User Password Error Message does not contain the expected text.");
    }
}
