package my_frist;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.edge.EdgeDriver;

public class calssis {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		String name ="basina likhthganesh";
		
		drive.get("https://rahulshettyacademy.com/locatorspractice");
		
		drive.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
		drive.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		drive.findElement(By.xpath("//button[@class='submit signInBtn']")).click();
		Thread.sleep(2000);
		System.out.println(drive.findElement(By.tagName("p")).getText());
		Thread.sleep(5000);
		Assert.assertEquals(drive.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(drive.findElement(By.cssSelector("div[class='login-container'] h2")).getText(), "Hello "+name+ ",");
		drive.findElement(By.cssSelector(".logout-btn")).click();
		Thread.sleep(2000);
		drive.close();
		}}

