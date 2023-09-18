import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		int temp;
	   System.out.println("How many enter the element:");
	    int num=sc.nextInt();
		
	    int a[]=new int[6];
	    int b[]=new int[6];
		int c[]=new int[6];
		System.out.println("The element are");
		for(i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
	    }
		for(i=0;i<num;i++)
		{
			b[i]=a[i];
	    }
		 System.out.println("the actual element are");
		 for(i=0;i<num/2;i++)
		{
			temp=a[i];
			a[i]=a[n-(i+1)];
			a[n-(i+1)]=temp;
		}
		 for(i=0;i<n;i++)
		 {
	        System.out.println("\ta["+i+"]="+b[i]);
			
		    System.out.println("\ta["+i+"]="+a[i]);
			
			System.out.println("Sum of array index"+c([i]=(+a[i]+b[i])));
		 }
	}
}