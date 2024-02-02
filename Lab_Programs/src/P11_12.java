import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P11_12 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.gecko.driver","D:\\geckodriver-v0.33.0-win64\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://lms.nmit.ac.in/moodle/login/index.php");
        WebElement mailid = driver.findElement(By.id("username"));
        mailid.sendKeys("1NT21CS084");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("");
        WebElement submit = driver.findElement(By.id("loginbtn"));
        submit.submit();
        Thread.sleep(100000);
        driver.quit();
    }
}