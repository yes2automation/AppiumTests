package AppiumTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;
import static java.time.Duration.ofSeconds;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.testng.annotations.Test;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidTouchAction;
import io.appium.java_client.touch.offset.ElementOption;

public class LongPressTest extends Base {
  
  @Test
  public void testForLongPress() throws MalformedURLException {
	  
	  AndroidDriver<AndroidElement> driver = startApp();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  //use uiautomatorviewer to fetch Object properties
	  driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	  //using xpath 
	  driver.findElementByXPath("//android.widget.TextView[@text='Expandable Lists']").click();
	  //using xpath with *
	  driver.findElementByAndroidUIAutomator("text(\"1. Custom Adapter\")").click();
	  driver.findElementByAndroidUIAutomator("text(\"People Names\")").click();
	  
	  //code for Long Press
	  WebElement we = driver.findElementByAndroidUIAutomator("text(\"Chuck\")");
	  AndroidTouchAction touchOpt = new AndroidTouchAction(driver);
	  touchOpt.longPress(longPressOptions().withElement(element(we)).withDuration(ofSeconds(2))).release().perform();
	  System.out.println(driver.findElementById("android:id/title").isDisplayed());
  }
}
