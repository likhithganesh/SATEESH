package my_frist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class autosugtiondropdwon {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/dropdownsPractise/");
		drive.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(5000);
		drive.findElement(By.cssSelector("div[id='select-class-example'] span[class='ui-helper-hidden-accessible']")).click();
		
		
		
	}

}
