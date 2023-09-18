import java.util.Scanner;
class Sum
{
		public static int sum(int x)
		{
			if(x>0)
			{
				return x+sum(x-1);
			}
			else
			{
				return 0;
			}
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the number:");
			int n=sc.nextInt();
			Sum m=new Sum();
			int a=m.sum(n);
			System.out.println("sum of natural num:"+a);
		}		
}