package Homework18;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        LoginPage loginPage = new LoginPage(driver);

        driver.get("https://qa-course-01.andersenlab.com/login");
        loginPage.enterEmail("maria_7657@mail.ru");
        loginPage.enterPassword("a12345678");
        loginPage.clickSignInButton();

        driver.quit();
    }
}

