package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;
import static org.testng.Assert.assertEquals;

public class LoginPage extends AbstractPage {

    private final String PAGE_URL = "http://newtours.demoaut.com";
    private final String USER_NAME = "omer";

    @FindBy(name = "password")
    private WebElement firstNameTxt;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        this.driver.get(PAGE_URL);
        this.wait.until(visibilityOf(this.firstNameTxt));
    }

    public void login() {
        this.firstNameTxt.sendKeys(USER_NAME);
        assertEquals(getCurrentValue(), USER_NAME);
    }

    private String getCurrentValue() {
        return this.firstNameTxt.getAttribute("value");
    }
}
