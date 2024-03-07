package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MenCatogoryJeansPage {
    public MenCatogoryJeansPage() { PageFactory.initElements(Driver.getDriver(), this); }

    @FindBy(xpath = "//*[text()=\"Men - Jeans Products\"]") public WebElement menJeansProducts;

}
