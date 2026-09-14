import org.testng.annotations.Test;

public class BrowserTest {

    @Test
    public void openBrowser() {
        String browser = System.getenv("BROWSER");

        System.out.println("Browser received: " + browser);
    }
}