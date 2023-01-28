package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebBaseTest;

public class LoginPage extends WebBaseTest {
    @FindBy(id="CustomerEmail")
    WebElement userNameTextBox;

    @FindBy(name = "customer[password]")
    WebElement passwordTextBox;

    @FindBy(id = "app-login-form-submit-button")
    WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver, this);
    }
    public void login(String userName, String password){
        userNameTextBox.sendKeys(userName);
        passwordTextBox.sendKeys(password);
        loginBtn.click();
    }



}
