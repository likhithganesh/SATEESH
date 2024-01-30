

	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class seond {
	public static void main(String[] args) throws InterruptedException {
		
 System.setProperty("webdriver.Chrome.driver" , "Desktop\\chromedriver_win32");
	 WebDriver drive = new ChromeDriver();
	 Thread. sleep( 3000);

	 drive.get("http://google.com");
	 drive.manage().window().fullscreen();
	 drive.manage().window().maximize();
	 drive.manage().window().fullscreen();
//	 drive.navigate().to("https://digitalseva.csc.gov.in/");
	 drive.navigate().back();
	 drive.navigate().forward();
	}}
 
//	 Thread.slpee(3000);
//	 drive.close();
//			}


