import java.util.Scanner;
abstract class Kpl {
    abstract void k();
    abstract void s();
    abstract void i();
}
  
abstract class swt1 extends Kpl
{
    public void k() 
	{
      System.out.println("\tI AM KAPIL......"); 
    }
}
  
class swt2 extends swt1 
{
    public void s() 
	{
      System.out.println("\tSWATI IS MY BEST FRIEND......"); 
    }
    public void i()
	{
      System.out.println("\tINFOBEANS MY CARRER......");
    }
}
  
class TestMain 
{
    public static void main(String[] args)
    {
        swt2 ob = new swt2();
        ob.k();
        ob.s();
        ob.i();
    }
}