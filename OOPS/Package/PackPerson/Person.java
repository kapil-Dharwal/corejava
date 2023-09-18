package pkgPer
import java.util.Scanner;
class Person_Information
{
	int age;
	double hieght;
	int weight;
	String name;
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
}