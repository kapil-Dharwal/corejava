import java.lang.String;
public class Employee
{
		private int id;
		private String name;
		private int sal;
		
		public Employee(int id,String name,int sal)
		{
			this.id=id;
			this.name=name;
			this.sal=sal;
		}
		public String toString()
		{
			return "ID="+ this.id +" Name="+ this.name+ " Salary="+ this.sal;
		}
}
class TestMain
{
		public static void main(String args [])
		{
			Employee ob=new Employee(101,"Kapil",50000);
			System.out.println(ob);
		}
}