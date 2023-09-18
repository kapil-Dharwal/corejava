mport java.util.Scanner;
class TringleSum
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
			 if(n==m)                                     
			 {                             				 
				for( i=0;i<n;i++)                           
				{
					for(j=0 ; j<m ; j++)
					{
					
					 a[i][j]=sc.nextInt();
					}
				}
					System.out.print("\ttringle\n");
					for(i=0;i<n;i++)
					{
						for(j=0 ; j<=i; j++)
						{	
							System.out.print(a[i][j]+" ");
							sum=sum+a[i][j];
						}
							System.out.println();
					}
						System.out.println("sum="+sum);
			 }
			 else
			 System.out.println("can not finde upertranguler matrix");
	}
}