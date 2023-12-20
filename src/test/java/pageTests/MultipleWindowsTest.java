package pageTests;

import base.TestUtilities;
import org.testng.annotations.Test;
import pages.MultipleWindowsPage;
import pages.WelcomePage;

public class MultipleWindowsTest extends TestUtilities {

    @Test
    public void validateMultipleWindowsHandle(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        MultipleWindowsPage windowsHandle=welcomePage.clickMultipleWindowsLink();
        windowsHandle.validateDriverHeader();
        windowsHandle.clickToLink();

        windowsHandle.switchToNewWindow();
        windowsHandle.validateNewWindowHeader();

    }

}
