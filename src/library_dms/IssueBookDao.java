/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_dms;

/**
 *
 * @author Hefaz
 */
import java.sql.*;
public class IssueBookDao {
	
public static boolean checkBook(String bookcallno){
	boolean status=false;
	try{
            try (Connection con = DB.getConnection()) {
                PreparedStatement ps=con.prepareStatement("select * from books where callno=?");
                ps.setString(1,bookcallno);
                ResultSet rs=ps.executeQuery();
                status=rs.next();
            }
	}catch(Exception e){System.out.println(e);}
	return status;
}

public static int save(String bookcallno,int student_id){
	int status=0;
	try{
            try (Connection con = DB.getConnection()) {
                status=updatebook(bookcallno);//updating quantity and issue
                
                if(status>0){
                    PreparedStatement ps=con.prepareStatement("insert into issued(bookcallno,student_id) values(?,?)");
                    ps.setString(1,bookcallno);
                    ps.setInt(2,student_id);
                    status=ps.executeUpdate();
                }
            } //updating quantity and issue
	}catch(Exception e){System.out.println(e);}
	return status;
}
public static int updatebook(String bookcallno){
	int status=0;
	int quantity=0,issued=0;
	try{
            try (Connection con = DB.getConnection()) {
                PreparedStatement ps=con.prepareStatement("select quantity,issued from books where callno=?");
                ps.setString(1,bookcallno);
                ResultSet rs=ps.executeQuery();
                if(rs.next()){
                    quantity=rs.getInt("quantity");
                    issued=rs.getInt("issued");
                }
                
                if(quantity>0){
                    PreparedStatement ps2=con.prepareStatement("update books set quantity=?,issued=? where callno=?");
                    ps2.setInt(1,quantity-1);
                    ps2.setInt(2,issued+1);
                    ps2.setString(3,bookcallno);
                    
                    status=ps2.executeUpdate();
                }
            }
	}catch(Exception e){System.out.println(e);}
	return status;
}
}

