package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.InformationPage;

public class InformationPageSteps {
    private final InformationPage informationPage = new InformationPage();

    @Then("Information page for {string} article is displayed")
    public void isHeaderDisplayed(String informationTitle) {
        Assert.assertTrue(informationPage.forInformationHeaderText().toLowerCase().contains(informationTitle.toLowerCase()), "The information header is not opened");
    }
}
