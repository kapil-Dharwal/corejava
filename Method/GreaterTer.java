import java.util.Scanner;
class Great		
{
		public static void tarnry()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter three number");
			int n=sc.nextInt();
			int m=sc.nextInt();
			int p=sc.nextInt();
			String x=((n>m)?"n is greater":(m>p)?"m is gretar":"p is greater");
			System.out.println(x);
		}
		public static void main(String arg[])
		{
		Great.tarnry();
		}
}