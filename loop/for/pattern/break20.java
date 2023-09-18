import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=8 ;i>=1 ;i--)
			{
				for(j=1; j<=10; j++)
				{
					System.out.println(i+ " " +j);	
				    if(i<=9)
				    break;
				}		
				   	System.out.println(j);		
			}
		}
}