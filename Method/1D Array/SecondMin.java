import java.util.Scanner;
class Scdmin
{		
		public static void secondmin()
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
				int min=a[0];
				for(i=1; i<n ;i++)
				{
					if(min>a[i])
					{
						min=a[i];
					}
				}
					int min2=a[0];
					int index=0;
					for(i=1; i<n ; i++)
					{
						if(min2>a[i]&&min<a[i])
						{
							min2=a[i];
							index=i;
						}
					}							
					System.out.println("second..:"+min2);
		}
			public static void main(String arg[])
			{
				Scdmin.secondmin();
			}
					
}