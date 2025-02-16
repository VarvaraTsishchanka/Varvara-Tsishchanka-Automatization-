package Homework18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTestFail {
    private WebDriver driver;
    private RegistrationPage registrationPage;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        registrationPage = new RegistrationPage(driver);
    }

    @Test
    public void testRegistrationFail() {
        driver.get("https://qa-course-01.andersenlab.com/registration");
        registrationPage.enterFirstName("Ольга");
        registrationPage.enterLastName("Романова");
        registrationPage.enterDOB("01/01/1990");
        registrationPage.enterEmail("olga_165677mail.ru");
        registrationPage.enterPassword("a12345678");
        registrationPage.enterPasswordConfirmation("a12345678");
        registrationPage.clickSubmitButton();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

