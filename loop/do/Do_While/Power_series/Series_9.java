
//WAP to -1/x^1 + 2/x^2 - 3/x^3 + 4/x^4 - 5/x^5  =  -0.28125
import java.util.Scanner;
class Series_9
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		int x,y,i=1;
		
		float sum=0,pow=1;
		System.out.println("Enter any two number");
		x = sc.nextInt();
		y = sc.nextInt();
		do
		{
			pow = pow*x;
			if(i%2==0)
			{
				sum+=(i/pow);
				System.out.print(" + "+x+"^"+i+"/"+i);
			}
			else 
			{
				sum-=(i/pow);
				
				System.out.print(" - "+x+"^"+i+"/"+i);
			}	
			i++;
		}while(i<=y);
		System.out.println(" = "+sum);
	}
}