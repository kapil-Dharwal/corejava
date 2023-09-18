import java.util.Scanner;
class Person
{
	String name;
	int age;
	String type,addres;
	long adharno;
	Account acc;
	public Person(String name,int age,String type,String addres,long adharno,String ifsc_code, long account_nu,long pin,String nominee_name,String date_of_issue)
	{
		this.name=name;
		this.age=age;
		this.type=type;
		this.addres=addres;
		this.adharno=adharno;
		acc=new Account(ifsc_code,account_nu,pin,nominee_name,date_of_issue);
	}
	void displayPerson()
	{
		System.out.println("\tPERSON NAME       :"+name);
		System.out.println("\tAGE               :"+age);
		System.out.println("\tADDRES            :"+addres);
		System.out.println("\tADHAR NUMBER      :"+adharno);
		acc.displayAccount();
	}
	class Account
	{
		String ifsc_code;
		long account_nu,pin;
		String nominee_name;
		String date_of_issue;
		public Account(String ifsc_code, long account_nu,long pin,String nominee_name,String date_of_issue)
		{
			this.ifsc_code=ifsc_code;
			this.account_nu=account_nu;
			this.pin=pin;
			this.nominee_name=nominee_name;
			this.date_of_issue=date_of_issue;
		}
		void displayAccount()
		{
			System.out.println("-----------ACCOUNT DETAILS----------------");
			System.out.println("\tIFSC CODE        :"+ifsc_code);
			System.out.println("\tACCOUNT NUMBER   :"+account_nu);
			System.out.println("\tPIN              :"+pin);
			System.out.println("\tNOMINEE NAME     :"+nominee_name);
			System.out.println("\tDATE_OF_ISSUE    :"+date_of_issue);
			}
	}
}
class TestMain
{
		public static void main (String arg[])
		{
			Person p=new Person("KAPIL",23,"djjs","M.P. india",621356,"PUNBo256900",256900,455336,"DINESH","10.09.2000");
			p.displayPerson();
		
		}
}