import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserTest {

     @Test(groups = "smoke")
  public void openBrowser() throws Exception {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Page title: " + driver.getTitle());
     ScreenshotUtil.capture(driver, "google-page-" + System.currentTimeMillis() + ".png");
        driver.quit();
    }
}