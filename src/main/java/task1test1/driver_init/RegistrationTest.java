package task1test1.driver_init;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
public class RegistrationTest {
    private WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-course-01.andersenlab.com/registration");
        WebElement firstNameField = driver.findElement(By.name("firstName"));
        firstNameField.click();
        firstNameField.sendKeys("Мария");
        WebElement lastNameField = driver.findElement(By.name("lastName"));
        lastNameField.sendKeys("Мищенко");
        WebElement dobField = driver.findElement(By.name("dateOfBirth"));
        dobField.sendKeys("01/01/1990");
        dobField.sendKeys(Keys.RETURN);
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("maria_76257@mail.ru");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("a12345678");
        WebElement passwordConfirmationField = driver.findElement(By.name("passwordConfirmation"));
        passwordConfirmationField.sendKeys("a12345678");
        WebElement submitButton = driver.findElement(By.xpath("//button[@type='submit']"));
        submitButton.click();
    }
    public void tearDown() {
        driver.quit();
    }
}


