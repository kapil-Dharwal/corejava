import java.util.Scanner;
class Calculator
{
		private double a,b;
		public void setData(double a,double b)
		{
			this.a=a;
			this.b=b;
		}
		public double add()
		{
			return this.a+this.b;
		}
		public double sub()
		{
			return this.a-this.b;
		}
		public double multi()
		{
			return this.a*this.b;
		}
		public double div ()
		{
			return this.a/this.b;
		}
		public double mod()
		{
			return this.a%this.b;
		}
}       
class Test
{
		public static void main (String args[])
		{
			Scanner sc=new Scanner(System.in);
			int ch;
			double x,y,res;
			Calculator ob=new Calculator();
			
			do
			{
				System.out.println("Your choice are:");
				System.out.println("1 for add \n\t2for sub");
				System.out.println("3 for multi\n\t 4 for div");
				System.out.println("5 for mod");
				System.out.println("6 for exits");
				
				ch=sc.nextInt();
				switch(ch)
				{
					case 1:
							System.out.println("Enter any two number");
							x=sc.nextDouble();
							y=sc.nextDouble();
							ob.setData(x,y);
							res=ob.add();
							System.out.println("Addition="+res);
							break;
							
					case 2:
							System.out.println("Enter any two number");
							x=sc.nextDouble();
							y=sc.nextDouble();
							ob.setData(x,y);
							res=ob.sub();
							System.out.println("Subtraction="+res);
							break;
							
					case 3:
							System.out.println("Enter any two number");
							x=sc.nextDouble();
							y=sc.nextDouble();
							ob.setData(x,y);
							res=ob.multi();
							System.out.println("Multiplication="+res);
							
					case 4:
							System.out.println("Enter any two number");
							x=sc.nextDouble();
							y=sc.nextDouble();
							ob.setData(x,y);
							res=ob.div();
							System.out.println("Division="+res);
							
					case 5:
							System.out.println("Enter any two number");
							x=sc.nextDouble();
							y=sc.nextDouble();
							ob.setData(x,y);
							res=ob.mod();
							System.out.println("Moduals="+res);
							break;
							
				}
			}
			while(ch!=6);
		}
} 