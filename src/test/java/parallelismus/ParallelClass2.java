package parallelismus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class ParallelClass2 {
    WebDriver driver = new ChromeDriver();
    @Test
    public void parallel6() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("passwordConfirmation")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
    @Test
    public void parallel7() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
    @Test
    public void parallel8() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/login ");
        boolean isSearchButtonPresent = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
    @Test
    public void parallel9() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/login ");
        boolean isSearchButtonPresent = driver.findElement(By.name("email")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
    @Test
    public void parallel10() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/login ");
        boolean isSearchButtonPresent = driver.findElement(By.name("password")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
}

