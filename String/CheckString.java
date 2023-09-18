import java.util.Scanner;
public class CheckString
{
		public static void main(String args [])
		{
			CheckString ob=new CheckString()
			ob.input(ob);
		}
		public void input(CheckString ob)
		{
			Scanner sc=new Scanner(System.in);
			String str;
			char c;
			System.out.println("enter string");
			str=sc.nextLine();
			System.out.println("enter character check");
			c=sc.next().charAt(0);
			ob.operation(str,c);
			
		}
		public void operation(String str,char c)
		{
			int count=1;
			int first;
			first=str.indexOf(c);
			int secound;
			secound=str.indexOf(c);
			if(first==-1)
			{
				System.out.println("the character" +c+ "dose not exit in the string");
			}
		}
}