/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author abdul
 */
public class ConnectionProvider {
    public static Connection getCon(){
        try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/lms","root","Abdulrahiman*9505");
           return con;
        }
        catch(Exception e){
            System.out.println(e);
            return null;
        }
    }
    
}
