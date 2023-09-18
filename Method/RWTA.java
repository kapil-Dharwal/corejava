import java.util.Scanner;
class Test
{
		public String add()
		{
			return new String ("kamal");
		}
		public static void main(String[]args)
		{
			System.out.println("Result="+new Test().add());
		}
}
/*___________________________________________________*/
class Test_1
{
		public String add()
		{
			return "kamal";
		}
		public static void main(String[]args)
		{
			System.out.println("Result="+new Test_1().add());
		}
}