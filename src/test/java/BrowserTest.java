import org.testng.annotations.Test;

public class BrowserTest {

    @Test(groups = "smoke")
    public void openBrowser() {
        String browser = System.getenv("BROWSER");

        System.out.println("Browser received: " + browser);
    }
}