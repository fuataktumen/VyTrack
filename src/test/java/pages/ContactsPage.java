package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utilities.Driver;

public class ContactsPage extends BasePage {

    //we dont need to create constructor and use PageFactory class here,
    //since we are extending from basepage
    //if you are trying to come up dynamic xpath you cannot use @Findby
    @FindBy(xpath = "//td[contains(text(),'mbrackstone9@example.com')][@data-column-label='Email']")
    public WebElement email;
    //create a method that accepts email as a String, and returns webelement based on that email.


    public WebElement getContactEmail(String email){



        String emailXpath = "//td[contains(text(),'"+email+"')][@data-column-label='Email']";
        return Driver.get().findElement(By.xpath(emailXpath));
    }

}
