
package codes;

import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
//import com.mysql.jdbc.Connection;
//import java.sql.DriverManager;

public class DBconnect {
    
    public static Connection connect(){
    
        Connection conn = null;
        
        try {
            Class.forName("com.mysql.jdbc.driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_database","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return conn;
}

    
    
}
