/*
1 8
2 8
3 8
4 8
5 2
6 2
7 2
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=1 ;i<8 ;i++)
			{
				for(j=2; j<=7; j++)
				{
				    if(i>=5)
				    break;
				}		
				    System.out.println(i+ " " +j);				
			}
		}
}