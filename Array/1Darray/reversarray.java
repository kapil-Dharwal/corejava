/*      Reverse array
        a[0]=7;
		a[1]=2;
		a[2]=5;
		a[3]=8;
		a[4]=9;
		*/
		
import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
	    int n=5;
		int temp;
		int a[]=new int[10];
	
		System.out.println("before array Element:");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
			System.out.println("\ta["+i+"]="+a[i]);
		for(int i=0;i<(n/2);i++)
			
			{
		      temp=a[i];
		      a[i]=a[n-1-i];
	          a[n-1-i]=temp;
			}	System.out.println("revers of array element:");
			
			for(int i=0;i<n;i++)
				System.out.println(a[i]+"");
	}
}
	
		 