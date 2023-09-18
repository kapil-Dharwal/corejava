//2^1/1 + 2^2/2 + 2^3/3 + 2^4/4 + 2^5/5 = 17.066668
import java.util.Scanner;

class Series_20
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entyer two number:");
		int i=1,n1,n2;
		float p=1,sum=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		for(;i<=n2;i++)
		{
			p=p*n1;
			sum+=(p/i);
			System.out.print(n1+"^"+i+"/"+i);
			
			if(i<n2)
				System.out.print(" + ");
		}
		System.out.print(" = "+sum);
	}
}