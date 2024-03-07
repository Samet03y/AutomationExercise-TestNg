package tests;

import com.github.javafaker.Faker;
import jdk.jfr.consumer.RecordedMethod;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SignupLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class TestCase_1 {

    @Test
    public void registerUserTest() {

        //  1. Launch browser
        //  2. Navigate to url 'http://automationexercise.com'
        Driver.getDriver().get(ConfigReader.getProperty("oeUrl"));
        //  3. Verify that home page is visible successfully
        HomePage homePage = new HomePage();
        assertTrue(homePage.homePageIcon.isDisplayed());
        //  4. Click on 'Signup / Login' button
        homePage.signupLoginButton.click();
        //  5. Verify 'New User Signup!' is visible
        SignupLoginPage signupLoginPage = new SignupLoginPage();
        String actualText = signupLoginPage.newUserSignUpYazisi.getText();
        String expextedText = "New User Signup";
        //  6. Enter name and email address
        Faker faker = new Faker();
        signupLoginPage.newUserSignUpdakiName.sendKeys(faker.name().name());
        signupLoginPage.newUserSignUpdakiEmailAddress.sendKeys(faker.internet().emailAddress());
        //  7. Click 'Signup' button
        signupLoginPage.newUserSignUpdakiSignUp.click();
        //  8. Verify that 'ENTER ACCOUNT INFORMATION' is visible
        assertTrue(signupLoginPage.ENTERACCOUNTINFORMATIONText.isDisplayed());
        //  9. Fill details: Title, Name, Email, Password, Date of birth
        //  10. Select checkbox 'Sign up for our newsletter!'
        //  11. Select checkbox 'Receive special offers from our partners!'
        //  12. Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number

        Actions actions = new Actions(Driver.getDriver());
        actions.click(signupLoginPage.titleMr).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB).sendKeys("2").sendKeys(Keys.TAB)
                .sendKeys("March").sendKeys(Keys.TAB).sendKeys("1987")
                .sendKeys(Keys.TAB).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.bekle(1);
        actions.click(signupLoginPage.sUpForkutusu).sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("jjhgh").sendKeys(Keys.TAB).sendKeys("uiyututyg").sendKeys(Keys.TAB).sendKeys(Keys.TAB)
                .sendKeys("iuyuiyuiy").sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("C").sendKeys(Keys.TAB)
                .sendKeys("ahahahHAH").sendKeys(Keys.TAB).sendKeys("City").sendKeys(Keys.TAB)
                .sendKeys("64637737").sendKeys(Keys.TAB).sendKeys("55555555").sendKeys(Keys.PAGE_DOWN).perform();
        //  13. Click 'Create Account button'
        ReusableMethods.bekle(1);
        signupLoginPage.createAccountButton.click();
        //  14. Verify that 'ACCOUNT CREATED!' is visible
        assertTrue(signupLoginPage.ACCOUNTCREATEDYazisi.isDisplayed());
        //  15. Click 'Continue' button
        signupLoginPage.continueButtonKayitSonrasi.click();
        //  16. Verify that 'Logged in as username' is visible
        assertTrue(signupLoginPage.Loggedinasusername.isDisplayed());

        //  17. Click 'Delete Account' button
        signupLoginPage.deleteAccountButton.click();
        //  18. Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        assertTrue(signupLoginPage.accountDeletedYzisi.isDisplayed());
        signupLoginPage.continueButonuSilmeSonrasi.click();

        Driver.closeDriver();
    }

}
