package Homework18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys;

public class RegistrationPage {

    private WebDriver driver;

    private By firstNameField = By.name("firstName");
    private By lastNameField = By.name("lastName");
    private By dobField = By.name("dateOfBirth");
    private By emailField = By.name("email");
    private By passwordField = By.name("password");
    private By passwordConfirmationField = By.name("passwordConfirmation");
    private By submitButton = By.xpath("//button[@type='submit']");

    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Actions
    public void enterFirstName(String firstName) {
        driver.findElement(firstNameField).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(lastNameField).sendKeys(lastName);
    }

    public void enterDOB(String dob) {
        WebElement dobElement = driver.findElement(dobField);
        dobElement.sendKeys(dob);
        dobElement.sendKeys(Keys.RETURN);
    }

    public void enterEmail(String email) {
        driver.findElement(emailField).sendKeys(email);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void enterPasswordConfirmation(String passwordConfirmation) {
        driver.findElement(passwordConfirmationField).sendKeys(passwordConfirmation);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }
}

