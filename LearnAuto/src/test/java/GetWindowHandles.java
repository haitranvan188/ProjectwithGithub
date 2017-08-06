package test.java;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Tester\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		Set<String> handles = driver.getWindowHandles();
		
		int count = handles.size();
		System.out.println(count);
		driver.close();
	}

}
