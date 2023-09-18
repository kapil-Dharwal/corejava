import java.lang.String;
import java.util.Scanner;
class InsertionSort

{
    public static void main(String[]args)
    {
		Scanner sc=new Scanner(System.in);
		int n=5;
		int a[]=new int [10];
		System.out.println("How many enter the element:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Atcual array:");
		
		for(int i=0;i<n;i++)
			
		{
			System.out.println(a[i]);
		}
			for(int i=0;i<n;i++)
			{
				int min=a[i];
				for(int j=i;j>0 && min<a[j-1];j--)
		    	{
					a[j-1]=a[j-1];
					a[j-1]=min;
			    }
			}
			System.out.println(" sort array:");
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
			
		
	}
}