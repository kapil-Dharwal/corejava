import java.util.Scanner;
class Three_Angle
{
    public static void tringle()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter three angel of tringle:");
		int num=sc.nextInt();
		int num2=sc.nextInt();
		int num3=sc.nextInt();
		int angl= num+num2+num3;
		System.out.println("sum of three angle ="+angl);
		if(angl==180)
		{
			System.out.println("valide tringle");
		}
		else
		{
			System.out.println("not valide");
		}
   }
   public static void main(String arg[])
   {
   Three_Angle ob = new Three_Angle();
   ob.tringle();
   }
}