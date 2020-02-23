package pages;

import Tests.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;

public class verifyContactInfoTests extends TestBase {

    @Test
    public void contactDetailsTest(){
        extentLogger = report.createTest("contactDetailsTest");
        LoginPage loginPage = new LoginPage();
        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");
        extentLogger.info("username: "+username);
        extentLogger.info("password: "+password);
        extentLogger.info("Login as a sales manager");
        loginPage.login(username,password);
        ContactsPage contactsPage = new ContactsPage();
        extentLogger.info("Navigate to Customer -- Contacts Page");
        contactsPage.navigateToModule("Customers","Contacts");
        contactsPage.waitUntilLoaderScreenDisappear();
        BrowserUtils.waitFor(2);
        extentLogger.info("Click on mbrackstone9@example.com email");
        contactsPage.getContactEmail("mbrackstone9@example.com").click();
        ContactInfoPage contactInfoPage = new ContactInfoPage();
        BrowserUtils.waitFor(2);
        String actualFullname = contactInfoPage.fullname.getText();
        String expectedFullname = "Ms Mariam Brackstone";
        extentLogger.info("Verify fullname is "+expectedFullname);
        Assert.assertEquals(actualFullname,expectedFullname,"Verify fullnames");
        extentLogger.info("Verify email is mbrackstone9@example.com");
        Assert.assertEquals(contactInfoPage.email.getText(),"mbrackstone9@example.com","verify emails");
        extentLogger.info("Verify phone is 18982323434");
        Assert.assertEquals(contactInfoPage.phone.getText(),"+18982323434");
    }


}
