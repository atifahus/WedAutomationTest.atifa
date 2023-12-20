package pages;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasicAuthPage extends BasePageObject{
    String urlWithAuthCredential="https://admin:admin@the-internet.herokuapp.com/basic_auth";
    private By authPageHeader=By.tagName("p");


    public BasicAuthPage(WebDriver driver, Logger log) {
        super(driver, log);
    }

    public void loginWithBasicAuth(){
        openUrl(urlWithAuthCredential);
    }

    public String getHeader(){
        return getCurrentHeader(authPageHeader);
    }
}
