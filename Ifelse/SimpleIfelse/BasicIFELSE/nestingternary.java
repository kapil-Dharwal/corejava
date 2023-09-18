import java.util.Scanner;
class Ternary
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int a=sc.nextInt();
	    int b=sc.nextInt();
	    int b=sc.nextInt();
	
		String x=(a==b? "both are same" : (a>b? "a is max" : "b is max"));
		
		System.out.println(x);	
		
	}
}	