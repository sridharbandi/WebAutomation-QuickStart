import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService

fun main(args: Array<String>) {
    System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "./drivers/chromedriver")
    //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver")
    val driver = ChromeDriver()
    driver.get("http://www.google.com")
    val searchBox = driver.findElement(By.id("lst-ib"))
    searchBox.sendKeys("Selenium")
    searchBox.submit()
    driver.quit()
}