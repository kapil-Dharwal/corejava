import java.util.Scanner;
class Upper
{
	public static void uppercase()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ente a cherector:");
		char ch = sc .next ().charAt(0);
		if(ch>='A'&&ch<='Z')
		{
			char b= (char)(ch+32);
			System.out.println("upprcase "+ch+   "lowerrcase:"+b);
		}
		else
		{
			System.out.println("plese enter uppercase");
		}
	}
	public static void main(String args[])
	{
		Upper ob=new Upper();
		ob.uppercase();
		
	}
	
}