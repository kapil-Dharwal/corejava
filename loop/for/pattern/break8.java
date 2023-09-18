/*
1
3
5
7
9
11
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=1 ;i<20 ;i+=2)
			{
				System.out.println(i);
				if(i>10)
				break;
				
			}
		}
}