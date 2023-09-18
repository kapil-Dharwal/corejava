import java.util.Scanner;
class Employee 
{
    	String name;
    	int employeeId;

    	Employee(String name, int employeeId) 
		{
        	this.name = name;
        	this.employeeId = employeeId;
    	}

    	void getEmployee() 	
		{
        	System.out.println("\tName: " + name+"\n\tEmployee ID: " + employeeId);
    	}
}
class Manager extends Employee 
{
    	String department;

    	Manager(String name, int employeeId, String department) 
		{
        	super(name, employeeId);
        	this.department = department;
    	}

    	void getManager() 
		{
        	super.getEmployee();
        	System.out.println("\tManager of Department: " + department);
    	}
}
class Developer extends Employee 
{
    	String progLanguage;
    	Developer(String name, int employeeId, String progLanguage) 
		{
        	super(name, employeeId);
        	this.progLanguage = progLanguage;
    	}
    	void getDeveloper() 
		{
        	super.getEmployee();
        	System.out.println("\tProgramming Language: " + progLanguage);
    	}
}
class TestMain
{
    	public static void main(String[] args) 
		{
        	Manager ob = new Manager("\tKAPIL", 898, "Project");
        	ob.getManager();

        	Developer ob1 = new Developer("\tPIYUSH", 999, "PYTHON");
        	ob1.getDeveloper();
    	}
}