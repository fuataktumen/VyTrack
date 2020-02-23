package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalendarEventsPage;
import pages.CreateCalendarEventsPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;

import java.util.Arrays;
import java.util.List;

public class CalenderEventsPageTest extends TestBase {

    @Test
    public void TestersMeeting() throws InterruptedException {
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        LP.login(username, password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");

        CalendarEventsPage cep = new CalendarEventsPage();

        action.clickAndHold(cep.threeDots).perform();
        Thread.sleep(3000);

        cep.threeDots.click();

        List<String> expectedList  = Arrays.asList("Delete","Edit", "View");
        List<WebElement> threeDotOptionsList= driver.findElements(By.xpath("(//ul[@class ='nav nav-pills icons-holder launchers-list'])[1]//li"));

        List<String> actualList = BrowserUtils.getElementsText(threeDotOptionsList);

        Assert.assertEquals(actualList,expectedList);






    }















    @Test
    public void TitleColumn (){

        extentLogger=report.createTest("Title Column");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");
        CalendarEventsPage cep = new CalendarEventsPage();
        cep.waitUntilLoaderScreenDisappear();
        cep.GridSettings.click();
        cep.GS_Star.click();
        cep.GS_Recurrent.click();
        cep.GS_Recurrence.click();
        cep.GS_İnvitationStatus.click();
        cep.GS_End.click();
        cep.GS_Calendar.click();
        cep.GridSettings.click();
    extentLogger.info("Verify that all the GridSettings are disappear without title");
        Assert.assertTrue(cep.GS_title.isSelected());



    }
    @Test

    public void Save(){

        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");
        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();

        ccsp.waitUntilLoaderScreenDisappear();
        driver.findElement(By.cssSelector("[title='Create Calendar event']")).click();
        extentLogger.info("Navigate Create Calendar Events");

        ccsp.waitUntilLoaderScreenDisappear();
        ccsp.SaveAndClose.click();
        extentLogger.info("Save And Close is clickable");
        List<WebElement> listOfElement = driver.findElements(By.xpath("//ul[@data-options='" +
                "{\"align\": \"right\", \"attachToParent\": \"true\"}']/li"));

        WebElement SaveAndClose = listOfElement.get(0);
        WebElement SaveAndNew = listOfElement.get(1);
        WebElement Save = listOfElement.get(2);

        Assert.assertTrue(SaveAndClose.isDisplayed());
        Assert.assertTrue(SaveAndNew.isDisplayed());
        Assert.assertTrue(Save.isDisplayed());
        extentLogger.info("İsDisplayed SaveAndClose , SaveEndNew , Save");



    }
    @Test
    public void Cancel(){

        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");
        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();


        ccsp.waitUntilLoaderScreenDisappear();
        driver.findElement(By.cssSelector("[title='Create Calendar event']")).click();
        extentLogger.info("Navigate Create Calendar Events");

        BrowserUtils.waitFor(2);
        ccsp.Cancel.click();
        extentLogger.info(" Click Cancel button");
        System.out.println(ccsp.pageSubTitle);
        Assert.assertTrue(ccsp.pageSubTitle.isDisplayed());
        extentLogger.info("Page subtitle isDisplayed");

    }
    @Test

    public void endStarTime(){
        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");


        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();

        ccsp.waitUntilLoaderScreenDisappear();


        driver.findElement(By.cssSelector("[title='Create Calendar event']")).click();
        extentLogger.info("Navigate Create Calendar Events");
        BrowserUtils.waitFor(2);


    }
    @Test

    public void SelectTime(){

        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");


        CalendarEventsPage cep = new CalendarEventsPage();
        cep.waitUntilLoaderScreenDisappear();
        cep.createCalendarEvent.click();
        extentLogger.info("Navigate Create Calendar Events");

        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();

        ccsp.waitUntilLoaderScreenDisappear();


        BrowserUtils.waitFor(2);

        ccsp.startTime.click();

        driver.findElement(By.xpath("(//li[text()='9:00 PM'])")).click();
        BrowserUtils.waitFor(4);
        WebElement expectedTime = driver.findElement(By.xpath("(//li[@class='ui-timepicker-pm ui-timepicker-selected'])[2]"));
        BrowserUtils.waitFor(3);
        Assert.assertEquals(expectedTime.getText(),"10:00 PM");
    }

    @Test

    public void AllDyaEvent(){
        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");
        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();

        ccsp.waitUntilLoaderScreenDisappear();
        driver.findElement(By.cssSelector("[title='Create Calendar event']")).click();
        extentLogger.info("Navigate Create Calendar Events");
        BrowserUtils.waitFor(2);
        ccsp.waitUntilLoaderScreenDisappear();
        ccsp.allDay.click();
        Assert.assertTrue(ccsp.allDay.isSelected());
        BrowserUtils.waitFor(3);
        Assert.assertFalse(ccsp.endTime.isDisplayed());
        Assert.assertFalse(ccsp.startTime.isDisplayed());
        Assert.assertTrue(ccsp.selectedOwner.isDisplayed());
        Assert.assertTrue(ccsp.endDate.isDisplayed());




    }
    @Test
    public void repeat (){

        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");
        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();

        ccsp.waitUntilLoaderScreenDisappear();
        driver.findElement(By.cssSelector("[title='Create Calendar event']")).click();
        extentLogger.info("Navigate Create Calendar Events");
        BrowserUtils.waitFor(2);

        ccsp.repeat.click();
        Assert.assertTrue(ccsp.repeat.isSelected());
        extentLogger.info("Repeat button isSelected");
        Select ListOfDaily = new Select(ccsp.repeatOptions);
        Assert.assertEquals(ListOfDaily.getFirstSelectedOption().getText(),"Daily");
        extentLogger.info("First select option Daily is isDisplayed automatically ");
        BrowserUtils.waitFor(2);
        ListOfDaily.getFirstSelectedOption().click();
        BrowserUtils.waitFor(2);
        Assert.assertEquals(ListOfDaily.getOptions().get(1).getText(),"Weekly");
        Assert.assertEquals(ListOfDaily.getOptions().get(2).getText(),"Monthly");
        Assert.assertEquals(ListOfDaily.getOptions().get(3).getText(),"Yearly");
        extentLogger.info("All options are available in repeats drop_down");
    }

    @Test

    public void repeatEvery(){
        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");
        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();

        ccsp.waitUntilLoaderScreenDisappear();
        driver.findElement(By.cssSelector("[title='Create Calendar event']")).click();
        extentLogger.info("Navigate Create Calendar Events");
        BrowserUtils.waitFor(2);

        ccsp.repeat.click();
        Assert.assertTrue(ccsp.repeat.isSelected());
        extentLogger.info("Repeat button isSelected");

        Assert.assertTrue(ccsp.repeatEvery.isSelected());

        Assert.assertTrue(ccsp.never.isSelected());

        String expectedMessage= "Summary:\n" +
                "Daily every 1 day";
        String actualResult = ccsp.summary.getText();
        Assert.assertEquals(actualResult,expectedMessage);

    }
    @Test
    public void endsOption(){
        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");
        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();

        ccsp.waitUntilLoaderScreenDisappear();
        driver.findElement(By.cssSelector("[title='Create Calendar event']")).click();
        extentLogger.info("Navigate Create Calendar Events");
        BrowserUtils.waitFor(2);

        ccsp.repeat.click();
        BrowserUtils.waitFor(2);
        ccsp.after.click();
        ccsp.afterInput.sendKeys("10");

        BrowserUtils.waitFor(4);
        ccsp.summary.click();
        String expectedText = "Summary:\n" +
                "Daily every 1 day, end after 10 occurrences";
        String actualText = ccsp.summary.getText();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(actualText,expectedText);
    }
    @Test
    public void By(){
        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");
        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();

        ccsp.waitUntilLoaderScreenDisappear();
        driver.findElement(By.cssSelector("[title='Create Calendar event']")).click();
        extentLogger.info("Navigate Create Calendar Events");
        BrowserUtils.waitFor(2);
        ccsp.repeat.click();
        BrowserUtils.waitFor(2);
        ccsp.by.click();
        BrowserUtils.waitFor(2);
        ccsp.ByInputDate.click();

        Select listOfYear = new Select(ccsp.ByInputYear);
        listOfYear.selectByVisibleText("2021");
        BrowserUtils.waitFor(2);
        Select listOfMonth = new Select(ccsp.ByInputMonth);
        listOfMonth.selectByVisibleText("Nov");

        driver.findElement(By.xpath("//a[text()='18']")).click();

        String expectedText = "Summary:\n" +
                "Daily every 1 day, end by Nov 18, 2021";
        String actualText = ccsp.summary.getText();
        BrowserUtils.waitFor(3);
        Assert.assertEquals(actualText,expectedText);

    }
    @Test
    public void weekly(){
        extentLogger = report.createTest("SaveAndClose");
        LoginPage LP = new LoginPage();
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");
        extentLogger.info("Username: " + username  );
        extentLogger.info("password: " + password);
        extentLogger.info("Login as store manager: " );
        LP.login(username,password);

        DashboardPage DB = new DashboardPage();
        DB.navigateToModule("Activities", "Calendar Events");
        extentLogger.info("navigate Activities --- Calendar Events ");
        CreateCalendarEventsPage ccsp = new CreateCalendarEventsPage();

        ccsp.waitUntilLoaderScreenDisappear();
        driver.findElement(By.cssSelector("[title='Create Calendar event']")).click();
        extentLogger.info("Navigate Create Calendar Events");
        BrowserUtils.waitFor(2);
        ccsp.repeat.click();
        BrowserUtils.waitFor(2);
        ccsp.repeatOptions.click();
        Select selectoptions = new Select(ccsp.repeatOptions);
        selectoptions.selectByVisibleText("Weekly");
        ccsp.monday.click();
        ccsp.friday.click();
        Assert.assertTrue(ccsp.monday.isSelected());
        Assert.assertTrue(ccsp.friday.isSelected());






    }


}
