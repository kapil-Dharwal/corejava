//2^1 + 2^2 + 2^3 + 2^4 + 2^5=62
import java.util.Scanner;

class Series
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entyer two number:");
		int i=1,n1,n2,p=1,sum=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		while(i<=n2)
		{
			p=p*n1;
			sum+=p;
			if(i>1)
				System.out.print(" + ");
			
			
			System.out.print(n1+"^"+i);
			i++;
		}
		System.out.print("="+sum);
	}
}
			