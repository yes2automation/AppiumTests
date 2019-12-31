package AppiumTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class TapTest extends Base{
	
  @Test
  public void tapOptionsTest() throws MalformedURLException {
	  AndroidDriver<AndroidElement> driver = startApp();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  TouchAction t = new TouchAction(driver);
	 
	  //use tapOptions to tap the elements instead of clicking
	  WebElement view = driver.findElementByAndroidUIAutomator("text(\"Views\")");
	  t.tap(tapOptions().withElement(element(view))).perform();
	  
	  WebElement expList = driver.findElementByAndroidUIAutomator("text(\"Expandable Lists\")"); 
	  t.tap(tapOptions().withElement(element(expList ))).perform();
	 
	  driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
  }
}
