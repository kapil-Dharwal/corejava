import java.util.Scanner;
class Alphabet
{
		public static void tarnry()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a number");
			char n=sc.next().charAt(0);
			String x=(((n>='a'&&n<='z')||(n>='A'&&n<='Z'))?"alfabeat":" is not alfabeat");
			System.out.println(x);
		}
		public static void main(String arg[])
		{
		Alphabet.tarnry();
		}
}