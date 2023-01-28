package test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;
import testbase.WebBaseTest;

public class HomeTest extends WebBaseTest {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    public HomeTest(){
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
    public void verifySearchTextCredential()  {
        SoftAssert softAssert=new SoftAssert();
        homePage.searchClick();
        softAssert.assertEquals(homePage.getTextOfHomePage(), "All Running Shoes, Gear and Accessories", "All Running Shoes, Gear and Accessories text should be match");
        softAssert.assertAll();
    }
    @Test
    public void verifyMouseHover(){
        SoftAssert softAssert = new SoftAssert();
        homePage.mouseHover();
        softAssert.assertEquals(homePage.getTextOfNewWindow(), "Men", "Men text should be match");
        softAssert.assertAll();
    }
    @Test
    public void verifyDropDown(){
        SoftAssert softAssert = new SoftAssert();
        homePage.clickElement();
        homePage.selectDropDown("byVisibleText","Beginners");
        softAssert.assertEquals(homePage.getTextOfTraining(), "Fleet Feet Training Programs\n" +
                "For Beginners and Seasoned Runners", "Fleet Feet Training Programs\n" +
                "For Beginners and Seasoned Runners text should be match");
        softAssert.assertAll();
    }

    @Test
    public void verifyGetWindowHandle(){
        SoftAssert softAssert = new SoftAssert();
        homePage.windowClick();
        softAssert.assertEquals(homePage.getTextOfWindowHandle(), "Join our Newsletter", "Join our Newsletter text should be match");
        softAssert.assertAll();
    }
    @Test
    public void verifyCookiesGet(){
        SoftAssert softAssert = new SoftAssert();
        homePage.forCookiesFind();
        softAssert.assertAll();
    }
   /* @Test
    public void verifyAddCookie(String key1, String key2){
        SoftAssert softAssert = new SoftAssert();
        HomePage.forCookiesAdd(key1,key2);
        softAssert.assertAll();
    }*/
    @AfterMethod
    public void afterMethod(){
        driver.close();
    }
}




