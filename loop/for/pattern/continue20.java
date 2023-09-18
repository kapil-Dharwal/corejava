/*
1 1
1 2
1 3
1 4
1 5
1 6
1 7
1 8
1 9
1 10
*/
import java.lang.String;
import java.util.Scanner;
class Continue
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			for(i=1;i<=10;i++)
			{
				for(j=1; j<=10; j++)
				{
				  if(i>=2 && j>=1)
				  continue;
			      System.out.println(i+ " " +j);
				}	
                  				
			}
		}
}