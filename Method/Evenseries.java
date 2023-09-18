import java .util.Scanner;
class Even
{
	public static void evan()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			System.out.print(i+" ");
		}
	}
	public static void main(String arg[])
	{
	Even.evan();
	}
}