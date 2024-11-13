package stepdefinitions;

import io.cucumber.java.en.Then;
import org.testng.Assert;
import pages.InformationPage;

public class InformationPageSteps {
    private final InformationPage informationPage = new InformationPage();

    @Then("Information page for Bengal tiger article is displayed")
    public void isHeaderDisplayed() {
        Assert.assertTrue(informationPage.isHeaderDisplayed(), "The information header is not displayed");
    }
}
