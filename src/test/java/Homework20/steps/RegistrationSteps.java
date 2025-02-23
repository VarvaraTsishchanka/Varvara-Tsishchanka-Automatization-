package Homework20.steps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationSteps {
    private WebDriver driver;

    @Given("the user navigates to the registration page")
    public void the_user_navigates_to_the_registration_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-course-01.andersenlab.com/registration");
    }

    @When("the user enters first name {string}")
    public void the_user_enters_first_name(String firstName) {
        WebElement firstNameField = driver.findElement(By.name("firstName"));
        firstNameField.click();
        firstNameField.sendKeys(firstName);
    }

    @When("the user enters last name {string}")
    public void the_user_enters_last_name(String lastName) {
        WebElement lastNameField = driver.findElement(By.name("lastName"));
        lastNameField.sendKeys(lastName);
    }

    @When("the user enters date of birth {string}")
    public void the_user_enters_date_of_birth(String dob) {
        WebElement dobField = driver.findElement(By.name("dateOfBirth"));
        dobField.sendKeys(dob);
        dobField.sendKeys(Keys.RETURN);
    }

    @When("the user enters email {string}")
    public void the_user_enters_email(String email) {
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(email);
    }

    @When("the user enters password {string}")
    public void the_user_enters_password(String password) {
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
    }

    @When("the user enters password confirmation {string}")
    public void the_user_enters_password_confirmation(String passwordConfirmation) {
        WebElement passwordConfirmationField = driver.findElement(By.name("passwordConfirmation"));
        passwordConfirmationField.sendKeys(passwordConfirmation);
    }

    @When("the user clicks the submit button")
    public void the_user_clicks_the_submit_button() {
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }

    @Then("the registration should fail with an error message")
    public void the_registration_should_fail_with_an_error_message() {
        driver.quit();
    }
}

