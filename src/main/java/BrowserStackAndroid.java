import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserStackAndroid {

    public static void main(String[] args)
            throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();
        HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();

        // Set your access credentials
        browserstackOptions.put("userName", "khalv_GNvjUL");
        browserstackOptions.put("accessKey", "dWFEyyfWwypzcaDKaqXe");

        // Set other BrowserStack capabilities
        browserstackOptions.put("appiumVersion", "1.22.0");
        browserstackOptions.put("projectName", "First Java Project");
        browserstackOptions.put("buildName", "browserstack-build-1");
        browserstackOptions.put("sessionName", "first_test");

        // Passing browserstack capabilities inside bstack:options
        caps.setCapability("bstack:options", browserstackOptions);

        // Set URL of the application under test
        caps.setCapability("app", "bs://2405757b14a2cfc5f9cdce890541c9a0cfc3c289");

        // Specify deviceName and platformName for testing
        caps.setCapability("deviceName", "Google Pixel 3");
        caps.setCapability("platformName", "android");
        caps.setCapability("platformVersion", "9.0");

        // Initialise the remote Webdriver using BrowserStack remote URL
        // and desired capabilities defined above
        AndroidDriver driver = new AndroidDriver(
                new URL("https://khalv_GNvjUL:dWFEyyfWwypzcaDKaqXe@hub-cloud.browserstack.com/wd/hub"),
                caps
        );
    }
}