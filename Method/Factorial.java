import java .util.Scanner;
class Fact
{
	public static void factorial()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.print(fact+" ");
	}
	public static void main(String arg[])
	{
	Fact.factorial();
	}
}