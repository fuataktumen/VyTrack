package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utilities.Driver;

public class CreateCalendarEventsPage extends BasePage {

    public CreateCalendarEventsPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "[id^='recurrence-repeat-view']")
    public WebElement repeat;

    @FindBy(css = "[id^='recurrence-repeats-view']")
    public WebElement repeatOptions;
    @FindBy(className = "select2-chosen")
    public WebElement selectedOwner;

    @FindBy(css = "input[id^='oro_calendar_event_form_title-']")
    public WebElement title;

    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_start']")
    public WebElement startDate;
    @FindBy(css = "[id^='date_selector_oro_calendar_event_form_end']")
    public WebElement endDate;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_start']")
    public WebElement startTime;

    @FindBy(css = "[id^='time_selector_oro_calendar_event_form_end']")
    public WebElement endTime;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    public WebElement days;

    @FindBy(xpath = "(//input[@type='radio'])[2]")
    public WebElement weekday;

    @FindBy(xpath = "(//input[@type='radio'])[3]")
    public WebElement never;

    @FindBy(xpath = "(//input[@type='radio'])[4]")
    public WebElement after;

    @FindBy(xpath = "(//input[@type='radio'])[5]")
    public WebElement by;

    @FindBy(xpath = "//span[@class='caret']")
    public WebElement SaveAndClose;

    @FindBy (css = "[title='Cancel']")
    public WebElement Cancel;

    @FindBy (name= "oro_calendar_event_form[allDay]")
    public WebElement allDay;

    @FindBy (xpath = "(//input[@type='radio'])[1]" )
    public WebElement repeatEvery;

    @FindBy (css = ".control-group.recurrence-summary.alert-info")
    public  WebElement summary;

    @FindBy (xpath = "//input[@data-related-field='occurrences']")
    public  WebElement afterInput;

    @FindBy (xpath = "(//input[@placeholder='Choose a date'])[3]")
    public WebElement ByInputDate;

    @FindBy (css = ".ui-datepicker-year")
    public WebElement ByInputYear;

    @FindBy (css = ".ui-datepicker-month")
    public WebElement ByInputMonth;

    @FindBy(css = "[value='monday'][name^=re]")
    public WebElement monday;

    @FindBy(css = "[value='friday'][name^=re]")
    public WebElement friday;


    public Select repeatOptionsList(){
        return new Select(repeatOptions);
    }

}