package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class DashboardPage extends Form {
    private final ILabel dashboardHeader = getElementFactory().getLabel(By.xpath("//span[contains(@class,'oxd-topbar-header-breadcrumb')]"), "Dashboard Header");
    private final ILabel userNameLable = getElementFactory().getLabel(By.xpath("//p[@class='oxd-userdropdown-name']"), "User Name Header");

    public DashboardPage() {
        super(By.xpath("//span[contains(@class,'oxd-topbar-header-breadcrumb')]"), "OrangeHRM Dashboard Page");
    }

    @Step("Getting the dashboard header text")
    public String getDashboardHeaderText(){
        return dashboardHeader.getText();
    }

    @Step("Show the user name")
    public boolean isUserNameDisplayed() {
        return userNameLable.state().waitForDisplayed();
    }
}
