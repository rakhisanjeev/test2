import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class ExecuteJavascript {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Rakhi-Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/modal");

        WebElement modalButton = driver.findElement(By.id("modal-button"));
        modalButton.click();
        Thread.sleep(5000);
        WebElement closeButton = driver.findElement(By.id("close-button"));
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeAsyncScript("arguments[0].click();", closeButton);
       // closeButton.click();
        Thread.sleep(5000);

        driver.quit();
    }
}
