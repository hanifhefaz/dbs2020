/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_dms;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Hefaz
 */

public class BookDao {
    
    
    //adding new books to table.
    
public static int save(String callno,Object com,String name,String author,String publisher,int quantity) throws SQLException{
	int status;
        int catID = 0;
	
          Connection con = DB.getConnection();
                try{ 
            con.setAutoCommit(false); 
            String query = "select id from category where name= " +"'" + com + "'" ;
            java.sql.PreparedStatement pst = DB.getConnection().prepareStatement(query);
            ResultSet rs = pst.executeQuery(query);
            
            while(rs.next()){
                catID =  rs.getInt(1);
                }

            query = "insert into books (callno,category_id, name, author, publisher, quantity ) values (?,?,?,?,?,?)";
           
            pst = DB.getConnection().prepareStatement(query);
            pst.setString(1, callno);
            pst.setInt(2, catID);
            pst.setString(3, name);
            pst.setString(4, author);
            pst.setString(5, publisher);
            pst.setInt(6, quantity);
            pst.executeUpdate();
           con.commit();
           status =1;
        }catch(SQLException e){
           con.rollback();
            System.out.println(e);
            status = 0;
        }
                return status;
}

// This will delete books from the table based on callno.

	public static int delete(String bookcallno){
		int status=0;
		try{
                    try (java.sql.Connection con = DB.getConnection()) {
                        PreparedStatement ps=con.prepareStatement("delete from books where callno=?");
                        ps.setString(1,bookcallno);
                        status=ps.executeUpdate();
                    }
		}catch(Exception e){System.out.println(e);}
		return status;
	}
       

}
   

