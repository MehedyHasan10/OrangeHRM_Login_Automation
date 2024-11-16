package pages;

import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class InformationPage extends Form {
    private final ILabel informationHeader = getElementFactory().getLabel(By.xpath("//h1[@id='firstHeading']"),"Information Header");
    
    public InformationPage(){
        super(By.xpath("//h2[@id='Contents']"),"Information Page");
    }

    @Step("Check the information page article is displayed")
    public String forInformationHeaderText() { 
        return informationHeader.getText();
    }
}
