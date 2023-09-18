//!1/1+!2/3+!3/5+!4/7+!5/9+=28.28333333333333
import java.util.Scanner;
class F_12series
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
			
				sum+=(i*2-1/fact);
				j=i*2-1;
				System.out.print("!"+i+"/"+j+"+");
				
			    i++;
		}
		System.out.print("="+sum);
		
	}
}