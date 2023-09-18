import java.util.Scanner;
class LowerCase
{
	public static void lovercase()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ente a cherector:");
		char ch = sc .next ().charAt(0);
		if(ch>='a'&&ch<='z')
		{
			char b= (char)(ch-32);
			System.out.println("lowercase"+ch+   "uppercase:"+b);
		}
		else
		{
			System.out.println("plese enter lowercase");
		}
	}
	public static void main(String args[])
	{
		LowerCase.lovercase();
		
	}
}