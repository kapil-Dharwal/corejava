import java.util.Scanner;
class Sel
{
		public static void tarnry()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter two price sailing cost price");
			int cp=sc.nextInt();
			int sp=sc.nextInt();
			String x=((sp>cp)?"profit":(cp==sp)?"no profit no loss":"loss");
			System.out.println(x);
		}
		public static void main(String arg[])
		{
		Sel.tarnry();
		}
}