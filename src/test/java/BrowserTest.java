import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class BrowserTest {

     @Test(groups = "smoke")
  public void openBrowser() throws Exception {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

WebDriver driver = new ChromeDriver(options);

driver.get("https://www.google.com");

        driver.get("https://www.google.com");

        System.out.println("Page title: " + driver.getTitle());
     ScreenshotUtil.capture(driver, "google-page-" + System.currentTimeMillis() + ".png");
        driver.quit();
    }
}