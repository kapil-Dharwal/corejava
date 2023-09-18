import java.util.Scanner;
class Laber 
{
    int salary = 7500;
}

class  Forest extends Laber 
{
    int benefits = 250;
}

class TestMain 
{
    public static void main(String args[])
    {
       Forest F = new Forest();
       System.out.println("Salary:"+F.salary+ "\nBenefits:"+ F.benefits);
 
    }
}