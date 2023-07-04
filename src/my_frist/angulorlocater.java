package my_frist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class angulorlocater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/angularpractice/");
//		drive.findElement(By.cssSelector(".form-control.ng-pristine.ng-invalid.ng-touched");
		WebElement nameEditBox = drive.findElement(By.cssSelector("[name=name]"));
		
		System.out.println(drive.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		WebElement dateofbirth	 =drive.findElement(By.xpath("//input[@name='bday']"));		
		drive.findElement(with(By.tagName("input")).below(dateofbirth)).click();
		WebElement abc	=drive.findElement(By.xpath("//label[normalize-space()='Check me out if you Love IceCreams!']"));
		
		drive.findElement(with(By.tagName("input")).toLeftOf(abc)).click();
		WebElement cba=	drive.findElement(By.xpath("//label[@for='exampleFormControlRadio1']"));
	
		drive.findElement(with(By.tagName("input")).toRightOf(cba)).click();
		
	}

}
