package Homework20.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import static org.testng.AssertJUnit.assertTrue;

public class Login1Steps {

    private WebDriver driver;

    @Given("the user navigates to the login page")
    public void givenTheUserIsOnLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-course-01.andersenlab.com/login");
    }

    @When("the user enters an incorrect email and password")
    public void whenTheUserEntersInvalidCredentials() {
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("maria_7657mail.ru");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("a12345678");
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();
    }

    @Then("the user should see an error message")
    public void thenTheUserShouldSeeErrorMessage() {
        WebElement errorMessage = driver.findElement(By.xpath("//div[@class='error-message']"));
        assertTrue("Error message is not displayed", errorMessage.isDisplayed());
    }
    public void tearDown() {
        driver.quit();
    }
}
