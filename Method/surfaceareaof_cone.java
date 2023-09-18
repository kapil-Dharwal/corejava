class Surfacearea
{
	public static void surface()
   {
		java.util.Scanner sc=new java.util.Scanner(System.in);
   
		System.out.println("Enter radius of Cone");
		float r=sc.nextFloat();
   
		System.out.println("Enter length of Cone");
		float l=sc.nextFloat();
   
		float area=(3.14f*r*l)+(3.14f*r*r);
   
		System.out.println(" surface Area of cone=" +area);
	}
	public static void main(String args[])
	{
		Area ob=new Area ();
		ob.surface();
	}
 }
