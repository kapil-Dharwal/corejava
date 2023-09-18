import java.util.Scanner;
class Bank
{
		String name;
		public Bank(String name)
		{
			this.name=name;
		}
}
class Clerical extends Bank
{
	String educational,qualificetion,age,exam,salary;
	public Clerical(String name,String educational,String qualificetion,String age,String exam,String salary)
	{
			super(name);
			this.educational=educational;
			this.qualificetion=qualificetion;
			this.age=age;
			this.exam=exam;
			this.salary=salary;
	}
	void display()
	{
		System.out.println("\t\t\tCLERICAL");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("NAME              "+super.name);
		System.out.println("EDUCATIONAL       "+educational);
		System.out.println("QUALIFICETION     "+qualificetion);
		System.out.println("AGE               "+age);
		System.out.println("EXAM              "+exam);
		System.out.println("SALLARY            "+salary);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
}
class Managerial extends Bank
{
	String no1,no2,no3,no4;
	public Managerial(String name,String no1,String no2,String no3,String no4)
	{
		super(name);
		this.no1=no1;
		this.no2=no2;
		this.no3=no3;
		this.no4=no4;
	}
	void display()
	{   
		System.out.println("\t\t\tMANAGERIAL");
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("NAME                         "+super.name);
		System.out.println("BANK DICISAN                 "+no1);
		System.out.println("BANK WORK                    "+no2);
		System.out.println("GENRAL MANAGER HELP          "+no3);
		System.out.println("BRANCH LEVEL MANAGER LEAD    "+no4);
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	}
	
}
class TestMain
{
	public static void main(String arg[])
	{
		Managerial ob=new Managerial("HDFC","CEO","GENRAL MANAGER","ASSISTANCE GM DEPUTY GM CHIEF GM","CHIEF MANAGER");
		ob.display();
		Clerical ob1=new Clerical("HDFC","GRADUATION","DICIPLIN","10 TO 50","HDFC CLERK","30,000/M");
		ob1.display();
	}
}