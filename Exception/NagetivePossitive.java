class Positiv_Nagetiv_Exception extends Exception
{
	Positiv_Nagetiv_Exception(){}
	Positiv_Nagetiv_Exception(String msg)
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
			if(a>=0)
				throw new Positiv_Nagetiv_Exception(a+" are >0 positiv exception");
			else 
			{
				System.out.println(a);
			}
		}
		catch(Positiv_Nagetiv_Exception e)
		{
			System.out.println(e);
		}
	}
	
}