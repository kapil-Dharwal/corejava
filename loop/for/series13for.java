//2^1/2 - 2^2/3 + 2^3/4 - 2^4/5 + 2^5/6 = 3.8000002
import java.util.Scanner;

class Series_13
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int i=1,n1,n2,j=2;
		float p=1,sum=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		for(;i<=n2;i++)
		{
			p=p*n1;
			if(i%2==0)
			{
			   sum-=(p/j);
			   System.out.print(" - "+n1+"^"+i+"/"+j);
			}
			else
			{
				sum+=(p/j);
				if(i>1)
				System.out.print(" + ");	
			    System.out.print(n1+"^"+i+"/"+j);
			}
			j++;
		}
		System.out.print(" = "+sum);
	}
}