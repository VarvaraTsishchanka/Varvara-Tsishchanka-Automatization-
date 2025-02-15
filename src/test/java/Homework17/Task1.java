package Homework17;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Task1 {
    WebDriver driver;
    WebDriverWait wait;
    Actions actions;

    @DataProvider(name = "loginData")
    public Object[][] loginData() {
        return new Object[][]{
                {"test111@mail.ru", "a12345678"},
        };
    }

    @BeforeMethod
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        actions = new Actions(driver);
    }

    @Test(dataProvider = "loginData")
    public void testLogin(String email, String password) {
        driver.get("https://qa-course-01.andersenlab.com/login");

        WebElement usernameField = driver.findElement(By.name("email"));
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        usernameField.sendKeys(email);
        passwordField.sendKeys(password);
        loginButton.click();

        wait.until(ExpectedConditions.invisibilityOf(loginButton)); // Ожидаем, пока кнопка исчезнет (или появится что-то другое)
        actions.moveToElement(driver.findElement(By.xpath("//div[text()='AQA Practice']")));
        actions.moveToElement(driver.findElement(By.xpath("//div[contains(text(), 'Select')]")))

        .click();

        // Лучше использовать явное ожидание, а не Thread.sleep
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='your-expected-element']")));  // Замените на XPath ожидаемого элемента
    }

    @AfterMethod
    public void teardown() {
        if (driver != null) {
            driver.quit(); // Закрываем драйвер после теста
        }
    }
}