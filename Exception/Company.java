class Compnay_Exception extends Exception
{
	Compnay_Exception(){}
	Compnay_Exception(String msg)
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
			int worker=Integer.parseInt(arg[0]);
			if(worker<=100)
				throw new Compnay_Exception(worker+" are <0  exception");
			else 
			{
				System.out.println("worker = "+worker);
			}
		}
		catch(Compnay_Exception e)
		{
			System.out.println(e);
		}
	}
}