package task2.driver_init;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.ArrayList;
import java.util.List;
public class ZooPageTest {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        List<String> urls = new ArrayList<>();
        urls.add("http://www.automationpractice.pl/index.php");
        urls.add("https://zoo.waw.pl/");
        urls.add("https://www.w3schools.com/");
        urls.add("https://www.clickspeedtester.com/click-counter/");
        urls.add("https://andersenlab.com/");
        List<String> windowHandles = new ArrayList<>();
        for (String url : urls) {
            driver.switchTo().newWindow(org.openqa.selenium.WindowType.TAB).get(url);
            windowHandles.add(driver.getWindowHandle());
        }
        for (String handle : windowHandles) {
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            String currentUrl = driver.getCurrentUrl();
            System.out.println("Title: " + title);
            System.out.println("URL: " + currentUrl);
            if (title.toLowerCase().contains("zoo")) {
                driver.close();
            }
        }
    }
}

