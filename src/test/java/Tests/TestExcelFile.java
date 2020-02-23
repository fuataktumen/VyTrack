package Tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.BasePage;
import pages.DashboardPage;
import pages.LoginPage;
import utilities.ExcelUtil;

public class TestExcelFile extends TestBase {
    @DataProvider
    public Object[][] readExcel() {
        ExcelUtil excelFile = new ExcelUtil("src/test/resources/Vytracktestdata.xlsx", "QA3-short");

        System.out.println(excelFile.columnCount());
        System.out.println(excelFile.rowCount());

        System.out.println(excelFile.getColumnsNames());
    String [] [] data = excelFile.getDataArrayWithoutFirstRow();
return data;
    }

    @Test(dataProvider = "readExcel")

    public void readExcelFile(String username,String password, String firstname,String lastname){

        LoginPage LG = new LoginPage();
        LG.login(username,password);

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.waitUntilLoaderScreenDisappear();
        String actualFullname =dashboardPage.getUserName();
        String expectedFullname= firstname+" "+lastname;
        Assert.assertEquals(actualFullname,expectedFullname,"Compare fullnames");
    }
}