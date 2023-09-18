package MarkPack;
public class Student
{
	private String name,fname,mname,course,branch;
	private int roll,year,sem,p,c,m,h,e,total;
	private double per;
	
	public Student(String name,String fname,String mname,String course,String branch,int roll,int year,int sem,int p,int c,int m,int h,int e)
	{
		this.name=name;
		this.fname=fname;
		this.mname=mname;
		this.course=course;
		this.branch=branch;
		this.roll=roll;
		this.year=year;
		this.sem=sem;
		this.p=p;
		this.c=c;
		this.m=m;
		this.h=h;
		this.e=e;
		this.total = this.p + this.c + this.m + this.h + this.e;
		this.per=this.total/5.0;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setFname(String fname)
	{
		this.fname=fname;
	}
	public void setMname(String mname)
	{
		this.mname=mname;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public void setBranch(String branch)
	{
		this.branch=branch;
	}
	public String getName()
	{
		return this.name;
	}
	public String getFname()
	{
		return this.fname;
	}
	public String getMname()
	{
		return this.mname;
	}
	public String getCourse()
	{
		return this.course;
	}
	public String getBranch()
	{
		return this.branch;
	}
	public void setRoll(int roll)
	{
		this.roll=roll;
	}
	public void setYear(int year)
	{
		this.year=year;
	}
	public void setSem(int sem)
	{
		this.sem=sem;
	}
	public void setP(int p)
	{
		this.p=p;
	}
	public void setC(int c)
	{
		this.c=c;
	}
	public void setM(int m)
	{
		this.m=m;
	}
	public void setH(int h)
	{
		this.h=h;
	}
	public void setE(int e)
	{
		this.e=e;
	}
	public int setTotal(int total)
	{
		return this.total=total;
	}
	public int getRollNumber()
	{
		return this.roll;
	}
	public int getYear()
	{
		return this.year;
	}
	public int getSem()
	{
		return this.sem;
	}
	public int getP()
	{
		return this.p;
	}
	public int getC()
	{
		return this.c;
	}
	public int getM()
	{
		return this.m;
	}
	public int getH()
	{
		return this.h;
	}
	public int getE()
	{
		return this.e;
	}
	public int getTotal()
	{
		return this.total;
	}
	public void setPer(double per)
	{
		this.per=per;
	}
	public double getPer()
	{
		return this.per;
	}
}