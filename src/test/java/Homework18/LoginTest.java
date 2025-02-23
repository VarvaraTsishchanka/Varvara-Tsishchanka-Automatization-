package Homework18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Step;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

public class LoginTest {
    private WebDriver driver;
    private LoginPage loginPage;
    private static final Logger logger = LogManager.getLogger(LoginTest.class);

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        loginPage = new LoginPage(driver);
        logger.info("WebDriver инициализирован и окно браузера максимально раскрыто.");
    }

    @Test
    public void testLogin() {
        driver.get("https://qa-course-01.andersenlab.com/login");
        logger.info("Открыта страница авторизации.");
        loginPage.enterEmail("maria_7657@mail.ru");
        loginPage.enterPassword("a12345678");
        loginPage.clickSignInButton();
        logger.info("Форма авторизации заполнена и отправлена.");
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            logger.info("WebDriver завершен и браузер закрыт.");
        }
    }
}
