import java.sql.*;

public class sqlconnection {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hr","root","root");
        if(con != null)
            System.out.println("Connected");
        else
            System.out.println("not Connected");
    }
}
