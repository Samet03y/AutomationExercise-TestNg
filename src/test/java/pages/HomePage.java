package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() { PageFactory.initElements(Driver.getDriver(), this); }

@FindBy(xpath = "(//div[@class=\"carousel-inner\"])[1]") public WebElement homePageIcon;
@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a") public WebElement signupLoginButton;
@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a") public WebElement productsButton;
@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[3]/a") public WebElement cartButton;
@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[7]/a") public WebElement videoTutorials;
@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[8]/a") public WebElement contactUs;
@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[7]/a") public WebElement videoTutorialsButton;
@FindBy(id = "accordian") public WebElement categoriler;
@FindBy(xpath = "//*[@id=\"accordian\"]/div[1]/div[1]/h4/a") public WebElement womenCatogory;
@FindBy(xpath = "//*[text()=\"Dress \"]") public WebElement dressWomen;
@FindBy(xpath = "//*[text()=\"Tops \"]") public WebElement topsWomen;
@FindBy(xpath = "//*[text()=\"Saree \"]") public WebElement sareeWomen;

@FindBy(xpath = "//*[@id=\"accordian\"]/div[2]/div[1]/h4/a") public WebElement menCatogory;
@FindBy(xpath = "//*[text()=\"Jeans \"]") public WebElement jeansMen;
@FindBy(xpath = "//*[text()=\"Tshirts \"]") public WebElement tshirtsMen;
@FindBy(xpath = "//*[@id=\"accordian\"]/div[3]/div[1]/h4/a") public WebElement kidsCatogory;






}
