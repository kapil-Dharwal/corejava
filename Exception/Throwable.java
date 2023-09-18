public class Throwable
{
		private String msg;
		public Throwable(String msg)
		{
			this.msg=msg;
		}
}
public class Exception extends Throwable
{
		public Exception(String msg)
		{
			super(msg);
		}
}
public class RuntimeException extends Exception
{
		public RuntimeException(String msg)
		{
			super(msg);
		}
}
public class ArithmeticException extends RuntimeException
{
		public ArithmeticException (String msg)
		{
			super (msg);
		}
}//incompleted programm
