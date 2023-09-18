class Rectangle
{
		public static void tangle()
		{
			java.util.Scanner sc=new java.util.Scanner(System.in);
   
			System.out.println("Enter the length of rectangle");
			int l=sc.nextInt();
   
			System.out.println("Enter the Breadth of rectangle");
			int b=sc.nextInt();
   
			int cir=2*(l+b);
			System.out.println("Circumference=" +cir);
		}
		public static void main(String args[])
		{
		Rectangle ob=new Rectangle();
		ob.tangle();
		}
 }