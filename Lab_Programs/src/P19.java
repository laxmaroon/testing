// Prog 19
//Simple alert
import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P19 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");
        driver.findElement(By.id("alertBox")).click();
        Alert simpleAlert = driver.switchTo().alert();
        System.out.println(simpleAlert.getText());
//        Thread.sleep(2000);
//        driver.findElement(By.name("OK")).click();
        simpleAlert.accept();
        Thread.sleep(2000);
//        driver.quit();
//    }
//}
//
        driver.findElement(By.id("confirmBox")).click();
        Alert confirmAlert = driver.switchTo().alert();
        System.out.println(confirmAlert.getText());
//        Thread.sleep(1000);
        confirmAlert.accept();
        // confirmAlert.dismiss();
        System.out.println(driver.findElement(By.id("output")).getText());
//        driver.quit();

        driver.findElement(By.id("promptBox")).click();
        Alert promptAlert = driver.switchTo().alert();
        System.out.println(promptAlert.getText());
        promptAlert.sendKeys("die('lol')");
        promptAlert.accept();
//        Thread.sleep(1000);
        System.out.println(driver.findElement(By.id("output")).getText());
        driver.quit();
    }

}
