import java.util.Scanner;
class Factorial 
{
    int a; 
    public void setData(int a)
    {
  	  this.a=a;
    }
    public int fact()
    {
  	   int fact=1,i;
  	   for(i=1;i<=this.a;i++)
	   {
  	     fact=fact*i;
	   }
  	   return fact; 
    }
}
class Power extends Factorial 
{
    int i, b ,p; 
    public  void setData(int a, int b)
    {
  	    this.setData(a);
  	    this.b=b;
    }
    public int pow()
    {
      	for(i=1,p=1;i<this.b;p=p*b,i++);
		//for( i=1,f=1;i<=this.n;f=f*i,i++);
        return p; 
    }
}
 class TestMain 
 {
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner (System. in);
	    System. out. println("enter no. ");
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    
	    Power ob =new Power ();
	    ob.setData(a,b);
	    System.out.println("factorial="+ob. fact());
	    System.out.println("power ="+ob.pow());
	}
}