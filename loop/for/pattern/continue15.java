
/*
2
4
6
8
10
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
				if(i==8)
				continue;
			    else
				System.out.println(++i);	
			}
		}
}