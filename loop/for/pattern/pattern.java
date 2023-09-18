import java.lang.String;
import java.util.Scanner;
class Pattern_1
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Number:");
			
			int i,j,n;
			n=sc.nextInt();
			
			for(i=0;i<=10;i++)
			{
				
				for(j=1;j==i;j++)
				{
					System.out.print(" ");
				}
			}System.out.print(" * ");
		}
}