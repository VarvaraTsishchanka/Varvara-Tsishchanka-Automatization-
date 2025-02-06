import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.testng.Assert.assertEquals;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;

public class LoginTestsVersion2 {

    @Parameters({"email", "password"})
    @Test
    public void testLogin(String email, String password) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://qa-course-01.andersenlab.com/login");

            WebElement usernameField = driver.findElement(By.name("email"));
            WebElement passwordField = driver.findElement(By.name("password"));
            WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

            usernameField.sendKeys(email);
            passwordField.sendKeys(password);
            loginButton.click();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.invisibilityOf(loginButton));

            assertEquals(driver.getCurrentUrl(), "https://qa-course-01.andersenlab.com/");
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (driver != null) {
                driver.quit();
            }
        }
    }
}

