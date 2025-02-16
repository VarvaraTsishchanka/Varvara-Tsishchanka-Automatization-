package parallelismus;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class ParallelClass1 {
    WebDriver driver = new ChromeDriver();

    @Test
    public void parallel1() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("firstName")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test
    public void parallel2() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("lastName")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test
    public void parallel3() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("dateOfBirth")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test
    public void parallel4() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("email")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test
    public void parallel5() throws InterruptedException {
        Thread.sleep(2000);
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("password")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
}
