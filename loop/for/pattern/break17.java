/*
11 1
10 1
9 1
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=11 ;i>=9 ;i--)
			{
				for(j=1; j<=9; j++)
				{
				    if(i>=9)
				    break;
				}		
				    System.out.println(i+ " " +j);				
			}
		}
}