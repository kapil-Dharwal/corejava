interface INTERFACE
{
		int a=40;int b=28;
		void kapil();
		void add();
}
abstract class Addition implements INTERFACE
{
		public void kapil()
		{
			System.out.println("i am kapil");
		}
}
class Lezend extends Addition
{
	
		public void add()
		{
			System.out.println("SUM="+(a+b));
		}
		public static void main(String arg[])
		{
			Lezend z=new Lezend();
			z.kapil();
			z.add();
			
		}
}