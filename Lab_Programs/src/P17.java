// Prog 17
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class P17 {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/upload/");

//        WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));
//
//        uploadElement.sendKeys("C:\\Users\\Karthik Rao\\Downloads\\336_lecture4_2007.pdf");
        driver.findElement(By.id("uploadfile_0")).sendKeys("D:/V SEM/ST/TOOL BASED SOFTWARE TESTING_21CSA593_PROGRAMS.pdf");
        driver.findElement(By.id("terms")).click();
        driver.findElement(By.name("send")).click();
    }
}