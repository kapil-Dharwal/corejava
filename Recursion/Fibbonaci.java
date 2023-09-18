import java.util.Scanner;
class Test
{
		public static int fibbo(int x)
		{
			
			if(x==1)
			return 0;
			if (x==2)
			return 1;	
			else 
				return fibbo(x-1)+fibbo(x-2);
			
		}
		public static void main(String args [])
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("enter the number:");
			int n=sc.nextInt();
			Test ob=new Test();
			int count=n;
			for (int i=1;i<=count;i++)
			System.out.println(ob.fibbo(i));
			
		}		
}