//2!/1 + 4!/2 + 6!/3 = 254.0= 254.0>49
import java.util.Scanner;
class Series_17
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=2;
		float fact=1,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=1;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			System.out.print(x+"!/"+i);
			if(i<n)
				System.out.print(" + ");
			sum+=fact/i;
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
//2!/2 - 4!/4 + 6!/6 = 230.0>50
class Series_17_1
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=2;
		float fact=2,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=2;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum-=fact/x;
				System.out.print(" - "+x+"!/"+x);
			}
			else
			{
				sum+=fact/x;
				if(i>1)
				System.out.print(" + ");
				System.out.print(x+"!/"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
//2!/2 + 4!/4 - 6!/6 = -230.0>51
class Series_17_2
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number");
		int n = sc.nextInt();
		int i,x=2;
		float fact=2,sum=0;
		for(i=1;i<=n;i++)
		{	
			fact=2;
			for(int j=1;j<=x;j++)
			{
				fact*=j;
			}
			if(i%2==0)
			{
				sum+=fact/x;
				System.out.print(" + "+x+"!/"+x);
			}
			else
			{
				sum-=fact/x;
				if(i>1)
				System.out.print(" - ");
				System.out.print(x+"!/"+x);
			}
			x+=2;
		}
		System.out.print(" = "+sum);
	}
}
