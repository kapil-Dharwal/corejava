/*
5
enter element in array:
1
4
2
5
8
Array element are:
        a[0]=1
        a[1]=4
        a[2]=2
        a[3]=5
        a[4]=8
		*/
import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
      
	  Scanner sc=new Scanner(System.in);
	  int n;
	  n=sc.nextInt();
	  int a[]=new int [n];
	  System.out.println("enter element in array:");
	  for(int i=0;i<n;i++)
		  a[i]=sc.nextInt();
	  System.out.println("Array element are:");
	  for(int i=0;i<n;i++)
	  System.out.println("\ta["+i+"]="+a[i]);
	}
}