package DEmo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class New1 {
		public static void main1(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumWebdriver\\Chromedriver\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com/");

	}

}
