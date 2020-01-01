package AppiumTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import static io.appium.java_client.touch.LongPressOptions.longPressOptions;
import static java.time.Duration.ofSeconds;
import static io.appium.java_client.touch.offset.ElementOption.element;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SwipeTest extends Base{
	
  @Test
  public void swipeTest() throws MalformedURLException {
	  AndroidDriver<AndroidElement> driver = startApp();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //test for swiping the application
	  driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	  driver.findElementByAndroidUIAutomator("text(\"Date Widgets\")").click();
	  driver.findElementByAndroidUIAutomator("text(\"2. Inline\")").click();
	  driver.findElementByXPath("//*[@content-desc='3']").click();
	  WebElement swipefrom = driver.findElementByXPath("//*[@content-desc='15']");
	  WebElement swipeTo = driver.findElementByXPath("//*[@content-desc='45']");
	  WebElement secondswipeTo = driver.findElementByXPath("//*[@content-desc='10']");
	  //using Touch Action for swipe here
	  TouchAction touchAct = new TouchAction(driver);
	  System.out.println("Swiping from 15 minutes to 45 minutes");
	  //this swipe is with wait Duration
	  touchAct.longPress(longPressOptions().withElement(element(swipefrom)).withDuration(ofSeconds(2))).moveTo(element(swipeTo)).release().perform();
	  System.out.println("Swiping from 45 minutes to 10 minutes");		  
	//this swipe is without any wait Duration
	  touchAct.longPress((element(swipeTo))).moveTo(element(secondswipeTo)).release().perform();
  }
}
