package pages;

import aquality.selenium.core.elements.ElementState;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.IComboBox;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class MainPage extends Form {
    private final ITextBox textNameInput = getElementFactory().getTextBox(By.xpath("//input[@id='searchInput']"), "Search Field");
    private final IButton submitButton = getElementFactory().getButton(By.xpath("//button[@type='submit']"), "Submit Button");
    private final IComboBox languageButton = getElementFactory().getComboBox(By.id("searchLanguage"), "Language Dropdown", ElementState.EXISTS_IN_ANY_STATE);

    public MainPage() {
        super(By.xpath("//body[@id='www-wikipedia-org']"), "Wikipedia Main Page");
    }

    @Step("Type in search field with name: {name}")
    public void searchForName(String name) {
        textNameInput.clearAndType(name);
    }

    @Step("Select language: {language}")
    public void selectForLanguage(String language) {
        languageButton.clickAndSelectByText(language);
    }

    @Step("Click the submit button")
    public void clickSubmitButton() {
        submitButton.click();
    }
}
