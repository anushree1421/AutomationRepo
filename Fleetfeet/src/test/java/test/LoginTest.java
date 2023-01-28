package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebBaseTest;

public class LoginTest extends WebBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public LoginTest(){
        super();
    }

    @BeforeMethod
    public void beforeMethod(){
        initialization();
        homePage = new HomePage();
        loginPage = new LoginPage();
        myAccountPage = new MyAccountPage();
    }

    @Test
    public void verifyLoginWithValidCredential(){
        SoftAssert softAssert = new SoftAssert();
        homePage.loginClick();
        loginPage.login(prop.getProperty("userName"), prop.getProperty("password"));
        softAssert.assertEquals(myAccountPage.getTextOfMyAccountPage(), "MY ACCOUNT", "MY ACCOUNT text should be match");
        softAssert.assertAll();
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}
