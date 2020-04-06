/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_dms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hefaz
 */
public class JoinConnection {
    
    public Connection con;
    public Statement stat;
    public ResultSet res;
    
    public JoinConnection(){
        
        systemConnection();
    }
    
    public void systemConnection(){
		try{
		Class.forName("com.mysql.jdbc.Driver");
		con =(com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","");
                stat = (Statement) con.createStatement();
		}catch(ClassNotFoundException | SQLException e){System.out.println(e);}
	}
}
