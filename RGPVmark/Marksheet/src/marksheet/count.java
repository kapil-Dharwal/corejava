package marksheet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class count {
       public static void main(String[] args) throws ClassNotFoundException, SQLException {
         Class.forName("com.mysql.cj.jdbc.Driver");     
        Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/student1","root","root");
       
        String sql="select count(*) as count from student1 where gender = ? ";
        PreparedStatement ps=c.prepareStatement(sql);
        
        ps.setString(1, "m");
        
        ResultSet rs = ps.executeQuery();
        
        while (rs.next()){
            int count = rs.getInt("count");
            System.out.println(count);
        }
        c.close();
    }
}
