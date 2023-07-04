import java.util.jar.Attributes.Name;

public class javavariableanddatatypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> a = new ArrayList<String>();
		int myNum =5;
		String name = "sateesh";
		double dec = 5.99;
		Boolean answer = true;
		System.out.println(myNum + " is my favaret number");
		System.out.println(name);
//		Arrays
//		
		int [] arr3 = {1,2,3,4,5,6,8,7,9,10,12,13,14,16};
		for (int i=0 ; i < arr3.length; i++)
		{
			if (arr3[i] %2==0)
{
	System.out.println(arr3[i]);
	}
			else{
			System.out.println(arr3[i]+ "is not not");
			}
		}
		
		
	}

}
