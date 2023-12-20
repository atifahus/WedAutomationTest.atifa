package pageTests;

import base.TestUtilities;
import org.testng.annotations.Test;
import pages.JavaScriptAlertPage;
import pages.WelcomePage;

public class JavaScriptAlertsTest extends TestUtilities {
    /*
    * go to homepage
    * click on javascript alerts link
    * validate drive in right page
    * click on javascript alert
    * accept the alert
    * validate the result
    * click on js confirm
    * dismiss the alert
    * validate the result
    * click on alert promt
    * enter msg and aceept the alert
    * validate the result
    * */
    @Test
    public void validateJavaScriptAlerts(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        JavaScriptAlertPage alert=welcomePage.clickJavaScriptAlertsLink();

        alert.validateAlertPageHeader();

        alert.clickJSAlert();
        alert.acceptJSAlertPopUp();
        alert.validateResultForJSAlert();


        alert.clickJSConfirm();
        alert.declineAlerts();
        alert.validateJSConfirmDeclineResult();

        alert.clickJSPromt();
        alert.acceptJSPromt();
        alert.valudatePromtResult();



    }
}
