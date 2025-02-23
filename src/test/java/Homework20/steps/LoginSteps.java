package Homework20.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    private WebDriver driver;

    @Given("the user navigates to the login page")
    public void the_user_navigates_to_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-course-01.andersenlab.com/login");
        throw new io.cucumber.java.PendingException();

    }

    @When("the user enters the email {string}")
    public void the_user_enters_the_email(String email) {
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys(email);
        throw new io.cucumber.java.PendingException();

    }

    @When("the user enters the password {string}")
    public void the_user_enters_the_password(String password) {
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys(password);
        throw new io.cucumber.java.PendingException();

    }

    @When("the user clicks the sign-in button")
    public void the_user_clicks_the_sign_in_button() {
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();
        throw new io.cucumber.java.PendingException();

    }

    @Then("the user should be successfully logged in")
    public void the_user_should_be_successfully_logged_in()
    {
        driver.quit();
    }
}

