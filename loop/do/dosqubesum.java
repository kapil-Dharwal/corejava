import java.util.Scanner;

class QubeSum
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=1,sum=0,j=0;
		
		do
		{
			j=i*i*i;
			sum+=j;
			if(i<n)
			{	
			System.out.print(j+" + ");
			}
			
			i++;
		}
		while(i<=n);
		System.out.print(j +" = "+sum);
	}
}