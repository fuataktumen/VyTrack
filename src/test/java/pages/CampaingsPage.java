package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CampaingsPage extends BasePage{
    public CampaingsPage() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(css="[title='Create Campaign']")
    public WebElement createCampain;

    @FindBy(css="[id='user-menu']>a")
    public WebElement options ;

    @FindBy(xpath = "//label[contains(text(),'Total')]")
    public WebElement TotalOfText ;

    @FindBy(css = "[class='fa-cog hide-text']")
    public WebElement GridSettings;

    @FindBy (xpath = "//div[@class='btn-group']/button")
    public WebElement WievPerPage;

    @FindBy(css = ".fa-filter.hide-text")
    public WebElement filters;

    @FindBy(css = ".add-filter-button")
    public WebElement managefilters;



}
