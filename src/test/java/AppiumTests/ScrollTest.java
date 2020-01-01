package AppiumTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;

public class ScrollTest extends Base {
	
  @Test
  public void testScroll() throws MalformedURLException {
	  AndroidDriver<AndroidElement> driver = startApp();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //test for scrolling the application
	  driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	  
	  //scrolling via AndroidUI Automator, only downward scrolling by this method
	  System.out.println("Scrolling to Tabs");
	  driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"));");
	  System.out.println("Scrolled to Tabs");
	  
	  //we can scroll via TouchActions however we need to define element after 
	  //each scroll 
	  
	  
  }
}
