 class Vcone
{
  public static void volume()
  {
	java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter radius of cone");
		float r=sc.nextFloat();
    
		System.out.println("Enter Height of cone");
		float h=sc.nextFloat();
    
		float vc= (3.14f*r*r*h)/3;
    
		System.out.println("Volume of Cone=" +vc);
    
  }
		public static void main(String args[])
		{
		Vcone ob=new Vcone();
		ob.volume();
		}
  }
[11:05, 02/06/2023] Swati ❣️: volume of cone