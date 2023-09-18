import java.lang.String;
import java.util.Scanner;
class OddNum
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner (System.in);
			int i=0,j=0,n;
			System.out.println("Enter the number:");
			n=sc.nextInt();
		
			for(i=0;i==j;i++)
			{
				
				System.out.print(" ");
                for(j=0;j<i;j++)
				{
                    if(i%2!=0)
                    
						System.out.print("*");
					
				}
			}
		}
}