package test.java;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uploadfile {

	public static void main(String[] args) throws IOException {
		//Instantiation of driver object. To launch Firefox browser
		System.setProperty("webdriver.chrome.driver", "D:\\Software\\Tester\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//To open URL "http://softwaretestingmaterial.com"
		driver.get("http://softwaretestingplace.blogspot.com/2015/10/sample-web-page-to-test.html");
		//Locating 'browse' button
		WebElement browse =driver.findElement(By.id("uploadfile"));
		//To click on the 'browse' button
		browse.sendKeys("C:\\Users\\admin\\Desktop\\SosanhSP\\errorAdd.png");
		//To call the AutoIt script
		Runtime.getRuntime().exec("C:\\Users\\admin\\Desktop\\SosanhSP\\errorAdd.png");
		//'close' method is used to close the browser window
		driver.close();
	}

}
