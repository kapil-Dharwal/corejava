import java.util.Scanner;

class QubeSum
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		int i=1,sum=0,j=0;
		
		while(i<=n)
		{
			j=i*i*i;
			sum+=j;
			if(i<n)
			{	
			System.out.print(j+" + ");
			}
			
			i++;
		}
		System.out.print(j +" = "+sum);
	}
}