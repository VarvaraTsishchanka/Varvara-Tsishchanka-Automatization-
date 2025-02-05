package priority;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
public class Priority1 {
    WebDriver driver = new ChromeDriver();

    @Test(priority = 7)
    public void a() {
        System.out.println("Тест a");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("firstName")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test(priority = 6)
    public void b() {
        System.out.println("Тест b");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("lastName")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }

    @Test(priority = 5)
    public void c() {
        System.out.println("Тест c");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("dateOfBirth")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
    @Test(priority = 4)
    public void d() {
        System.out.println("Тест d");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("email")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
    @Test(priority = 3)
    public void e() {
        System.out.println("Тест e");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("password")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
    @Test(priority = 2)
    public void f() {
        System.out.println("Тест f");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.name("passwordConfirmation")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
    @Test(priority = 1)
    public void g() {
        System.out.println("Тест g");
        driver.get("https://qa-course-01.andersenlab.com/registration ");
        boolean isSearchButtonPresent = driver.findElement(By.xpath("//button[@type='submit']")).isDisplayed();
        assertTrue(isSearchButtonPresent);
    }
}

