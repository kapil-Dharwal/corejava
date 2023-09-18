class Cube
{
  public static void acube()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
   
		System.out.println("Enter side of Cube");
		float a=sc.nextFloat();
   
		float area=6*(a*a);
		System.out.println("Area=" +area);
   }
   public static void main(String args[])
   {
   Cube.acube();
   }
 }