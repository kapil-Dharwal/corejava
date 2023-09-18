//2/!1+4/!2+6/!3+8/!4+10/!5=5.416666666666666
import java.util.Scanner;
class F_8series
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
			
				sum+=(i*2)/fact;
				j=i*2;
				System.out.print(j+"/!"+i);
				
				if(i<n)
				System.out.print("+");
				
			    i++;
		}
		System.out.print("="+sum);
		
	}
}