class Diameter
{
	public static void redias()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
   
		System.out.println("Enter radius of Circle");
		float r=sc.nextFloat();
		float d=(2*r);
   
		System.out.println("Diameter="+d);
	}
	public static void main(String args[])
	{
	Diameter.redias();
	}
}