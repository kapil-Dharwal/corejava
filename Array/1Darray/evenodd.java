import java.lang.String;
import java.util.Scanner;
class Array
{
	    public static void main(String[]args)
		{
			
		    Scanner sc=new Scanner(System.in);
		    int a[]=new int[10];
			System.out.println("How many element you want to enter:");
			
			int n=sc.nextInt();
			int odd=0,even=0;
			
			System.out.println("Enter array element:");
			
			for(int i=0;i<n;i++)
			
		    a[i]=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				if(a[i]%2==0)
				{
					even++;
				}
				else
					odd++;
			}
			    System.out.println("even="+even);
				System.out.println("odd="+odd);
		}
}