/*
8
8
7
7
6
6
5
5
*/
import java.lang.String;
import java.util.Scanner;
class Continue
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			for(i=8;i>=5;i--)
			{
				for(j=1; j<3; j++)
				{
				  System.out.println(i);
				  if(i>=2)
				  continue;
			      System.out.println(j);
				}	
                  				
			}
		}
}