package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {
    // WebDriver driver;

    private By formAuthenticationLocator = By.linkText("Form Authentication");

    private By checkBoxLocator = By.linkText("Checkboxes");



    public WelcomePage(WebDriver driver, Logger log){
        super(driver, log);
    }

    public LoginPage clickFormAuthenticationButton(){
        click(formAuthenticationLocator);
        return new LoginPage(driver, log);
    }

   /* public CheckboxPage clickCheckboxesPage(){
        click(checkBoxLocator);
        return new CheckboxPage(driver, log);
    }*/

}