import java.util.Scanner;
class Test
{
		public int add(int b[],Scanner sc)
		{
			int sum=0,n;
			System.out.println("enetr the array size:");
			n=sc.nextInt();
			System.out.println("enter ARRAy element:");
			for(int i=0;i<n;i++)
			{
					b[i]=sc.nextInt();
					sum=sum+b[i];
			}
			return sum;
		}
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int [10];
			Test ob=new Test();
			int k=ob.add(a,sc);
			System.out.println("Sum = "+k);
		}
}