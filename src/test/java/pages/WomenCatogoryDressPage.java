package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class WomenCatogoryDressPage {
    public WomenCatogoryDressPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[text()=\"Women - Dress Products\"]") public WebElement womenDressProducts;
}
