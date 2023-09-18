// - 2^1 + 2^2 - 2^3 + 2^4 - 2^5=-22
import java.util.Scanner;

class Series
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int i=1,n1,n2,p=1,sum=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		while(i<=n2)
		{
			p=p*n1;
			if(i%2==0)
			{
			   sum+=p;
			   System.out.print(" + "+n1+"^"+i);
			}
			else
			{
				sum-=p;
				System.out.print(" - "+n1+"^"+i);
			}
			i++;
		}
		System.out.print("="+sum);
	}
}