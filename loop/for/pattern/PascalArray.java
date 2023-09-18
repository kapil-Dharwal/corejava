import java.util.Scanner;
class PascalArray
{
		public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			int a[]= new int[n];
			int i,j,k;
			
			for(i=0;i<n;i++)
			{
				for(j=1;j<n-i;j++)
				{	
					System.out.print(" ");
				}
				a[i]=1;
				
				for(k=0;k<=i;k++)
			    {
				   System.out.print(a[i]+" ");
				   a[i]=a[i]*(i-k)/(k+1);
				}
				System.out.print("\n");
			
			}
			
		}
}