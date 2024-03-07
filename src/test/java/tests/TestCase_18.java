package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.MenCatogoryJeansPage;
import pages.WomenCatogoryDressPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class TestCase_18 extends TestBaseRapor {
    @Test  public void  ViewCategoryProductsTest(){
        extentTest=extentReports.createTest("ViewCategoryProductsTesti","Kullanici tikladigi katagorinin gorunurlulugubu test eder");
        SoftAssert softAssert=new SoftAssert();
    //  1. Launch browser
    //  2. Navigate to url 'http://automationexercise.com'

        Driver.getDriver().get(ConfigReader.getProperty("oeUrl"));
        extentTest.info("Kullanici http://automationexercise.com safasina gider");
    //  3. Verify that categories are visible on left side bar

        HomePage homePage=new HomePage();
        softAssert.assertTrue(homePage.categoriler.isDisplayed(),"Anasayfa gorunur degil");
        extentTest.pass("Anasayfanin gorunurlulugunu test eder");
    //  4. Click on 'Women' category

        homePage.womenCatogory.click();
        extentTest.info("Women katogrisine tiklar");
    //  5. Click on any category link under 'Women' category, for example: Dress
       // homePage.womenCatogory.click();

        homePage.dressWomen.click();
        extentTest.info("dress katogrisine tiklar");
    //  6. Verify that category page is displayed and confirm text 'WOMEN - TOPS PRODUCTS'

        softAssert.assertTrue(homePage.categoriler.isDisplayed(),"kotogori gorunur degil");
        extentTest.pass("Katagori gorunurlulugunu test eder");
        WomenCatogoryDressPage womenCatogoryPage=new WomenCatogoryDressPage();
        String actualText=womenCatogoryPage.womenDressProducts.getText();
        String expectedText="WOMEN - TOPS PRODUCTS";

        softAssert.assertEquals(actualText,expectedText,"actual Text, "+expectedText+" degil!");
        extentTest.pass("girilen sayfada WOMEN - TOPS PRODUCTS gorundugunu test eder");
    //  7. On left side bar, click on any sub-category link of 'Men' category
        homePage.menCatogory.click();
        extentTest.info("katogori altindaki jeans e tiklar");

        homePage.jeansMen.click();
        extentTest.info("katogori altindaki jeans e tiklar");
    //  8. Verify that user is navigated to that category page

        MenCatogoryJeansPage menCatogoryJeansPage= new MenCatogoryJeansPage();
        softAssert.assertTrue(menCatogoryJeansPage.menJeansProducts.isDisplayed(),"Istenen sayfada degilsiniz!");
        extentTest.pass("katogori sayfasinda oldugunu test eder");
        softAssert.assertAll();

    Driver.closeDriver();

    }
}
