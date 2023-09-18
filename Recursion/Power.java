import java.util.Scanner;
class Test 
{
		public static int pow(int x, int y)
		{
			int p;
			if(y==1)
				return x;
			else
				p=x*pow(x,y-1);
			return p;
		}
		public static void main(String args[])
		{
			Scanner sc=new Scanner (System.in);
			System.out.println("Enter the number:");
			int x=sc.nextInt();
			int y=sc.nextInt();
			Test ob=new Test();
			System.out.println(ob.pow(x,y));
        }
}