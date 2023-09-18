import java.util.Scanner;
class Factorial
{
		private int n;
		public void setData(int n)
		{
			this.n=n;
		}
		public int fact()
		{
			int i,f;
			for(i=1,f=1;i<=this.n;f=f*i,i++);
			return f;
		}
}
class Test
{
		public static void main(String args [])
		{
			Factorial ob=new Factorial();
			ob.setData(5);
			int res=ob.fact();
			System.out.println("Factorial="+res);
		}
}