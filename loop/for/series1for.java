//2^1/1! + 2^2/2! + 2^3/3! + 2^4/4! + 2^5/5! = 6.266667
import java.util.Scanner;

class Series_1
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two number:");
		int n1,n2;
		float p=1,sum=0,fact=1;
		n1=sc.nextInt();
		n2=sc.nextInt();
		
		for(int i=1;i<=n2;i++)
		{
			p=p*n1;
			fact*=i;
			sum+=(p/fact);
			System.out.print(n1+"^"+i+"/"+i+"!");
			if(i<n2)
				System.out.print(" + ");	
			
		}
		System.out.print(" = "+sum);
	}
}