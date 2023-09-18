/*
1 1
1 2
1 3
2 1
2 2
2 3
3 1
3 2
3 3
4 1
4 2
4 3
5 1
5 2
5 3
6 1
6 2
6 3
7 1
7 2
7 3
8 1
8 2
8 3
*/
import java.lang.String;
import java.util.Scanner;
class Continue
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			for(i=1;i<=8;i++)
			{
				for(j=1;j<=3;j++)
				{
					System.out.println(i+ " " +j);
					if(i>=2)
					{
					continue;
					
					}
					
				    
				}
			}
		}
}