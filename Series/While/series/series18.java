//2^1/1 - 2^2/3 + 2^3/5 - 2^4/7 + 2^5/9 = 3.5365078
import java.util.Scanner;

class Series
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int i=1,n1,n2,j=1;
		float p=1,sum=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		while(i<=n2)
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
			i++;
			j+=2;
		}
		System.out.print(" = "+sum);
	}
}