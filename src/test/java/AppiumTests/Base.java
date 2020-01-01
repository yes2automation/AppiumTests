package AppiumTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class Base {
 
	public AndroidDriver<AndroidElement> startApp() throws MalformedURLException
	{
		DesiredCapabilities dCap = new DesiredCapabilities();
		dCap.setCapability(MobileCapabilityType.APP, "D:\\yes2automation\\Udemy\\Appium\\ApiDemos-debug.apk");
		dCap.setCapability(MobileCapabilityType.DEVICE_NAME,"ZY223GZJQ7");
		dCap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),dCap);
		return driver;
		//driver.quit();
	}
}
