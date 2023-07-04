package my_frist;


	import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

	public class day1 {
 

		@Test
		public void webBikelone() {
		System.out.println("web api Bikelone ");
		
		}
		@Test
		public void mobileBikelone() {
		System.out.println("Mobile api web Bikelone ");
		
		}
		@Test
		public void apiBikelone() {
		System.out.println("api web Bikelone ");
		
		
		}
		@BeforeTest
		public void apiBikelone1() {
			System.out.println("this is1111111 api bike lone");
		}
		
	}

