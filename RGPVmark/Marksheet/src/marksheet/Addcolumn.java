package marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HP
 */
public class Addcolumn {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Connected");
        //String mysqlUrl = "jdbc:mysql://localhost:3306/login";
        System.out.println("Connection established......");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","root");
        System.out.println("Driver Connected..");
        String sql="alter table inter add(mname VARCHAR(25))";
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
    
}
