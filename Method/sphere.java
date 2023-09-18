class Sphere
{
   public static void redius()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the radius of Sphere");
		float r=sc.nextInt();

		float vol=(4/3)*3.14f*r*r*r;

		System.out.println("Volume="+vol);
	}
		public static void main(String args[])
		{
		Sphere ob = new Sphere();
		ob.redius();
		}
}