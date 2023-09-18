import java.util.Scanner;
class Pencil
{
		public static int price=15;
		public static String colur="Black";
		public static String brand="Natraj";
		
}
class Brand extends Pencil
{
		
		public void pen()
		{
			System.out.println("BRAND :"+brand+"\nprice :"+price+"\ncolur :"+colur);
		}		
		
}
class TestMain
{
	public static void main(String arg[])
	{
		Brand b=new Brand();
		b.pen();
	}
}