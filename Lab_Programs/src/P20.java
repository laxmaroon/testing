import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

        public class P20 {
        public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        WebDriver driver = new ChromeDriver();
// FirefoxDriver(), etc
        driver.get("https://www.google.com");
        System.out.println(driver.getTitle());
        Thread.sleep(4000);
        driver.quit();
        }
        }