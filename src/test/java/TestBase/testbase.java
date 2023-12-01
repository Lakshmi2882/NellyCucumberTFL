package TestBase;


import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class testbase {
	public static WebDriver driver;
	public WebDriver selectBrowser(String browser)
	{
		if(browser.equalsIgnoreCase("chrome"))
		{
	driver= new ChromeDriver();


	}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			//driver= new FirefoxDriver();
		}
	
return driver;
}
}
