/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Delete {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
       try
       {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Connected");
        
        System.out.println("Connection established......");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
        System.out.println("Driver Connected..");
        String sql="delete from inter where id=34";
        PreparedStatement ps=c.prepareStatement(sql);
        int i=ps.executeUpdate();
        if(i>0){
            System.out.println("Success");
        }
        else{
            System.out.println("unsuccessfull");
        }
        ps.close();
        c.close();
    }
       catch(Exception e)
       {
       }
    }
    
}
