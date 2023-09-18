import java.lang.String;
import java.util.Scanner;
class Array
{
	    public static void main(String[]args)
		{
			 Scanner sc=new Scanner(System.in);
			int a[]=new int[10];
			System.out.println("Enter element in array:");
			for(int i=0;i<a.length;i++)
				a[i]=sc.nextInt();
			System.out.println("\tEnter element are: ");
			for(int i=0;i<a.length;i++)
				System.out.println("\ta["+i+"]="+a[i]);
		}
}