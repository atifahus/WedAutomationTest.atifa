package pageTests;

import base.TestUtilities;
import org.testng.annotations.Test;
import org.testng.xml.dom.Tag;
import pages.KeyPressesPage;
import pages.WelcomePage;

public class KeyPressesTest extends TestUtilities {

    @Test
    public void validateKeyPresses(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        KeyPressesPage key=welcomePage.clickKeyPressesLink();

        key.pressTabKey();
        key.validateKeyPressedResult();

        /*key.pressEnterKey();
        key.validateEnterKeyResult();*/

    }
}
