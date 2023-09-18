/*
2 3
3 3
4 3
5 3
*/
import java.lang.String;
import java.util.Scanner;
class Continue
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			for(i=2;i<=5;i++)
			{
				for(j=3;j<=3;j++)
				{
					System.out.println(i+ " " +j);
					if(i>=2)
					continue;
				    
				}
			}
		}
}