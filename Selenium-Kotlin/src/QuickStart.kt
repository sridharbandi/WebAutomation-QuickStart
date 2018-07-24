import org.openqa.selenium.By
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeDriverService

fun main(args: Array<String>) {
    System.setProperty(ChromeDriverService.CHROME_DRIVER_EXE_PROPERTY, "./drivers/chromedriver")
    //System.setProperty("webdriver.chrome.driver","./drivers/chromedriver")
    val driver = ChromeDriver()
    driver.get("https://sridharbandi.github.io/reactapp/")
    val searchBox = driver.findElement(By.id("idtext"))
    searchBox.sendKeys("Selenium")
    driver.findElement(By.id("idbutton")).click()
    driver.quit()
}