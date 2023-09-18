import java.util.Scanner;
class Test
{
		public int add(int x,int y)
		{
			return (x+y);
		}
		public static void main(String args [])
		{
			int res=new Test().add(9,4);
			System.out.println("Result="+res);
		}
}


class Test_2
{
		public int add(int x,int y)
		{
			return (x+y);
		}
		public static void main(String args [])
		{
			System.out.println("Result="+new Test().add(5,5));
		}
}