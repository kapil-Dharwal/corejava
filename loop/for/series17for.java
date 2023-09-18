//-2^1/1 + 2^2/2-2^3/3 + 2^4/4-2^5/5 = -0.28125
import java.util.Scanner;

class Series_17
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int i=1,n1,n2;
		float p=1,sum=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		for(;i<=n2;i++)
		{
			p=p*n1;
			if(i%2==0)
			{
			   sum+=(i/p);
			   System.out.print(" + "+n1+"^"+i+"/"+i);
			}
			else
			{
				sum-=(i/p);
			    System.out.print("-"+n1+"^"+i+"/"+i);
			}
		}
		System.out.print(" = "+sum);
	}
}