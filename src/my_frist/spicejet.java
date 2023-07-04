package my_frist;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class spicejet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.spicejet.com/");
		Thread.sleep(5000);
		drive.findElement(By.cssSelector("div[class='css-1dbjc4n'] div div[class='css-1dbjc4n r-14lw9ot r-11u4nky r-z2wwpe r-1phboty r-rs99b7 r-1loqt21 r-13awgt0 r-ymttw5 r-5njf8e r-1otgn73']")).click();
	int i=1;
	while(i<5)
	{	drive.findElement(By.cssSelector("div[class='r-1awozwy r-19m6qjp r-y47klf r-1loqt21 r-eu3ka r-1777fci r-1otgn73 r-1i6wzkk r-lrvibr r-1aockid css-1dbjc4n']")).click();
	i++;
	
	}
	}

}
