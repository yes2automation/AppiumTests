package AppiumTests;

import static io.appium.java_client.touch.offset.ElementOption.element;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class DragAndDropTest extends Base{
	
  @Test
  public void dragDropTest() throws MalformedURLException {
	  AndroidDriver<AndroidElement> driver = startApp();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  
	  //test for swiping the application
	  driver.findElementByAndroidUIAutomator("text(\"Views\")").click();
	  driver.findElementByAndroidUIAutomator("text(\"Drag and Drop\")").click();
	  
	  WebElement dragfrom = driver.findElementsByClassName("android.view.View").get(0);
	  WebElement dropTo = driver.findElementsByClassName("android.view.View").get(1);
	  
	  //using Touch Action for Drag and Drop here
	  TouchAction touchAct = new TouchAction(driver);
	  System.out.println("Dragiing the ball from position 1 to position 2");
 
	  touchAct.longPress((element(dragfrom))).moveTo(element(dropTo)).release().perform();
  }
}
