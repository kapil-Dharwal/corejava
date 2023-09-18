///1/2^1 - 3/2^2 + 5/2^3 - 7/2^4 + 9/2^5 = 0.21875
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
		
		for(;i<=n2;i++)
		{
			p=p*n1;
			if(i%2==0)
			{
			   sum-=(j/p);
			   System.out.print(" - "+j+"/"+n1+"^"+i);
			}
			else
			{
				sum+=(j/p);	
				if(i>1)
					System.out.print(" + ");
				System.out.print(+j+"/"+n1+"^"+i);	
			}
			j+=2;
			
		}
		System.out.print(" = "+sum);
	}
}