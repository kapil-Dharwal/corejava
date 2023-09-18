//-1.0/!1+3.0/!2-5.0/!3+7.0/!4-9.0/!5=-0.11666666666666668
import java.util.Scanner;
class F_15series
{
	public  static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int i=1,n=sc.nextInt();
		double sum=0,fact=1,j=1;
		while(i<=n)
		{
			fact*=i;
			if(i%2!=0)
			{
				sum-=(j/fact);
				System.out.print("-"+j+"/!"+i);
			}
			else
			{
				sum+=(j/fact);
				System.out.print("+"+j+"/!"+i);
			}	
			    i++;
				j=j+2;
		}
		System.out.print("="+sum);
		
	}
}