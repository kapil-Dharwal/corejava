import java.util.Scanner;
class Sumof_simple
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner (System.in);
		int i,j;
		int a[][]=new int [10][10];
		int b[][]=new int [10][10];
		System.out.println("enter two size ");
			int n=sc.nextInt();
			int m=sc.nextInt();
			System.out.println("enter  first element\n ");
			for( i=0;i<n;i++)
			{
				for(j=0 ; j<m ; j++)
				{
					 a[i][j]=sc.nextInt();
				}
			}
			System.out.println("enter  second element\n ");
			for( i=0;i<n;i++)
			{
				for(j=0 ; j<m ; j++)
				{
					 b[i][j]=sc.nextInt();
				}
			}
			System.out.print("first matrix\n");
			for(i=0;i<n;i++)
			{
				for(j=0 ; j<m ; j++)
				{
					System.out.print("  "+a[i][j]);
				}
				System.out.println();
			}
			System.out.print("second matrix\n");
			for(i=0;i<n;i++)
			{
				for(j=0 ; j<m ; j++)
				{
					System.out.print("  "+b[i][j]);
				}
				System.out.println();
			}
			int sum=0;
			System.out.print(" matrix sum \n");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					 sum=a[i][j]+b[i][j];
					 System.out.print(" "+sum);
				}
				System.out.print(" \n");
			}		
	}
}