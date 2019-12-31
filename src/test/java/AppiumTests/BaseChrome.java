package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseChrome {
 
	public AndroidDriver<AndroidElement> startApp() throws MalformedURLException
	{
		DesiredCapabilities dCap = new DesiredCapabilities();
		dCap.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Device");
		dCap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		dCap.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
		dCap.setCapability("chromedriverExecutable","D:\\yes2automation\\Points 2 Remember\\chromedriver.exe");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dCap);
		return driver;
		//driver.quit();
	}
}
