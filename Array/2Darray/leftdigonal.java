import java.util.Scanner;
class Squre
{
	public static void main(String arg[])
	{
		Scanner sc= new Scanner (System.in);
		int i,j,sum=0;
		int a[][]=new int [10][10];
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
			System.out.print("squre\n");
			for(i=0;i<n;i++)
			{
				for(j=0 ; j<m ; j++)
				{
					if(i+j==m-1)
					{
					System.out.print(a[i][j]+"\t");
					sum=sum+a[i][j];
					}
					else 
					System.out.print("\t");
				}
				
				System.out.println();
			}
			System.out.println("sum= "+sum);
	}
}