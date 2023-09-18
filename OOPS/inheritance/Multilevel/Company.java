import java.util.Scanner;
class Company
{
		String company,type,owner,country;

		public String getCompany()
		{
			return company;
		}

		public void setCompany(String company) 
		{
			this.company = company;
		}

		public String getType() 
		{
			return type;
		}

		public void setType(String type)
		{
			this.type = type;
		}

		public String getOwner()
		{
			return owner;
		}

		public void setOwner(String owner) 
		{
			this.owner = owner;
		}

		public String getCountry() 
		{
			return country;
		}

		public void setCountry(String country) 
		{
			this.country = country;
		}
}
class Product extends Company
{
		String productname;
		int productprice;
		String productmfd;
		String productexpdate;
		public String getProductname() 
		{
			return productname;
		}
		public void setProductname(String productname)
		{
			this.productname = productname;
		}
		public int getProductprice()
		{
			return productprice;
		}
		public void setProductprice(int productprice) 
		{
			this.productprice = productprice;
		}
		public String getProductmfd() 
		{
			return productmfd;
		}
		public void setProductmfd(String productmfd)
		{
			this.productmfd = productmfd;
		}
		public String getProductexpdate() 
		{
			return productexpdate;
		}
		public void setProductexpdate(String productexpdate) 
		{
			this.productexpdate = productexpdate;
		}


}
class Costumer extends Product
{
		String costumername;
		int age ;
		public String getCostumername() 
		{
			return costumername;
		}
		public void setCostumername(String costumername) 
		{
			this.costumername = costumername;
		}
		public int getAge()
		{
			return age;
		}
		public void setAge(int age) 
		{
			this.age = age;
		}

} 
class TestMain
{
		public static void main(String[] args) 
		{
			Costumer ob = new Costumer();

			ob.setCompany("G.A.C.Pvt.Ltd");
			ob.setType("Enterprise");
			ob.setCountry("India");
			ob.setOwner(" G.A.C.Pvt.Ltd company on by KAPIL DHARWAL");
			ob.setCostumername("SOHAN");
			ob.setAge(22);
			ob.setProductname(" Aircondicner");
			ob.setProductprice(25000);
			ob.setProductmfd(" 01.07.2023");
			ob.setProductexpdate(" 01.07.2024");
			System.out.println("\tCompany Details");
			System.out.println("\tCompnay Name             : "+ob.getCompany());
			System.out.println("\tCopmany Type             : "+ob.getType());
			System.out.println("\tCountry                  : "+ob.getCountry());
			System.out.println("\tCopnay Owner             :"+ob.getOwner());
			System.out.println("-----------------------------------------------------                                  ");
			System.out.println("\tCostumer details");
			System.out.println("-----------------------------------------------------                                         ");
			System.out.println("\tCoustumer Name           : "+ob.getCostumername());
			System.out.println("\tCostumer Age             : "+ob.getAge());
			System.out.println("------------------------------------------------------");
			System.out.println("\tProduct details");
			System.out.println("------------------------------------------------------ ");
			System.out.println("\tProduct Name             :"+ob.getProductname());
			System.out.println("\tProduct price            :"+ob.getProductprice());
			System.out.println("\tProduct Manufacture Date : "+ob.getProductmfd());
			System.out.println("\tExpire Date              : "+ob.getProductexpdate());
		}
}