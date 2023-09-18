class Area_Cylinder
{
	public static void cylinder()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
   
		System.out.println("Enter radius of Cylinder");
		float r=sc.nextFloat();
   
		System.out.println("Enter Height of Cylinder");
		float h=sc.nextFloat();
   
		float area=(2*3.14f*r*h)+(2*3.14f*r*r);
   
		System.out.println("Area=" +area);
	}
	public static void main(String args[])
	{
	Area ob=new Area();
	ob.cylinder();
	}
}