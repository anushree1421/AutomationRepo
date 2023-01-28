package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebBaseTest;

public class MyAccountPage extends WebBaseTest {
    @FindBy(xpath = "//h1[text()='My Account']")
    WebElement accountTitle;

    public MyAccountPage()
    {

        PageFactory.initElements(driver,this);
    }

    public String getTextOfMyAccountPage()
    {
        return accountTitle.getText();
    }
}
