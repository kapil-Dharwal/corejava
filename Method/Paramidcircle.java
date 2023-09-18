class Paramid
{
	public static void piramid()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the Area of base of pyramid");
		float b=sc.nextInt();

		System.out.println("Enter the heigth of pyramid");
		float h=sc.nextInt();

		float vol=(1*b*h)/3;

		System.out.println("Volume="+vol);
	}
	public static void main(String args[])
	{
	Pyramid.piramid();
	}
}