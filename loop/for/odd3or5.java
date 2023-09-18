import java.util.Scanner;
class Withaout_3_5
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner (System.in);
		int n;
		n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			if(i%2!=0)
			{
				{
					if(i==3||i==5)
				
			        continue;
				}
		        System.out.print(i+" ");
			}
		}
	}
}
