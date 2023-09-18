class Electricity_Exception extends Exception
{
	Electricity_Exception(){}
	Electricity_Exception(String msg)
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
				if(a>350)
				throw new Electricity_Exception(a+" Electricity will be Cutoff ");
				else
				{
				System.out.println("valid  "+a);	
				}
		}
		catch(Electricity_Exception e)
		{
			System.out.println(e);
		}
	}
}