interface MyInf
{
		public abstract int Calculater (int a,int b);
}
class Mylang
{
		public static void main(String args [])
		{
			MyInf ref1=new MyInf()
			{
				public int Calculater(int a,int b)
				{
					return a+b;
				}
			};
			MyInf ref2=new MyInf()
			{
				public int Calculater(int a,int b)
				{
					return a-b;
				}
			};
			MyInf ref3=new MyInf()
			{
				public int Calculater(int a,int b)
				{
					return a*b;
				}
			};
			MyInf ref4=new MyInf()
			{
				public int Calculater(int a,int b)
				{
					return a/b;
				}
			};
			MyInf ref5=new MyInf()
			{
				public int Calculater(int a,int b)
				{
					return a%b;
				}
			};
			System.out.println(ref1.Calculater (8,7));
			System.out.println(ref2.Calculater (10,7));
			System.out.println(ref3.Calculater (4,7));
			System.out.println(ref4.Calculater (28,7));
			System.out.println(ref5.Calculater (5,12));
		}
} 