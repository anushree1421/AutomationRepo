package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebBaseTest;
import utils.Utility;

public class HomePage extends WebBaseTest {
    @FindBy(xpath="//a[@id='accountbutton']")
    WebElement loginBtn;
    @FindBy(xpath = "//input[@name='q']")
    WebElement searchTextBox;
    @FindBy(xpath="//button[@aria-label='Submit']")
    WebElement searchBtn;
    @FindBy(xpath="//h1[@class='browse-title']")
    WebElement homePageTitle;
    @FindBy(xpath ="//a[@id='dropdown3']" )
    WebElement hover;
    @FindBy(xpath="//a[@href='/training']")
    WebElement clickElement;
    @FindBy(xpath = "//div[@class='nmasthead_text ']")
    WebElement trainingTitle;
    @FindBy(xpath="//select[@class='filter-set-input']")
    WebElement dropDown;
    @FindBy(xpath="//a[@class='youtube']")
    WebElement youtubeOption;
    @FindBy(xpath = "//a[@id='dropdown3']")
    WebElement newWindow;
    @FindBy(xpath="//h2[@class='social-block__h2']")
    WebElement windowHandle;

    public HomePage(){
        PageFactory.initElements(driver,this);
    }

    public static void forCookiesFind() {
        Utility.getCookies();

    }
    /*public static void forCookiesAdd(String key1, String key2) {
        Utility.addCookie(key1,key2);

    }*/

    public void loginClick(){loginBtn.click();}
    public void searchClick() {
        searchTextBox.sendKeys("Shorts");
        searchTextBox.sendKeys(Keys.ENTER);
        searchBtn.click();
    }
    public void mouseHover(){
        Utility.mouseHover(driver,hover);
    }
    public void clickElement() {
        clickElement.click();
    }
    public void selectDropDown(String term,String value) {
        dropDown.click();
        Utility.selectValue(dropDown,term,value);
    }
    public void windowClick(){
        Utility.scrollDownByElement(driver, youtubeOption);
        youtubeOption.click();
        Utility.switchToWindows(driver);
    }

    public String getTextOfHomePage() {
        return homePageTitle.getText();
    }
    public String getTextOfTraining()
    {
        return trainingTitle.getText();
    }

    public String getTextOfNewWindow() {
        return newWindow.getText();
    }

    public String getTextOfWindowHandle() {
        return windowHandle.getText();
    }
}


