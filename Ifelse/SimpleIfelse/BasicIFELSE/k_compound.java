import java.util.Scanner;
import java.lang.System;
import java.lang.String;

class kcompound{
public static void main(String[]args){

Scanner sc= new Scanner(System.in);

System.out.println("Enter principal amount");
int p=sc.nextInt();

System.out.println("Enter rate");
float r=sc.nextFloat();

float c = p*((1+r/100)*(1+r/100)*(1+r/100));
System.out.println("Compound intrast = "+c);
}
}