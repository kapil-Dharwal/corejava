import java.lang.String;
import java.util.Scanner;
class Addition
{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int a[][]=new int[5][5];
			int b[][]=new int[5][5];
			int c[][]=new int[5][5];
			
			System.out.println("enter first dimention:");
			System.out.println("How many row you want:");
			int n=sc.nextInt();
			System.out.println("How many colum you want:");
			int m=sc.nextInt();
			System.out.println("Enter second Dimention:");
			System.out.println("How many row you want:");
			int x=sc.nextInt();
			System.out.println("How many colum you want:");
			int y=sc.nextInt();
			
			int i,j,temp;
			
			if(n==m && x==y)
			{
				System.out.println("enter first dimention array:");
				for(i=0;i<n;i++)
				{
					for(j=0;j<m;j++)
					a[i][j]=sc.nextInt();
				}
				System.out.println("Enter second dimention array:");
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				b[i][j]=sc.nextInt();	
			}
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					c[i][j]=a[i][j]+b[i][j];
				}
			}
			System.out.println("Addition of metrix:");
			for(i=0;i<n;i++)
			{
				for(j=0;j<m;j++)
				{
					System.out.print(c[i][j]+" ");
				}
				System.out.println(" ");
			}
			
		}
}
