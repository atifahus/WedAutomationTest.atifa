package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class JavaScriptAlertPage extends BasePageObject{
    private By alertPageHeader= By.xpath("//h3");
    private By clickJSAlertLocator=By.xpath("//button[contains(text(),'Click for JS Alert')]");
    private By jsAlertResult=By.xpath("//p[@id='result']");
    private By clickJSConfirmLocator=By.xpath("//button[contains(text(),'Click for JS Confirm')]");
    private By jsPromtLocator=By.xpath("//button[contains(text(),'Click for JS Prompt')]");

    private String alertMsg="This is Text";

    private String expectedPromtResult="You entered: "+alertMsg;



    public JavaScriptAlertPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void validateAlertPageHeader(){
        Assert.assertEquals(driver.findElement(alertPageHeader).getText(),"JavaScript Alerts");
    }
    public void clickJSAlert(){
        click(clickJSAlertLocator);


    }
    public void acceptJSAlertPopUp(){

        switchToAlert().accept();
    }
    public void validateResultForJSAlert(){
        Assert.assertEquals(driver.findElement(jsAlertResult).getText(),"You successfully clicked an alert");
    }
    public void clickJSConfirm(){
        click(clickJSConfirmLocator);
    }
    public void declineAlerts(){
        switchToAlert().dismiss();
    }

    public void validateJSConfirmDeclineResult(){
        Assert.assertEquals(driver.findElement(jsAlertResult).getText(),"You clicked: Cancel");
    }
    public void clickJSPromt(){
        click(jsPromtLocator);
    }

    public void acceptJSPromt(){
        switchToAlert().sendKeys(alertMsg);
        switchToAlert().accept();

    }

    public void valudatePromtResult(){
        Assert.assertEquals(driver.findElement(jsAlertResult).getText(),expectedPromtResult);
    }

}
