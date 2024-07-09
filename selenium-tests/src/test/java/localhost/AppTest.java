import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

import static org.junit.Assert.assertTrue;

public class AppTest {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        String remoteWebDriverUrl = "http://localhost:4444/wd/hub"; // Adjusted to localhost
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL(remoteWebDriverUrl), capabilities);
    }

    @Test
    public void testApp() throws Exception {
        driver.get("http://hello-world-app:3000");

        // Assuming "Hello World!" is the only text on the page or is within a specific element.
        // Adjust the By locator to match the specific element if needed.
        WebElement bodyElement = driver.findElement(By.tagName("body"));
        String bodyText = bodyElement.getText();

        // Assert that the body text contains "Hello World!"
        assertTrue("Body does not contain 'no'", bodyText.contains("no!"));
    }

    @After
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }
}
