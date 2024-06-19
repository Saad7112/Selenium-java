import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class MySeleniumTests {

    private WebDriver driver;

    @Before
    public void setUp() throws Exception {
        String remoteWebDriverUrl = "http://selenium-hub:4444/wd/hub";
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        driver = new RemoteWebDriver(new URL(remoteWebDriverUrl), capabilities);
    }

    @Test
    public void testApp() throws Exception {
        driver.get("http://app:3000");
        // Add your test code here
    }

    @After
    public void tearDown() throws Exception {
        if (driver != null) {
            driver.quit();
        }
    }
}

