import java.util.Scanner;
class Pas
{
		public void display()
		{
			System.out.println("Hello display");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number:");
			int i,j,k;
			
			for(i=0;i<n;i++)
			
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
			public void show()
			{
				System.out.println("Hello show");
			}
			public static void main(String[]args)
			{
				Pas.ob=new Pas();
				ob.display();
			}
}
			
