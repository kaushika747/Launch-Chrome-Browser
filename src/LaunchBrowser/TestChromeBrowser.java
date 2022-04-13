//KAUSHIKA NAIK
//KAUSHIKARV@GMAIL.COM
//08.04.2022

//Launching Selenium website in Chrome Browser

package LaunchBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChromeBrowser {

	public static void main(String[] args) {
		//
		System.setProperty("webdriver.chrome.driver", 
				"D:\\DXC Selenium Automation Testing\\LaunchChromeBrowser\\SeleniumBrowserJars\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); //creating instance 
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		driver.quit();
	}

}
