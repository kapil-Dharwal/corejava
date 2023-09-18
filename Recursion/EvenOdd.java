import java.util.Scanner;
class Test
{
	public static int even(int m)
	{
		if(m>0)
		{
			if(m%2==0)
			{
				even(m-1);
				System.out.print(m+" ");
			}
			else
			{
				even(m-1);
			}
		}System.out.println();
		return 0;
		
	}
	public static int odd(int m)
	{
		if(m>0)
		{
			if(m%2!=0)
			{
				odd(m-1);
				System.out.print(m+" ");
			}
			else
			{
				odd(m-1);
			}
		}
		return 0;
	}
		public static void main(String args [])
		{
			Scanner sc=new Scanner (System.in);
			System.out.println(" Enter Even Numbers:");
			int m=sc.nextInt();
		    Test ob=new Test();
			int x= ob.even(m);
			 x = ob.odd(m);
		}
}