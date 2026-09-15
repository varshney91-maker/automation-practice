import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

    public static void capture(WebDriver driver, String fileName) throws IOException {
        new File("target/screenshots").mkdirs();

        File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        File destination = new File("target/screenshots/" + fileName);

      java.nio.file.Files.copy(
        source.toPath(),
        destination.toPath(),
        java.nio.file.StandardCopyOption.REPLACE_EXISTING
);
    }
}