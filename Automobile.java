/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package automobile;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ASUS
 */
public class Automobile {
    
    Connection con;
    Statement st;

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
       login_form lf=new login_form();
        lf.setVisible(true);
        
    }
    public Connection getcon() 
    {   try{
        String url="jdbc:mysql://localhost:3306/dbms";
        String user="root";
        String password="Rahul@123";
        Class.forName("com.mysql.cj.jdbc.Driver");
        con=DriverManager.getConnection(url, user, password);
        
        st=con.createStatement();
        }
        catch(Exception e)
        {
            System.err.println("connection not established");
        }
        
        return con;
    }
}
