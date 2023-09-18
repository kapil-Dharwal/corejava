import java. util. Scanner; 
class Circle
{
	int r; 
	double x; 
	public void setData(int r)
	 {
	 	this. r=r;
	 }
	 public double circle()
	 {
	 	 x=3.14*this.r*this.r;
	 	 return x; 
	 }
}
class Cylinder extends Circle
{
	int h;
	public void setData(int r,int h)
	{
		this.setData(r);
		this. h=h;
	}
	public double cylin()
	{
	    return this.circle()*this.h; 
	}
}
class TestMain
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner (System. in);
		System.out.println("Enter any two number");
		int r=sc.nextInt();
		int h=sc.nextInt();
		Cylinder ob =new Cylinder ();
		ob. setData(r,h);
		System. out. println(" Area of circle ="+ob. circle());
		System. out. println("volume of cylinder ="+ob. cylin());
	}
}