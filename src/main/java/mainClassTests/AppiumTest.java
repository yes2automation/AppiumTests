package mainClassTests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppiumTest {

	public static void main(String[] args) throws MalformedURLException {
		DesiredCapabilities dCap = new DesiredCapabilities();
		dCap.setCapability(MobileCapabilityType.DEVICE_NAME,"Emu1-5-And9");
		dCap.setCapability(MobileCapabilityType.APP, "D:\\yes2automation\\Udemy\\Appium\\ApiDemos-debug.apk");
		dCap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
		AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dCap);
		driver.quit();
	}

}
