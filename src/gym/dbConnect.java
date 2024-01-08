
package gym;

import java.sql.*;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hazlami
 */
public class dbConnect {
public Connection con;
public Statement st;
public dbConnect()
        {
          //  dbConnector();
        }
        public Connection dbConnector(){
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gym_system","root","");
            st = con.createStatement();

            return con;
        }catch(Exception e){ 
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e,"WARNING !!", JOptionPane.WARNING_MESSAGE);
            
            return null;
        }  
    }
        public void dbClose()
        {
            try {
                if(con!=null)
            {
            con.close();
            st.close();  
            }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e,"WARNING !!", JOptionPane.WARNING_MESSAGE);
                e.printStackTrace();
            }
           

        }
}
