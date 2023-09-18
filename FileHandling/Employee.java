import java.io*;
class Employee implements Serializable
{
		private int id;
		private String name;
		private double sal;
		
		public Employee()
		{
			
		}
		public void setId(int id)
		{	
			this.id=id;
		}
		public void setName(String name)
		{
			this.name=name;
		}
		public void setSal(double Sal)
		{
			this.sal=sal;
		}
		public int getId()
		{
			return this.id;
		}
		public getName()
		{
			return this.name;
		}
		public int getSal()
		{
			return this.sal;
		}
}
class Test
{
		public static void main(String args [])throws FileNotFoundException,IOException,ClassNotFoundException
		{
			Employee el=new Employee(101,"kapil",100000);
			System.out.println("Before Serializable..");
			System.out.println(""+el);
			File fobj=new File ("emp.txt");
			FileOutputStream fos = new FileOutputStream(fobj);
			ObjectOutputStream oos = new ObjectOutputStream
		}
}