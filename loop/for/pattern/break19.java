/*
1
2
3
4
5
6
7
8
9
10
11
12
13
14
15
16
17
18
*/
import java.lang.String;
import java.util.Scanner;
class Break
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			
			for(i=1 ;i<=15 ;i++)
			{
				for(j=0; j<11; j++)
				{
					System.out.println(i++);
				    if(i==6)
				    break;
				}		
				    System.out.println(i);				
			}
		}
}