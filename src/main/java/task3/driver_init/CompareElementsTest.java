package task3.driver_init;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
public class CompareElementsTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.linkedin.com/signup");

        WebElement element1 = driver.findElement(By.id("email-address"));
        WebElement element2 = driver.findElement(By.id("password"));
        compareElements(element1, element2);
        driver.quit();
    }
    public static void compareElements(WebElement element1, WebElement element2) {
        int element1Y = element1.getLocation().getY();
        int element2Y = element2.getLocation().getY();
        int element1X = element1.getLocation().getX();
        int element2X = element2.getLocation().getX();

        if (element1Y < element2Y) {
            System.out.println("Element 1 is higher on the page than Element 2");
        } else if (element1Y > element2Y) {
            System.out.println("Element 2 is higher on the page than Element 1");
        } else {
            System.out.println("Both elements are at the same vertical position");
        }

        if (element1X < element2X) {
            System.out.println("Element 1 is more to the left on the page than Element 2");
        } else if (element1X > element2X) {
            System.out.println("Element 2 is more to the left on the page than Element 1");
        } else {
            System.out.println("Both elements are at the same horizontal position");
        }
        int element1Width = element1.getSize().getWidth();
        int element1Height = element1.getSize().getHeight();
        int element2Width = element2.getSize().getWidth();
        int element2Height = element2.getSize().getHeight();
        int element1Area = element1Width * element1Height;
        int element2Area = element2Width * element2Height;
        if (element1Area > element2Area) {
            System.out.println("Element 1 occupies a larger area than Element 2");
        } else if (element1Area < element2Area) {
            System.out.println("Element 2 occupies a larger area than Element 1");
        } else {
            System.out.println("Both elements occupy the same area");
        }
    }
}

