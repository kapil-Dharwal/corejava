import java.io.*;
class Mearg
{

   public static void main(String[] args) throws FileNotFoundException,IOException
   {
       File fobj= new File("copy_marg.text.text");
       FileInputStream i = new FileInputStream("Age.text");
       FileInputStream f1= new FileInputStream("Fibonacci.text");
       FileOutputStream f2 = new FileOutputStream(fobj);
       int x,y;
       while((x=i.read()) != -1)
       {
           f2.write(x);
           f2.flush();
           
       }
       while((y=f1.read()) != -1)
       {
           f2.write(y);
           f2.flush();
           
       }
       f2.close();
   }
}