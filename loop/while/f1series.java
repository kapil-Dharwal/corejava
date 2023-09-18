//-2/!1+4/!2-6/!3+8/!4-10/!5=-0.7500000000000001
import java.util.Scanner;
class F_1series
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int i=1,j=0,n=sc.nextInt();
		double sum=0,fact=1;
		while(i<=n)
		{
			fact*=i;
			if(i%2==0)
			{
				sum+=(i*2/fact);
				j=i*2;
				System.out.print(j+"/"+"!"+i);
			}
			else
			{
				sum-=(i*2/fact);
				j=i*2;
				System.out.print("-"+j+"/"+"!"+i);
				if(i<n)
				System.out.print("+");
			}	
			    i++;
		}
		System.out.print("="+sum);
		
	}
}