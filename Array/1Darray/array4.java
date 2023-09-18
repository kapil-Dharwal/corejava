/* a[0]=9
        a[1]=5
        a[2]=3
        a[3]=2
        a[4]=8
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
        at Array.main(array4.java:15)*/
import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
	  a[0]=9;
	  a[1]=5;
	  a[2]=3;
	  a[3]=2;
	  a[4]=8;
	    for(int i=0;i<7;i++)
			System.out.println("\ta["+i+"]="+a[i]);
	}
}