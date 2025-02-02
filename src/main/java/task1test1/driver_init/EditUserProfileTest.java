package task1test1.driver_init;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class EditUserProfileTest {
    private WebDriver driver;

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qa-course-01.andersenlab.com/login");
        WebElement emailField = driver.findElement(By.name("email"));
        emailField.sendKeys("maria_7657@mail.ru");
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("a12345678");
        WebElement signInButton = driver.findElement(By.xpath("//button[@type='submit']"));
        signInButton.click();
        // не понимаю, как обращатья к Edit, если это не поле, не кнопка, а кликабельная картинка. Каким элеметом ее называть? На этом месте тест перестает работать//
        WebElement edit = driver.findElement(By.cssSelector("shrink-0 mt-16 w-8 aspect-square max-md:mt-10 cursor-pointer"));
        edit.click();

    }

    }

