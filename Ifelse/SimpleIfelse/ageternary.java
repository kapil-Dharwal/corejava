import java.util.Scanner;
class Age
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("entyer ANY number");
		int a=sc.nextInt();

		String x=(a>=18? "you can vote" : "you cant vote");
		System.out.println(x);
		
	}
	
}	