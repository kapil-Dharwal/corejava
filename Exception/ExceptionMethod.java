class Test
{
		public static void main(String args [])
		{
			Test t=new Test();
			try
			{
				t.divide();
			}
			catch(ArithmeticException e)
			{
				e.printStackTrace();
			}
			System.out.print("Kapil");
		}
		void divide()
		{
			int a=100,b=0,c;
			c=a/b;
			System.out.print(c);
		}
}