package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccuweatherTest extends AccuweatherBaseTest {

    private final By CONSENT_BUTTON = By.xpath(String.format(PRECISE_TEXT_XPATH, "I Understand"));
    private final By SEARCH_FIELD = By.xpath("//input[@placeholder='Search your Address, City or Zip Code']");
    private final By SEARCH_RESULTS_LIST = By.xpath("//div[@class='search-bar-result current-location-result']");
    private final By FIRST_SEARCH_RESULT = By.xpath("//div[@class='featured-locations']//a[1]");


    @Test
    public void testSearchCityWeather() {

        wait.until(ExpectedConditions.elementToBeClickable(CONSENT_BUTTON));
        driver.findElement(CONSENT_BUTTON).click();


        driver.findElement(SEARCH_FIELD).sendKeys("New York");


        wait.until(ExpectedConditions.visibilityOfElementLocated(SEARCH_RESULTS_LIST));
        Assert.assertTrue(driver.findElement(SEARCH_RESULTS_LIST).isDisplayed(), "Search results list is not displayed.");

        // Wait for and click the first search result
        wait.until(ExpectedConditions.presenceOfElementLocated(FIRST_SEARCH_RESULT));
        WebElement firstResult = driver.findElement(FIRST_SEARCH_RESULT);
        firstResult.getText();
        firstResult.click();




    }
}
