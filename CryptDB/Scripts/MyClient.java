import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MyClient {

    public static void main(String[] args) {

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;

        String url = "jdbc:mysql://192.168.20.154:3307/YourQuery";
        String user = "you user name";
        String password = "your password";

        try {
            con = DriverManager.getConnection(url, user, password);
            st = con.createStatement();
            rs = st.executeQuery("SELECT MyClient()");

            if (rs.next()) {
                System.out.println(rs.getString(1));
            }

        } catch (SQLException ex) {
            Logger lgr = Logger.getLogger(MyClient.class.getName());
            lgr.log(Level.SEVERE, ex.getMessage(), ex);

        } finally {
            
        	try {
                if (rs != null || st != null || con != null) {
                    rs.close();
                }

            } catch (SQLException ex) {
                Logger lgr = Logger.getLogger(MyClient.class.getName());
                lgr.log(Level.WARNING, ex.getMessage(), ex);
            }
        
        }
    }
}