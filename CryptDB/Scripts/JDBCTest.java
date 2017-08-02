import java.sql.Connection;
import java.sql.DriverManager;

class JDBCTest {

    static String url = "jdbc:mysql://localhost";

    static String user = "root";

    static String password = "123";

    public static void main(String args[]) {

        try {
            Connection con;
	    Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, password);
            System.out.println("Success"); 
        } catch (Exception e) {
            e.printStackTrace(); 
        }
    }
}
