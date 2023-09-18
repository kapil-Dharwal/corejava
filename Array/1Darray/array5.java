/*
enter element in array:
5
1
2
3
4
        Array element are:
        a[0]=5
        a[1]=1
        a[2]=2
        a[3]=3
        a[4]=4
*/
import java.lang.String;
import java.util.Scanner;
class Array
{
	public static void main(String[]args)
	{
	  Scanner sc=new Scanner(System.in);
      int a[]=new int[5];
	  System.out.println("enter element in array:");
	  
	    for(int i=0;i<a.length;i++)
			a[i]=sc.nextInt();
		System.out.println("\tArray element are:");
		for(int i=0;i<a.length;i++)
		System.out.println("\ta["+i+"]="+a[i]);
	}
}	