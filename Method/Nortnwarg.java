//no return with argu this
import java.util.Scanner;
class Test
{
		public void display(Test k)
		{
			int a=8;
			System.out.println("Hello Display.....");
			System.out.println("A="+a);
			
			this.show();
		}
		public void show()
		{
			System.out.println("Hello show");
		}
		public static void main(String args[])
		{
			Test ob=new Test();
			ob.display(ob);
			//.show();
		}
}