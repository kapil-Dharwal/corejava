/*
0 1
0 2
1 1
1 2
2 1
2 2
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=0 ;i<3 ;i++)
			{
				for(j=1; j<3; j++)
				{
				if(j>2)
				break;	
				System.out.println(i+ " " +j);
				}
				if(i>1)
				break;
				
			}
		}
}