import java.util.Scanner;
class Second
{		
		public static void secondmax()
		{
			Scanner sc=new Scanner(System.in);
			int a[]=new int [10];
			System.out.println("enter a array size");
			int n=sc.nextInt();
			int i;
			System.out.println("enter array element");
			for( i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				System.out.println("a["+i+"]="+a[i]);
			}
							int max=a[0];
				for(i=1; i<n ;i++)
				{
					if(max<a[i])
					{
						max=a[i];
					}
				}
					int max2=a[0];
					int index=0;
					for(i=1; i<n ; i++)
					{
						if(max2<a[i]&&max>a[i])
						{
							max2=a[i];
							index=i;
						}
					}							
					System.out.println("second..:"+max2);
		}
			public static void main(String arg[])
			{
				Second.secondmax();
			}
					
}