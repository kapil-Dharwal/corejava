//2/!1-3/!24/!3-5/!46/!5=-1.008333333333333
import java.util.Scanner;
class F_9series
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
				sum+=(i+1)/fact;
				j=i+1;
				System.out.print("-"+j+"/"+"!"+i);
			}
			else
			{
				sum-=(i+1)/fact;
				j=i+1;
				System.out.print(j+"/"+"!"+i);
			}	
			    i++;
		}
		System.out.print("="+sum);
		
	}
}