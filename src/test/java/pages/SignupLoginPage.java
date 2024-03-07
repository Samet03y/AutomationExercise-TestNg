package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class SignupLoginPage {
    public SignupLoginPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/h2") public WebElement loginToYourAccontYazisi;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]") public WebElement loginToYourAccontdakiEmail;
    @FindBy(xpath = "//input[@data-qa=\"login-password\"]") public WebElement loginToYourAccontdakiPassword;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div[3]/div/h2") public WebElement newUserSignUpYazisi;
    @FindBy(xpath = "//*[@data-qa=\"signup-name\"]") public WebElement newUserSignUpdakiName;
    @FindBy(xpath = "//*[@data-qa=\"signup-email\"]") public WebElement newUserSignUpdakiEmailAddress;
    @FindBy(xpath = "//*[@data-qa=\"login-button\"]") public WebElement newUserSignUpdakiloginButton;
    @FindBy(xpath = "//*[@data-qa=\"signup-button\"]") public WebElement newUserSignUpdakiSignUp;
    @FindBy(xpath = "//*[text()='Enter Account Information']") public WebElement ENTERACCOUNTINFORMATIONText;
    @FindBy(id = "uniform-id_gender1") public WebElement titleMr;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/div[6]/label") public WebElement sUpForkutusu;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div[1]/form/button") public WebElement createAccountButton;
    @FindBy(xpath = "//*[text()='Account Created!']") public WebElement ACCOUNTCREATEDYazisi;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a") public WebElement continueButtonKayitSonrasi;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[10]/a") public WebElement Loggedinasusername;
    @FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[5]/a") public WebElement deleteAccountButton;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/h2/b") public WebElement accountDeletedYzisi;
    @FindBy(xpath = "//*[@id=\"form\"]/div/div/div/div/a") public WebElement continueButonuSilmeSonrasi;


}
