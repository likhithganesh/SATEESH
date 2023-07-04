package my_frist;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class day3 {
	
	@AfterTest
	public void apiBikelone3() {
		System.out.println("this is 333333 api bike lone");}
	@Test
	public void carloginCarLone() {
		System.out.println("webloginCarLone");
		
	}
	@Test
	public void carloginHomeLone() {
		System.out.println("MobielogincarLone");
		
	}
	@Test
	public void carloginLone() {
		System.out.println("ApiloginCarLone");}
	
	@BeforeMethod
		public void carparkinglong8() {
		System.out.println("carpartking 88888progblue");}
		
		
	
	
	@AfterSuite
	public void carparkinglong() {
		System.out.println("carpartking  55555555 progblue");}
	@Test
	public void carparkinglong() {
		System.out.println("carpartking progblue");
	}
	@BeforeTest
	public void apiBikelone2() {
		System.out.println("this is 2222222 api bike lone");
	}}


