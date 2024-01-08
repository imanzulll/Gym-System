/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//hazlami

package gym;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java. sql.Statement;

public class gym_system {
    
    public static void main(String[] args){
        Connection myConn;
        Statement myStmt;
        ResultSet myRs;

        String address = "jdbc:mysql://localhost:3306/gym_system";
        String user = "root";
        String pass = "";

        //test the connection
         try{
                myConn = DriverManager.getConnection(address,user,pass);
                System.out.println("Connection Success");
                
                myStmt = myConn.createStatement();
                
                myRs = myStmt.executeQuery("Select * from coaches");
                
                myRs.next();
                System.out.println(myRs.getString("coach_id"));
                myRs.next();
                System.out.println(myRs.getString("coach_id"));
                myRs.next();
                System.out.println(myRs.getString("coach_id"));

                //update record
                myStmt.executeUpdate("Update members ");

}catch(Exception x){
    
    System.out.println("Connection Fail" + x);
}
}
}
