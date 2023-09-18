import java.util.Scanner;
class Costprice
{
	public static void cpsp()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two number");
		int cp=sc.nextInt();
		int sp=sc.nextInt();
		if (sp>cp)
		{
			System.out.println("profit");
		}
		else if(cp>sp)
		{
		 System.out.println("loss");
		}
		 else
		 {
			System.out.println("no profit no loss");
		 }
	}
	public static void main(String args[])
	{
		Costprice ob=new Costprice();
		ob.cpsp();
	}
}