package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }
    //same with driver.findElement(By.id("prependedInput"));
    @FindBy(id = "prependedInput")
    public WebElement usernameInput;
    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;
    @FindBy(id = "_submit")
    public WebElement loginBtn;

    public void login (String usernameStr , String passwordStr){

        usernameInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        loginBtn.click();
    }

}
