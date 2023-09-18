/*
5
7
9
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=5 ;i<=10 ;i++)
			{
				for(j=1; j<=10; j++)
				{
					for(k=0;k<=10;k++)
					{
						if(i>=2 && i==j)
						{
							break;
						}
					}
				}
				System.out.println(i++);
			}
		}
}