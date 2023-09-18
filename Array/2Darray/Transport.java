import java.lang.String;
import java.util.Scanner;
class Transpose
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int a[][]=new int [5][5];
			int i,j,n,m;
			
			System.out.println("enter the dimension of metrix:");
			m=sc.nextInt();
			n=sc.nextInt();
			System.out.println("enter the element of metrix:");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("matrix element are:");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print("\t"+a[i][j]);
				}
				System.out.println(" ");
				
			}
			System.out.println("Transpose elements are");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.print("\t"+a[j][i]);
				}
				System.out.println(" ");
				
			}
			
		}
}