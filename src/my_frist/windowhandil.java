package my_frist;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
       drive.get("https://rahulshettyacademy.com/loginpagePractise/#");
       drive.findElement(By.cssSelector(" body:nth-child(2) > a.blinkingText:nth-child(1)")).click();
       Set<String> windows =drive.getWindowHandles();
       Iterator<String>it = windows.iterator();
       String parentId = it.next();
       String childId = it.next();
       drive.switchTo().window(childId);
       
       
       System.out.println(drive.findElement(By.cssSelector(".im-para.red")).getText());
       String emailId = drive.findElement(By.cssSelector(".im-para.red")).getText();
      drive.switchTo().window(parentId);
      drive.findElement(By.id("username")).sendKeys(emailId);
      
       
       
		
	}

}
