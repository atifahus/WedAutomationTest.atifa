package pageTests;

import base.TestUtilities;
import org.testng.annotations.Test;
import pages.CheckBoxPage;
import pages.WelcomePage;

public class checkboxTest extends TestUtilities {

    @Test
    public void validateCheckbox(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        CheckBoxPage checkBox= welcomePage.clickCheckboxesPage();


        checkBox.selectFirstCheckbox();
        checkBox.validateFirstCheckboxIsSelected();

        checkBox.selectSecondCheckbox();
        checkBox.validateSecondCheckboxIsSelected();


    }


}
