/*
1
2
3
4
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
			for(i=1;i<=5;i++)
			{
				System.out.println(i);
				if(i<=4)
				continue;
			}
		}
}