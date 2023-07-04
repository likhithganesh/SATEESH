package my_frist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HADLINGDROPDWONS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://rahulshettyacademy.com/dropdownsPractise/");
	WebElement staticDropwond = drive.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropwond);
		
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		dropdown.selectByVisibleText("AED");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByValue("USD");
		System.out.println(dropdown.getFirstSelectedOption().getText());
		drive.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		drive.findElement(By.xpath("//a[contains(text(),'Chennai (MAA)')]")).click();
		Thread.sleep(5000);
		drive.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		drive.findElement(By.xpath("//body[1]/form[1]/div[4]/div[2]/div[1]/div[5]/div[2]/div[2]/div[2]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[3]/div[1]/div[1]/ul[1]/li[10]/a[1]")).click();
		
		
	}

}
