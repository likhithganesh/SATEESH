package my_frist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class frarmework {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://jqueryui.com/droppable/");
		System.out.println(drive.findElement(By.tagName("iframe")).getSize());
		drive.switchTo().frame(drive.findElement(By.cssSelector(".demo-frame")));
		WebElement source = drive.findElement(By.id("draggable"));
		WebElement target = drive.findElement(By.id("droppable"));
		
		Actions a = new Actions(drive);
		a.dragAndDrop(source, target).build().perform();
		Thread.sleep(05000);
		drive.switchTo().defaultContent();
		
	}

}
