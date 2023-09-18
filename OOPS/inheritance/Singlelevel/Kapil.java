import java.util.Scanner;
class Person_Information
{
	int age;
	int weight;
	double hieght;
	double workexp;
	String name;
	String color;
	
	public void setWorkexp(double workexp)
	{
		this.workexp=workexp;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public void setHieght(double hieght)
	{
		this.hieght=hieght;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setColor(String color)
	{
		this.color=color;
	}
	public void setWeight(int weight)
	{
		this.weight=weight;
	}
	public int getAge()
	{
		return this.age;
	}
	public double getHieght()
	{
		return this.hieght;
	}
	public int getWeight()
	{
		return this.weight;
	}
	public String getName()
	{
		return this.name;
	}
	public String getColor()
	{
		return this.color;
	}
	public double getWorkexp()
	{
		return this.workexp;
	}
}
class EmplLoy extends Person_Information
{
	String id;
	String compny;
	public void setId(String id)
	{
		this.id=id;
	}
	public void setCompny(String compny)
	{
		this.compny=compny;
	}
	public String getId()
	{
		return this.id;
	}
	public String getCompny()
	{
		return this.compny;
	}
}
class TestMain
{
	public static void main(String arg[])
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ENTER YOUR AGE");
		int age=sc.nextInt();
		
		System.out.println("ENTER YOUR HIEGHT");
		double hieght=sc.nextDouble();
		
		System.out.println("ENTER YOUR WIEGHT ");
		int weight=sc.nextInt();
		sc.nextLine();
		System.out.println("ENTER YOUR NAME");
		String name=sc.nextLine();
		
		System.out.println("ENTER YOUR COLOR");
		String color=sc.nextLine();
		
		System.out.println("ENTER EMPLLOY ID");
		String id=sc.nextLine();
		
		System.out.println("ENTER EMPLLOY COMPANY NAME ");
		String compny=sc.nextLine();
		
		System.out.println("ENTER YOUR WORKEXP");
		double workexp=sc.nextDouble();
		
		EmplLoy ob=new EmplLoy();
		
		ob.setAge(age);
		ob.setCompny(compny);
		ob.setHieght(hieght);
		ob.setWeight(weight);
		ob.setName(name);
		ob.setId(id);
		System.out.println("\tname   :"+ob.getName());
		System.out.println("\tage    :"+ob.getAge());
		System.out.println("\tHeight :"+ob.getHieght());
		System.out.println("\tWeight :"+ob.getWeight());
		System.out.println("\tID     :"+ob.getId());
		System.out.println("\tcompny :"+ob.getCompny());
		System.out.println("\tcolor  :"+ob.getColor());
		System.out.println("\tworkexp :"+ob.getWorkexp());
	}
}