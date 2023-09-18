import java.lang.String;
import java.util.Scanner;
class Bubbel
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
		System.out.println("Acual array:");
		
		for(int i=0;i<n;i++)
		{
			System.out.println(a[i]);
		}
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n-i-1;j++)
		    	{
					
					if(a[j]>a[j+1])
					{
						int count=a[j+1];
						a[j+1]=a[j];
						a[j]=count;
					}
			    }
			}
			System.out.println(" sort array:");
			for(int i=0;i<n;i++)
			{
				System.out.println(a[i]);
			}
	}
}