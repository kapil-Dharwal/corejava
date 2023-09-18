/*
1
2
3
4
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=1 ;i<10 ;i++)
			{
				if(i==5)
				break;
				System.out.println(i);
			}
		}
}