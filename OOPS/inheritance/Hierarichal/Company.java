import java.util.Scanner;
class Company
{
    String company,type,owner,country;
	public Company(String company,String type,String owner,String country)
	{
			this.company=company;
			this.type=type;
			this.owner=owner;
			this.country=country;
	}	
	void displayc()
	{
		System.out.println("\t<<<<<<<<<<<<<Company Details>>>>>>>>>>>>>>>>>>");
        System.out.println("\tCompnay Name             : "+this.company);
        System.out.println("\tCopmany Type             : "+this.type);
        System.out.println("\tCountry                  : "+this.country);
        System.out.println("\tCopnay Owner             : "+this.owner);
	}	
}
class Product extends Company
{
		String productname;
		int productprice;
		String productmfd;
		String productexpdate;
		public Product(String company,String type,String owner,String country,String productname,int productprice,String productmfd,String productexpdate)
		{
			super(company, type, owner, country);
			this. productname=productname;
			this.productprice=productprice;
			this.productmfd=productmfd;
			this.productexpdate=productexpdate;
		}
			void displayp()
			{
				System.out.println("\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("\tProduct Name             : "+this.productname);
				System.out.println("\tProduct price            : "+this.productprice);
				System.out.println("\tProduct Manufacture Date : "+this.productmfd);
				System.out.println("\tExpire Date              : "+this.productexpdate);
			}

		
}
class Costumer extends Company
{
    String costumername;
    int age ;
	public Costumer(String company,String type,String owner,String country,String costumername,int age)
	{
			super(company,type, owner,country);
			this.costumername=costumername;
			this.age=age;
			
	}
			void displayco()
			{
				System.out.println("\t>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("\tCoustumer Name           : "+this.costumername);
				System.out.println("\tCostumer Age             : "+this.age);	
				super.displayc();
			}
} 
class TestMain
{
    public static void main(String[] args) 
    {
        Costumer ob = new Costumer("GAP Pvt ltd","Enterprise","GAP BY KAPIL DHARWAL","india","Kapil ",23);
        ob.displayco();
		Product obp=new Product("GAP Pvt ltd","Enterprise","GAP BY KAPIL DHARWAL","india","FERFUME",100,"08.07.2023","08.07.2024");
		obp.displayp();
        
    }
}