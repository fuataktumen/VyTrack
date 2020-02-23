package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class CalendarEventsPage extends BasePage {

    public CalendarEventsPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[title='Create Calendar event']")
    public WebElement createCalendarEvent;

    @FindBy(xpath = "(//a[@data-toggle='dropdown'])[20]")
    public WebElement threeDots;

    @FindBy(css = "[title='Grid Settings']")
    public WebElement GridSettings;

    @FindBy(xpath = "(//input[@data-role='renderable'])[7]")
    public WebElement GS_İnvitationStatus;

    @FindBy(xpath = "(//input[@data-role='renderable'])[6]")
    public WebElement GS_Recurrence;

    @FindBy(xpath = "(//input[@data-role='renderable'])[5]")
    public WebElement GS_Recurrent;

    @FindBy(xpath = "(//input[@data-role='renderable'])[4]")
    public WebElement GS_End;

    @FindBy(xpath = "(//input[@data-role='renderable'])[3]")
    public WebElement GS_Star;

    @FindBy(xpath = "(//input[@data-role='renderable'])[2]")
    public WebElement GS_Calendar;

    @FindBy(xpath = "(//input[@data-role='renderable'])[1]")
    public WebElement GS_title;





}