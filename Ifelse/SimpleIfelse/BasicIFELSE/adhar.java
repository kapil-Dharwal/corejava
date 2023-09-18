import java.lang.String;
import java.util.Scanner;
class Adhar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter your name");
		String nam=sc.nextLine();

		System.out.println("Enter your DOB");
		int dob=sc.nextInt();
		
			sc.nextLine();
			
		System.out.println("Enter  Gender"); 
		gen = sc.nextLine();

		System.out.println("Enter your Adhar num");
		int num =sc.nextInt();

		System.out.println("|--------------------------------------------|");   
		System.out.println("|\t\tGOVT OF INDIA\t\t\t\t\t|");
		System.out.println("||--------|  NAME : ");
		System.out.println("||        |  DOB : "+dob);
		System.out.println("||________|  GEN : "+gen);
		System.out.println("|\t\t ADHAR NUMBER\n\t\t");
	}
}