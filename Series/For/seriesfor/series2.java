/*
 + ! 2 - ! 2 + ! 2 - ! 2 + ! 2 = 2
 */
import java.lang.String;
import java.util.Scanner;
class Series_2
{
	    public static void main(String[]args)
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int  j,i,fact=1,x=2,sum=0;
		int n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			fact=1;
			for(j=1;j<=x;j++)
			{
				fact=fact*j;
			}
			if(i%2==0)
			{
				sum=sum-fact;
				System.out.print(" - ");
				System.out.print("! "+x);
			}
			else
			{
				sum=sum+fact;
				System.out.print(" + ");
				System.out.print("! "+x);
			}
		}
		System.out.print(" = "+sum);
}
}