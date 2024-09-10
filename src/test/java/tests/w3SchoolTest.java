package assessment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class w3SchoolTest extends w3SchoolBaseTest {

    private final By IFRAME = By.xpath("//iframe[@title='W3Schools HTML Tutorial']");
    private final By CSS_LINK = By.xpath("//a[@title='CSS Tutorial'][normalize-space()='CSS']");

    @Test
    public void testIframeHeaders() {

        WebElement iframe = driver.findElement(IFRAME);
        driver.switchTo().frame(iframe);
        driver.findElement(CSS_LINK).click();

        WebElement iframeHeader = driver.findElement(By.xpath("//h1"));
        iframeHeader.getText();
        driver.switchTo().defaultContent();

        WebElement mainPageHeader = driver.findElement(By.xpath("//h1"));
        mainPageHeader.getText();

    }
}

















//---------------------------------------------------------------------------------------------------------------//