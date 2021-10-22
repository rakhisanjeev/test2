import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Rakhi-Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://formy-project.herokuapp.com/autocomplete");

        WebElement autocomplete = driver.findElement(By.id("autocomplete"));
        autocomplete.sendKeys("26 E Cortona Ct Mountain House CA");
        Thread.sleep(1000);
        WebElement autocompleteResult = driver.findElement(By.className ("pac-item"));
        autocompleteResult.click();
        Thread.sleep(10000);
        driver.quit();
    }
}
