/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marksheet;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Insert {
    public static void main(String[] args) throws SQLException, ClassNotFoundException,Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Connected");
        //String mysqlUrl = "jdbc:mysql://localhost:3306/login";
        System.out.println("Connection established......");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
        System.out.println("Driver Connected..");
        String sql="insert into inter Values(?,?,?,?,?)";
        PreparedStatement ps=c.prepareStatement(sql);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id No");
        String id=sc.next();
        System.out.println("Enter  name");
        String name=sc.next();
        sc.nextLine();
        System.out.println("Enter pass ");
        String pass = sc.nextLine();
        System.out.println("Enter  fname");
        String fname=sc.next();
        System.out.println("enter mname");
         String mname=sc.next();
        ps.setString(1,id );
        ps.setString(2, name);
        ps.setString(3, pass);
         ps.setString(4, fname);
         ps.setString(5, mname);
              
        int i=ps.executeUpdate();
        if(i>0)
        {
            System.out.println("Success");
        }
        else
        {
            System.out.println("unsuccessful");
        }
        ps.close();
        c.close();
        
    }
    
}