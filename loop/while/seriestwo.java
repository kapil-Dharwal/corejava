// !1/1 + !2/2 + !3/3 + !4/4 + !5/5 
import java.util.Scanner;

class Serisetwo
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int i=1,sum=0,fact=1,n=sc.nextInt();
		
		while(i<=n)
		{
			fact=fact*i;
			sum=sum+(fact/i);
			
			
				System.out.print("!" +i+"/" +i);
				i++;
			
			if(i<=n)
			
			System.out.print("+");
			
			
		}
		System.out.println(" = "+sum);
	}
}	