package marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
public class like {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver Connected");
        
        System.out.println("Connection established......");
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","root");
        System.out.println("Driver Connected..");
        String sql="select * from student1 where fname Like ? ";
        PreparedStatement ps=c.prepareStatement(sql);
        
        //ps.setString(1, "a%");
        // ps.setString(1, "%a%");
        //ps.setString(1, "%a");
        //ps.setString(1, "%u");
        // ps.setString(1, "r%l");
        // ps.setString(1, "_r%");
        //ps.setString(1, "r_m%");
        
        ResultSet rs = ps.executeQuery();
        
        while(rs.next()){
          String fname = rs.getString("fname");
            System.out.println(fname);
        }
        c.close();
    }
    
}
