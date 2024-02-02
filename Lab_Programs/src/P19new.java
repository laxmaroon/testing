import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P19new {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Visit the webpage with alerts
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

        // Handle simple alert
        WebElement simpleAlertButton = driver.findElement(By.id("alertBox"));
        simpleAlertButton.click();

        // Wait for alert to appear
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        Alert simpleAlert = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println("Simple alert text: " + simpleAlert.getText());
        simpleAlert.accept();

        // Handle confirmation alert
        WebElement confirmButton = driver.findElement(By.id("confirmBox"));
        confirmButton.click();

        // Wait for confirmation alert
        Alert confirmationAlert = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println("Confirmation alert text: " + confirmationAlert.getText());
        confirmationAlert.accept(); // Or use confirmationAlert.dismiss();

        // Handle prompt alert
        WebElement promptButton = driver.findElement(By.id("promptBox"));
        promptButton.click();

        // Wait for prompt alert
        Alert promptAlert = wait.until(ExpectedConditions.alertIsPresent());

        System.out.println("Prompt alert text: " + promptAlert.getText());
        promptAlert.sendKeys("die('lol')");
        promptAlert.accept();

        driver.quit();
    }
}
