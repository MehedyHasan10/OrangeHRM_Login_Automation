package pages;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends Form {
    private final ITextBox userInputBox = getElementFactory().getTextBox(By.xpath("//input[@name='username']"), "User Input Field");
    private final ITextBox passwordInputBox = getElementFactory().getTextBox(By.xpath("//input[@name='password']"), "Password Input Field");
    private final IButton loginButton = getElementFactory().getButton(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"), "Login Button");
    private final ILabel errorMessage = getElementFactory().getLabel(By.xpath("//div[@class='oxd-alert-content oxd-alert-content--error']"),"Error Message");
    private final ILabel userInputErrorMsg = getElementFactory().getLabel(By.xpath("//div[@class='orangehrm-login-slot-wrapper']//div[1]//div[1]//span[1]"),"User Input Error Message");
    private final ILabel userPasswordErrorMsg = getElementFactory().getLabel(By.xpath("//div[@class='orangehrm-login-form']//div[2]//div[1]//span[1]"),"User Password Error Message");
    
    public LoginPage() {
        super(By.xpath("//h5[@class='oxd-text oxd-text--h5 orangehrm-login-title']"), "OrangeHRM Login Page");
    }
    
    @Step("Enter username : {userName}")
    public void enterUserName(String userName) {
        userInputBox.clearAndType(userName);
    }

    @Step("Entering user password: {password}")
    public void enterUserPassword(String password) {
        passwordInputBox.clearAndType(password);
    }

    @Step("Click the login button")
    public void clickLoginButton() {
        loginButton.click();
    }
    
    @Step("Getting the error message")
    public String getErrorMessage() {
        return errorMessage.getText();
    }
    
    @Step("Getting the user input error message")
    public String getUserInputErrorMessage() {
        return userInputErrorMsg.getText();
    }
    
    @Step("Getting the user password error message")
    public String getUserPasswordErrorMessage() {
        return userPasswordErrorMsg.getText();
    }
}
