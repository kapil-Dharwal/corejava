import java.util.Scanner;
class Person
{
		String name,gender;
		int age, height,weight;
		public void setData(String name,String gender, int age, int height, int weight)
		{
			this. name=name;
			this. gender=gender;
			this. age=age;
			this. height=height;
			this. weight=weight;
		}
		public void p()
		{
			System.out.println("\nName :"+name+"\nGender :"+gender+"\nAge :"+age+"\nHeight :"+height+"\nWeight :"+weight);
		}
}
class Company extends Person 
{
		String company; int employee;
		public void setData(String name,String gender, int age, int height, int weight,String company, int employee )
		{
			this.setData(name,gender,age,height,weight);
			this.company=company;
			this.employee=employee;
		}
		public void com()
		{
			this. p();
			System. out. println("Company name:"+company +"\nNo. of employee in company:"+employee );	
		}
}
class Employee extends Company 
{
		int id, salary; 
		public void setData(String name,String gender, int age, int height,int weight , String company, int employee, int id, int salary)
		{
			this.setData(name,gender,age,height,weight,company,employee);
			this.id=id;
			this. salary =salary; 
		}
		public void emp()
		{
			this.com();
			System. out. println("Id  :"+id+"\nsalary :"+salary );
		}
}
class TestMain
{
		public static void main(String[] args) 
		{
			Employee ob =new Employee();
			ob. setData("Kavita sharma","F",20,149,40,"TCS company ",300,0012,25000);
			ob.emp();
		}
}