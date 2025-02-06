package grouping;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class Groups {
    WebDriver driver = new ChromeDriver();

    @Test(groups = "first")
    public void one() {
        System.out.println("Тест one");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("firstName")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test(groups = "second")
    public void two() {
        System.out.println("Тест two");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("lastName")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test(groups = "first")
    public void three() {
        System.out.println("Тест three");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("dateOfBirth")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test(groups = "second")
    public void four() {
        System.out.println("Тест four");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("email")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test(groups = "first")
    public void five() {
        System.out.println("Тест five");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("password")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test(groups = "second")
    public void six() {
        System.out.println("Тест six");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("passwordConfirmation")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test(groups = "first")
    public void seven() {
        System.out.println("Тест seven");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test(groups = "second")
    public void eight() {
        System.out.println("Тест eight");
        driver.get("https://qa-course-01.andersenlab.com/login ");
        boolean isSearchButtonPresent = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
}


