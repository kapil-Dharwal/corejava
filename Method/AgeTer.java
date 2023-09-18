import java.util.Scanner;
class Age
{
		public static void tarnry()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			int n=sc.nextInt();
			String x=((n>=18)?"iligible for vote":" not a vote");
			System.out.println(x);
		}
		public static void main(String arg[])
		{
		Age.tarnry();
		}
}