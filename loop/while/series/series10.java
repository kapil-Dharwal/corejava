//2^1/1 + 2^2/2 + 2^3/3 + 2^4/4 + 2^5/5 = 1.78125
import java.util.Scanner;

class Series
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int i=1,n1,n2;
		float p=1,sum=0;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		while(i<=n2)
		{
			p=p*n1;
			sum+=(i/p);
			System.out.print(n1+"^"+i+"/"+i);
			
			if(i<n2)
				System.out.print(" + ");
			i++;
		}
		System.out.print(" = "+sum);
	}
}