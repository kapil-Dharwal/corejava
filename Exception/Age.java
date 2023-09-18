class Age_Exception extends Exception
{
	Age_Exception(){}
	Age_Exception(String msg)
	{
		super(msg);
	}
}
class TestMain
{
	
	public static void main(String arg[])
	{
		try
		{
			int a=Integer.parseInt(arg[0]);
			if(a<=0)
				throw new Age_Exception(a+" are <0  exception");
			else if(a>100)
				throw new Age_Exception(a+" are >100  exception");
			else if(a>=18 && a<100)
			{
				System.out.println("valid age = "+a);
			}
			else
			{
				System.out.println("invalid age = "+a);
			}
		}
		catch(Age_Exception e)
		{
			System.out.println(e);
		}
	}
}