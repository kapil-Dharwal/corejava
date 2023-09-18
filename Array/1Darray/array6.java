/*
How many element you want to enter:
5
enter element in array:
1
2
3
4
5
         Array element are:
        a[0]=1
        a[1]=2
        a[2]=3
        a[3]=4
        a[4]=5
		*/
import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
	  int a[]=new int[n];
	  System.out.println("How many element you want to enter:");
	  int n=sc.nextInt();
	  System.out.println("enter element in array:");
	  for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
	  System.out.println("\t Array element are:");
	  for(int i=0;i<n;i++)
		  System.out.println("\ta["+i+"]="+a[i]);
	}
}