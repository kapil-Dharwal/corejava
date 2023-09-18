/*
unreachable statement
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=1; ; )
			{
				System.out.println(i++);
				if(i>=10)
				{
					break;
					continue;
				System.out.println(i++);		
				}
			}
		}
}