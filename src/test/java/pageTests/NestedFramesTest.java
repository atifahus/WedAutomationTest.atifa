package pageTests;

import base.TestUtilities;
import org.testng.annotations.Test;
import pages.NestedFramesPage;
import pages.WelcomePage;

public class NestedFramesTest extends TestUtilities {
    /*
    * go to homepage
    * click on nested frames link
    * validate left frame is present
    * validate middle frame is present
    * validate right frame is present
    * validate bottom frame is present
    * */
    @Test
    public void validateNestedFrames(){
        WelcomePage welcomePage=new WelcomePage(driver,log);
        NestedFramesPage frame=welcomePage.clickNestedFramesLink();

        frame.validateLeftFrame();
       // frame.validateMiddleFrame();
      //  frame.validateRightFrame();
      //  frame.validateBottomFrame();

    }
}
