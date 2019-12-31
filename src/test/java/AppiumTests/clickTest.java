package AppiumTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class clickTest extends Base {

	
  @Test
  public void checkXpathAndId() throws MalformedURLException {
	  AndroidDriver<AndroidElement> driver = startApp();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //use uiautomatorviewer to fetch Object properties
	  driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	  
	  //using xpath 
	  driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
	  
	  //using xpath with *
	  driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
	  
  }
}
