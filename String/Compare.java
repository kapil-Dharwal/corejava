import java.util.Scanner;
class TestMain
{
		public static void main(String args [])
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE FIRST STRING");
			String a=sc.nextLine();
			System.out.println("ENTER THE SECOUND STRING");
			String b=sc.nextLine();
			int e=a.length();
			int f=b.length();
			int count=0;
			
			if(e!=f)
			{
				System.out.println("not same");
			}
			else
			{
				for(int i=0;i<e;i++)
				{
					if(a.charAt(i)!=b.charAt(i))
					{
						count++;
						break;
					}
				}
				if(count==0)
				{
					System.out.println("same");
				}
				else
				{
					System.out.println("not same");
				}
			}
		}
}