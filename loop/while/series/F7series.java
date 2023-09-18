//-1/!2+!2/4-3/!6+!4/8-5/!10=-10.0
import java.util.Scanner;
class F_7series
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
				sum+=fact/(i*2);
				j=i*2;
				System.out.print("!"+i+"/"+j);
			}
			else
			{
				sum-=fact/(i*2);
				j=i*2;
				System.out.print("-"+i+"/"+"!"+j);
				if(i<n)
				System.out.print("+");
			}	
			    i++;
		}
		System.out.print("="+sum);
		
	}
}