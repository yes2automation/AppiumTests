package AppiumTests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class MobileChrome extends BaseChrome{
	  
  @Test
  public void f() throws MalformedURLException {
	  //AndroidDriver<AndroidElement> driver = startApp();
	  WebDriver driver = startApp();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get("http://google.com");
      System.out.println("entering site name");
      driver.findElement(By.name("q")).sendKeys("docker hub");
      System.out.println("sending text to be searched");
      System.out.println(driver.getTitle());
      driver.quit();
  }
}
