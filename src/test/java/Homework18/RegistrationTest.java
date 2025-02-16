package Homework18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegistrationTest {
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
    public void testRegistration() {
        driver.get("https://qa-course-01.andersenlab.com/registration");
        registrationPage.enterFirstName("Марияф");
        registrationPage.enterLastName("Мищенкор");
        registrationPage.enterDOB("01/01/1990");
        registrationPage.enterEmail("maria_76256666633437@mail.ru");
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

