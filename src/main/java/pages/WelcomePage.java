package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage extends BasePageObject {
    // WebDriver driver;

    private By formAuthenticationLocator = By.linkText("Form Authentication");

    private By checkBoxLocator = By.linkText("Checkboxes");

    private By hoversLinkLocator= By.linkText("Hovers");

    private By dropDownLinkLocator= By.linkText("Dropdown");

    private By dragDropLinkLocator= By.linkText("Drag and Drop");

    private By basicAuthLinkLocator=By.linkText("Basic Auth");

    private By addRemoveLinkLocator=By.linkText("Add/Remove Elements");

    private By multipleWindowsLinkLocator=By.linkText("Multiple Windows");

    private By nestedFramesLinkLocator=By.linkText("Nested Frames");

    private By jSAlertLinkLocator=By.linkText("JavaScript Alerts");

    private By keyPressesLinkLocator=By.linkText("Key Presses");




    public WelcomePage(WebDriver driver, Logger log){
        super(driver, log);
    }

    public LoginPage clickFormAuthenticationButton(){
        click(formAuthenticationLocator);
        return new LoginPage(driver, log);
    }
    public AddRemoveElementPage clickAddRemoveLink(){
        click(addRemoveLinkLocator);
        return new AddRemoveElementPage(driver,log);
    }

    public CheckBoxPage clickCheckboxesPage(){
        click(checkBoxLocator);
        return new CheckBoxPage(driver, log);
    }

    public HoverPage clickHoverLink(){
        click(hoversLinkLocator);
        return new HoverPage(driver,log);
    }

    public DropDownPage clickDropDownLink(){
        click(dropDownLinkLocator);
        return new DropDownPage(driver,log);
    }

    public DragAndDropPage clickDragDropLink(){
        click(dragDropLinkLocator);
        return new DragAndDropPage(driver,log);
    }

    public BasicAuthPage clickBasicAuthLink(){
        click(basicAuthLinkLocator);
        return new BasicAuthPage(driver,log);
    }

    public MultipleWindowsPage clickMultipleWindowsLink(){
        click(multipleWindowsLinkLocator);
        return new MultipleWindowsPage(driver,log);
    }

    public NestedFramesPage clickNestedFramesLink(){
        click(nestedFramesLinkLocator);
        return new NestedFramesPage(driver,log);
    }

    public JavaScriptAlertPage clickJavaScriptAlertsLink(){
        click(jSAlertLinkLocator);
        return new JavaScriptAlertPage(driver,log);
    }

    public KeyPressesPage clickKeyPressesLink(){
        click(keyPressesLinkLocator);
        return new KeyPressesPage(driver,log);
    }





}