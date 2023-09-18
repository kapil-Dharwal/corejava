import java.util.Scanner;
class CalculatorPOJO
{
		private double a,b,c;
		public void setA(double a)
		{
			this.a=a;
		}
		public void setB(double b)
		{
			this.b=b;
		}
		public void setC(double c)
		{
			this.c=c;
		}
		public double getA()
		{
			return this.a;
		}
		public double getB()
		{
			return this.b;
		}
		public double getC()
		{
			return this.c;
		}
		
}
//BL
class CalculatorOperation
{
	public double addTwo(CalculatorPOJO ref)
	{
		return ref.getA()+ref.getB();
	}
	public double Sub(CalculatorPOJO ref)
	{
		return ref.getA()-ref.getB();
	}
	public double Multi(CalculatorPOJO ref)
	{
		return ref.getA()*ref.getB();
	}
	public double div(CalculatorPOJO ref)
	{
		return ref.getA()/ref.getB();
	}
	public double mod(CalculatorPOJO ref)
	{
		return ref.getA()%ref.getB();
	}
	public double pow(CalculatorPOJO ref)
	{
		return ref.getA()^ref.getA();
	}
}
//client class
class Test
{
		public static void main(String args [])
		{
			int n,m;
			double res;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the two number");
			n=sc.nextInt();
			m=sc.nextInt();
			CalculatorPOJO ob=new CalculatorPOJO();
			ob.setA(n);
			ob.setB(m);
			int ch;
			CalculatorOperation clo=new CalculatorOperation();
			res=clo.addTwo(ob);
		
			do
			{
				System.out.println("\tYour choice are");
				System.out.println("\t1.Addition \n\t2.Subtriction");
				System.out.println("\t3.Multiplication \n\t4.Division");
				System.out.println("\t5.Moduls \n\t6.pow");
			
				ch = sc.nextInt();
				switch(ch)
				{
					case 1:  
					res=clo.addTwo(ob);
					System.out.println("ADD="+res);
					break;	
					
					case 2:   
				    res=clo.Sub(ob);
					System.out.println("SUB="+res);
					break;	
					
					case 3:   
					res=clo.Multi(ob);
					System.out.println("MULTI="+res);
					break;	
					
					case 4:   
				    res=clo.div(ob);
					System.out.println("DIV="+res);
					break;	
				
					case 5:   
				    res=clo.mod(ob);
					System.out.println("MOD="+res);
             		break;	
					
					case 6:
					res=clo.pow(ob);
					System.out.println("pow="+pow);
				}
			}
			while(ch!=7);
		}
}

