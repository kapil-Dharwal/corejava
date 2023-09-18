class MyException extends Excetion
{
		MyException(){}
		MyException(String msg)
		{
			super(msg);
		}
}
class TestMain
{
		public static void main(String args [])
		{
			try
			{
				int a=Integer.parseInt(args [0]);
				if(a>100)
					throw new MyException("value is >100 Exception");
				else if (a<0)
					throw new MyException("value is <0 Exception");
			
				else
					System.out.println(a);
				catch(MyException ref)
				{
				System.out.println(ref);
				System.out.println(ref.getMessage());
				}
			}
		}
}

