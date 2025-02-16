package task5.driver_init;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ProfileImageUploadTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://qa-course-01.andersenlab.com/login");
        WebElement element;
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("maria_7657@mail.ru");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("a12345678");
        WebElement signInButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
        signInButton.click();
        // не понимаю, как найти элемент Upload через xpath или css
        WebElement uploadInput = driver.findElement(By.xpath("//img[contains(@src,'upload_photo')]"));
        uploadInput.sendKeys("e:\\Screenshot_1.png");
        WebElement closeButton = driver.findElement(By.name("Close"));
        closeButton.click();
    }
}


