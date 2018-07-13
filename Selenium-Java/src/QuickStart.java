import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

public class QuickStart {

    public static void main(String[] args){
        System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY,"./drivers/chromedriver");
        //
        //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        WebElement searchBox = driver.findElement(By.id("lst-ib"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        driver.quit();
    }
}
