class WithdrawalException extends Exception 
{
	WithdrawalException (){}
	WithdrawalException (String msg)
	{
		super(msg);
	}
}
class Bank
{
    public void debit(int a)
    {
    	try{
    		if(a<=0)
    		throw new WithdrawalException (a+"  amount should be in positive ");
    		else if(a>=10000)
    		throw new WithdrawalException (a+"  amount should not be in Zero ");
    		else
    		System. out. println(a+"  please wait! while you're transaction is processed ");
    		}
    		catch (WithdrawalException  e)
    		{
    	System.out.println(e.getMessage());
    		}
    }
}
class TestMain
{
	public static void main(String[] args) {
		int a=Integer.parseInt(args[0]);
		Bank ob =new Bank ();
		ob. debit(a);
		
	}
}