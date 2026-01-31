import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConnection {
    
    public static Connection connect() {
        
        Connection con = null;
        try {

            Class.forName("com.mysql.cj.jdbc.Driver"); 

            String url = "jdbc:mysql://localhost:3306/parking?zeroDateTimeBehavior=CONVERT_TO_NULL"; 
            String user = "root";
            String password = "123456"; // Type your MySQL password here (leave empty if none)
            
            con = DriverManager.getConnection(url, user, password);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Failed: " + e);
        }
        return con;
    }
}