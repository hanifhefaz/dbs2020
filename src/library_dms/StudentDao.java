/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_dms;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Hefaz
 */

public class StudentDao {
public static int save(String name,String contact){
		int status=0;
		try{
                    try (java.sql.Connection con = DB.getConnection()) {
                        PreparedStatement ps=con.prepareStatement("insert into students(name,contact) values(?,?)");
                        ps.setString(1,name);
                        ps.setString(2,contact);
                        status=ps.executeUpdate();
                    }
		}catch(SQLException e){
                    System.out.println(e);}
		return status;
	}

	public static int delete(int id){
		int status=0;
		try{
                    try (java.sql.Connection con = DB.getConnection()) {
                        PreparedStatement ps=con.prepareStatement("delete from students where id=?");
                        ps.setInt(1,id);
                        status=ps.executeUpdate();
                    }
		}catch(Exception e){System.out.println(e);}
		return status;
	}

}
   

