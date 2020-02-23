package Tests;

import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CampaingsPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;

import java.util.ArrayList;
import java.util.List;

public class campaingsTest extends TestBase{

    @Test
            public void options(){

    extentLogger= report.createTest("Campaigns Page");
    LoginPage Lg = new LoginPage();
    String username = ConfigurationReader.get("storemanager_username");
    String password = ConfigurationReader.get("storemanager_password");
    Lg.login(username,password);
    extentLogger.info("username and password true");

        DashboardPage Ds = new DashboardPage();
        Ds.navigateToModule("Marketing" , "Campaigns");
        extentLogger.info("user in the Campaigns page");
        CampaingsPage CP = new CampaingsPage();
        BrowserUtils.waitFor(4);


        List<WebElement> underOption = driver.findElements(By.cssSelector("[id='user-menu']>a~ul"));

        System.out.println(CP.TotalOfText.getText());
        BrowserUtils.waitFor(4);
        String a [] = CP.TotalOfText.getText().split(" ");

        int s=Integer.parseInt(a[2]);

        List<WebElement> rowOfTable = driver.findElements(By.cssSelector("table[class^='grid']>thead~tbody>tr"));
        System.out.println(rowOfTable.size());

        System.out.println(s);
        Assert.assertEquals(rowOfTable.size(),s);
        extentLogger.info("Verify that row table number equal Total of Text number ");




}

@Test

    public void mainPage (){
    extentLogger= report.createTest("Campaigns Page");
    LoginPage Lg = new LoginPage();
    String username = ConfigurationReader.get("storemanager_username");
    String password = ConfigurationReader.get("storemanager_password");
    Lg.login(username,password);
    extentLogger.info("username and password true");
    DashboardPage Ds = new DashboardPage();
    Ds.navigateToModule("Marketing" , "Campaigns");

    CampaingsPage CP = new CampaingsPage();
    BrowserUtils.waitFor(4);
    BrowserUtils.waitForClickablility(CP.pageSubTitle,5);
    CP.pageSubTitle.click();
    extentLogger.info("user click page sub title ");
    List<WebElement> dropdownSubTitle = driver.findElements(By.xpath("(//ul[@class='dropdown-menu'])[3]/li"));
    ArrayList<String> exceptedDropdown = new ArrayList<>();
    BrowserUtils.waitFor(3);
    exceptedDropdown.add("All Campaigns");
    exceptedDropdown.add("Name One");
    BrowserUtils.waitFor(3);

    for (int i = 0; i < dropdownSubTitle.size(); i++) {


        Assert.assertEquals(dropdownSubTitle.get(i).getText(), exceptedDropdown.get(i));
    }
extentLogger.info("Verify that dropdown of Page subtitle");

}

@Test
    public void gridSettings(){
    extentLogger= report.createTest("Campaigns Page");
    LoginPage Lg = new LoginPage();
    String username = ConfigurationReader.get("storemanager_username");
    String password = ConfigurationReader.get("storemanager_password");
    Lg.login(username,password);
    extentLogger.info("username and password true");
    DashboardPage Ds = new DashboardPage();
    Ds.navigateToModule("Marketing" , "Campaigns");

    CampaingsPage CP = new CampaingsPage();
    BrowserUtils.waitFor(10);
    CP.GridSettings.click();

    List<WebElement> underGrid=driver.findElements(By.cssSelector("[id^='column-c32']"));

    BrowserUtils.waitFor(3);
    for (int i = 0; i <underGrid.size() ; i++) {

        BrowserUtils.waitFor(3);
        Assert.assertTrue(underGrid.get(i).isSelected());

    }

}

@Test
    public void WievPerPage(){
    extentLogger= report.createTest("Campaigns Page");
    LoginPage Lg = new LoginPage();
    String username = ConfigurationReader.get("storemanager_username");
    String password = ConfigurationReader.get("storemanager_password");
    Lg.login(username,password);
    extentLogger.info("username and password true");
    DashboardPage Ds = new DashboardPage();
    Ds.navigateToModule("Marketing" , "Campaigns");

    CampaingsPage CP = new CampaingsPage();
    BrowserUtils.waitFor(10);

    CP.WievPerPage.click();
    List<WebElement> underperPage = driver.findElements(By.xpath("//div[@class='btn-group open']/button/following-sibling::ul/li"));
    int [] a= new int [4];

    for (int i = 0; i <underperPage.size() ; i++) {


        a[i] = Integer.parseInt(underperPage.get(i).getText());
    }


        Assert.assertEquals(10,a[0]);
        Assert.assertEquals(25,a[1]);
        Assert.assertEquals(50,a[2]);
        Assert.assertEquals(100,a[3]);


}
@Test
    public  void filters(){
    extentLogger= report.createTest("Campaigns Page");
    LoginPage Lg = new LoginPage();
    String username = ConfigurationReader.get("storemanager_username");
    String password = ConfigurationReader.get("storemanager_password");
    Lg.login(username,password);
    extentLogger.info("username and password true");
    DashboardPage Ds = new DashboardPage();
    Ds.navigateToModule("Marketing" , "Campaigns");

    CampaingsPage CP = new CampaingsPage();
    BrowserUtils.waitFor(10);

    CP.filters.click();
    BrowserUtils.waitForClickablility(CP.managefilters,5);
    CP.managefilters.click();

    List<WebElement> underManageFilters = driver.findElements(By.cssSelector("[name=multiselect_0]"));
    BrowserUtils.waitFor(5);

    for (int i = 0; i <underManageFilters.size() ; i++) {


        Assert.assertTrue(underManageFilters.get(i).isSelected());
    }




}

@Test

    public void manageFilters(){

    extentLogger= report.createTest("Campaigns Page");
    LoginPage Lg = new LoginPage();
    String username = ConfigurationReader.get("storemanager_username");
    String password = ConfigurationReader.get("storemanager_password");
    Lg.login(username,password);
    extentLogger.info("username and password true");
    DashboardPage Ds = new DashboardPage();
    Ds.navigateToModule("Marketing" , "Campaigns");

    CampaingsPage CP = new CampaingsPage();
    BrowserUtils.waitFor(10);

    CP.filters.click();
    BrowserUtils.waitForClickablility(CP.managefilters,5);
    CP.managefilters.click();
    List<WebElement> underManageFilters = driver.findElements(By.cssSelector("[name=multiselect_0]"));
    BrowserUtils.waitFor(5);

    driver.findElement(By.xpath("//input[@placeholder='']")).sendKeys("na");
    BrowserUtils.waitFor(5);
    System.out.println(underManageFilters.get(0).getText());

}



}