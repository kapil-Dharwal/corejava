import java.util.Scanner;

class OddEvensum
{
	public static void main(String[] args)
	{
		System.out.println("Enter any number:");
		Scanner sc=new Scanner(System.in);
		int even=0, i=1,sum=0,odd=0,n=sc.nextInt();
		
		
		do
		{
			
			if(i%2!=0)
			{
				odd+=i;
			}	
			else
			{
				
				even+=i;
			}
			i++;
		}
		while(i<=n);
		System.out.println("even = "+even+"\nodd = "+odd);
		
	}
	
}	
