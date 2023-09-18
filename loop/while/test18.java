import java.util.Scanner;

class Test
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int a=45,b,c;
		b=a-- + a++ + --a;
		c=++a + --a + a++;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}