package TestCases;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class RunOnDockerFireFox {
	static RemoteWebDriver driver;
	
	@BeforeClass
	public void setup() throws MalformedURLException
	{
		//System.setProperty("webdriver.chrome.driver", "D://Downloads//chromedriver//chromedriver.exe");
		DesiredCapabilities dcap = DesiredCapabilities.firefox();
		dcap.setPlatform(Platform.LINUX);
		dcap.setVersion("");
		driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),dcap);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
		
	@Test
	public void dockerTest() throws IOException
	{
		driver.get("http://google.com");
		  System.out.println(driver.getTitle());
		  TakesScreenshot scrShot =((TakesScreenshot)driver);
		  File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
		  File DestFile=new File("D:\\abc.png");
		  FileUtils.copyFile(SrcFile, DestFile); 
		  driver.quit();
	}
}
