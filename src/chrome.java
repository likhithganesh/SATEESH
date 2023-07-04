import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chrome {

	public static void main(String[] args) {	
	WebDriver drive = new ChromeDriver();
	
		
		
	drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		drive.get("https://rahulshettyacademy.com/locatorspractice/");
		drive.findElement(By.linkText("Forgot your password?")).click();
		drive.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("ravan");
		drive.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("ravank");
		drive.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("91824181046");
		drive.findElement(By.xpath("(//button[normalize-space()='Reset Login'])[1]")).click();
	drive.findElement(by.qurry)
//		drive.findElement(By.id("visitUSOne")).click();
	}
}
