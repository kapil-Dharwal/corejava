/*
1
2
3
4
5
7
8
9
10
11
12
13
14
15
*/
import java.lang.String;
import java.util.Scanner;
class Continue
{
	    public static void main(String[]args)
		{
			Scanner sc=new Scanner(System.in);
			int i,j,k;
			for(i=1;i<=15;i++)
			{
				if(i==6)
				continue;
			System.out.println(i);
			}
		}
}