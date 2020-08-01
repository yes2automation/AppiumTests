package TestCases;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.testng.annotations.Test;

public class HTMLunitDriverTest {
  @Test
  public void f() throws IOException {
	  //setting up HTML unit driver
      WebDriver driver = new HtmlUnitDriver();
      
      //logging has bet to off, not to display any CSS warning messages
      Logger logger = Logger.getLogger("");
      logger.setLevel(Level.OFF);
      
      //simple code
      driver.get("http://google.com");
      System.out.println("entering site name");
      driver.findElement(By.name("q")).sendKeys("docker hub");
      System.out.println("sending text to be searched");
      driver.findElement(By.id("lga")).click();
      System.out.println("clicked on image");
      System.out.println(driver.getTitle());
      driver.quit();
  }
}
