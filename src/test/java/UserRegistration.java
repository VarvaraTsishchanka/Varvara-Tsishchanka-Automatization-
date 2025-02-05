import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class UserRegistration {
    private WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-course-01.andersenlab.com/registration");
        registerUser(driver, "Varvara", "a12345678", "user1@example.com");
        registerUser(driver, "Virginia", "a12345678", "user2@example.com");
        registerUser(driver, "Calliope", "a12345678", "user3@example.com");
        driver.quit();
    }
    public static void registerUser(WebDriver driver, String username, String password, String email) {
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("email")).sendKeys(email);
        driver.findElement(By.id("submit")).click();
    }
}


