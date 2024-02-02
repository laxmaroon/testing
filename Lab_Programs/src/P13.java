// Prog 13

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P13 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        // WebDriverWait wait = new WebDriverWait(driver, 3);

        driver.get("https://www.google.com");
        driver.findElement(By.name("q")).sendKeys("facebook");
        driver.findElement(By.name("q")).submit();
        driver.navigate().to("https://www.facebook.com");
        driver.findElement(By.name("email")).sendKeys("test@gmail.com");
        driver.findElement(By.name("login")).submit();
        Thread.sleep(5000);
        driver.navigate().back();
        driver.navigate().refresh();
        // Wait for some time to allow the video page to load
        Thread.sleep(5000);
        driver.navigate().back();
        driver.navigate().forward();
        Thread.sleep(5000);
        driver.quit();

    }
}

