import java.util.Scanner;
class Assending
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int [10][10];
		int j,i,k=1,temp;
		System.out.println("enter size ");
			int n=sc.nextInt();
			int m=sc.nextInt();
			if (n==m)
			{
				for( i=0;i<n;i++)
				{
					for(j=0 ; j<m ; j++)
					{
					a[i][j]=sc.nextInt();
					}
				}
				System.out.print("array element");
				for( i=0;i<n;i++)
				{
					for(j=0 ; j<m ; j++)
					{
					System.out.print(a[i][j]);
					}
					System.out.println();
				}
				for( i=0;i<n;i++)
				{
					for(j=0 ; j<m ; j++)
					{
						for(k=1;k<m;k++)
						{
							if(a[i][k]<a[i][k-1])
							{
								temp=a[i][k];
								a[i][k]=a[i][k-1];
								a[i][k-1]=temp;
							}
						}
					}
				}
			System.out.print("\tafter");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
					{
						System.out.print(a[i][j]);
					}
					System.out.println();
			}
		}
	
	}
}