package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerTest {
  @Test(priority=3)
  public void chromeDriverTest() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver = new ChromeDriver();
	  System.out.println("Chrome Browser");
	  driver.get("http://google.com");
	  System.out.println(driver.getTitle());
	  driver.quit();
  }
  
  @Test(priority=14)
  public void ieTest() {
	  WebDriverManager.iedriver().setup();
	  WebDriver driver = new InternetExplorerDriver();
	  System.out.println("Internet Explorer Browser");
	  driver.get("http://google.com");
	  System.out.println(driver.getTitle());
	  driver.quit();
  }
  
  @Test(priority=2)
  public void firefoxTest() {
	  WebDriverManager.firefoxdriver().setup();
	  WebDriver driver = new FirefoxDriver();
	  System.out.println("Firefox Browser");
	  driver.get("http://google.com");
	  System.out.println(driver.getTitle());
	  driver.quit();
  }

  //Edge driver is not working with WebDriverManager
//  @Test
//  public void edgeTest() {
//	  WebDriverManager.edgedriver();
//	  WebDriver driver = new EdgeDriver();
//	  System.out.println("Edge Browser");
//	  driver.get("http://google.com");
//	  System.out.println(driver.getTitle());
//	  driver.quit();
//  }
}
