import java.util.Scanner;
class SumEle
{
		public static void main(String[]args)
		{
			int a[][]=new int [5][5];
			SumEle ob=new SumEle();
			int a,b,n,m;
			ob.SumEle();
			//System.out.println("Sum = "+sum);
			
		}
		public void SumEle();
 			
		{
			Scanner sc=new Scanner(System.in);
			int sum=0;
			
			System.out.println("enetr the array size:");
			n=sc.nextInt();
			System.out.println("enter array element:");
			m=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<m;j++)
				{
					a[i][j]=sc.nextInt();
					sum+=b[i];
				}
			}
		}
		
}