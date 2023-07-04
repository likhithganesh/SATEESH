package my_frist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseover {

	public static void main(String[] args  ){
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.amazon.in/");
//		drive.manage().window().maximize();
		Actions a = new Actions(drive);
		WebElement move = drive.findElement(By.cssSelector("#nav-link-accountList"));
		a.moveToElement(drive.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("helo").build().perform();
		
		
		
		a.moveToElement(move).contextClick().build().perform();
		
		
	
		
		
	}

}
