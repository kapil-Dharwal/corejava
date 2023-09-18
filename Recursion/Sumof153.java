import java.util.Scanner;
class Sum
{
	public static int Sum(int x)
	{
		int p;
		
		if(x==0)
			p=0;
		else
			p=x%10+Sum(x/10);
		return p;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner (System.in);
		System.out.println("enter the number:");
		int m=sc.nextInt();
		Sum n=new Sum();
		int a=n.Sum(m);
		System.out.println("sum of natural num:"+a);
	}
}