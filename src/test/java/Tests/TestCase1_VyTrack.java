package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CalendarEventsPage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ConfigurationReader;

import java.util.List;

public class TestCase1_VyTrack extends TestBase {

@Test

    public void ObtionİsDisplayed(){

    LoginPage LP = new LoginPage();
    String userName = ConfigurationReader.get("driver_username");
    String password = ConfigurationReader.get("driver_password");
    LP.login(userName,password);

    DashboardPage DP = new DashboardPage();
    DP.navigateToModule("Activities", "Calendar Events");

    Assert.assertEquals(DP.getPageSubTitle(),"Calendar Events");


}
@Test
    public void pageNumber(){

    LoginPage LP = new LoginPage();
    String userName = ConfigurationReader.get("driver_username");
    String password = ConfigurationReader.get("driver_password");
    LP.login(userName,password);

    DashboardPage DP = new DashboardPage();
    DP.navigateToModule("Activities","Calendar Events");




    WebElement inputNumber = driver.findElement(By.xpath("//input[@type='number']"));
    String actualNumber =inputNumber.getAttribute("value");
    int a  = Integer.parseInt(actualNumber);

    System.out.println(a);

    Assert.assertEquals(a,1);
}
@Test
    public void perPage(){
    LoginPage LG = new LoginPage();
    String userName = ConfigurationReader.get("driver_username");
    String password = ConfigurationReader.get("driver_password");
    LG.login(userName,password);

    DashboardPage DB = new DashboardPage();
    DB.navigateToModule("Activities" , "Calendar Events");


   WebElement perPage = driver.findElement(By.xpath("(//button[@data-toggle='dropdown'])[1]"));

   String actual= perPage.getText();
   int a = Integer.parseInt(actual);
   Assert.assertEquals(a,25);


}

@Test

    public void rowsNumber(){

    LoginPage LP = new LoginPage();
    String userName = ConfigurationReader.get("driver_username");
    String password = ConfigurationReader.get("driver_password");
    LP.login(userName,password);

    DashboardPage DB = new DashboardPage();
    DB.navigateToModule("Activities" , "Calendar Events");

    List<WebElement> listOF = driver.findElements(By.cssSelector(".grid.table-hover.table.table-bordered.table-condensed tbody>tr"));
    System.out.println(listOF.size());

    WebElement number = driver.findElement(By.xpath("//label[contains(text(),'Total of')]"));
    String[] array = number.getText().split(" ");
    String expected = array[2];
    int a = Integer.parseInt(expected);

    Assert.assertEquals(listOF.size(),a);


}
@Test

    public void checkBox () throws InterruptedException {

    LoginPage LG = new LoginPage();
    String username = ConfigurationReader.get("driver_username");
    String password = ConfigurationReader.get("driver_password");
    LG.login(username,password);

    DashboardPage DB = new DashboardPage();
    DB.navigateToModule("Activities" , "Calendar Events");

    Thread.sleep(5000);

     driver.findElement(By.xpath("(//input[@type='checkbox'])[7]")).click();

    Thread.sleep(5000);

    for (int i = 8; i <= 25; i++) {

        String xpath = "(//input[@type='checkbox'])[" + i + "]";

        Thread.sleep(3000);

            Assert.assertTrue(driver.findElement(By.xpath(xpath)).isSelected());




//  String rowXpath = "//table[@id='table1']/tbody/tr[" + i + "]";
//            WebElement singleRow = driver.findElement(By.xpath(rowXpath));
//            System.out.println(singleRow.getText());
//(//input[@type='checkbox'])[8]
    }

}


}
