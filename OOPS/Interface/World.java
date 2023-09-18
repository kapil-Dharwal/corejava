interface inter
{
	void addmition();
	void withdrawl();
}
class Unnivercity  implements inter
{
	String student,tc ;
	public Unnivercity(String student,String tc)
	{
			this.student=student;
			this.tc=tc;
	}
		public void addmition()
		{
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("\tSTUDENT ADDMITION DETAILS   :"+student);
		}
		public void withdrawl()
		{
			System.out.println("\tWITHRWAL     : "+tc);
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		}
	
}
class TestMain
{
	public static void main (String arg[])
	{
		Unnivercity ob=new Unnivercity("ALL DOCUMENT SUBMIT","fees");
		ob.addmition();
		ob.withdrawl();
	}
	
}