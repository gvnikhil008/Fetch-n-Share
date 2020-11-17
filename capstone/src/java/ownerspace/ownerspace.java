package ownerspace;

import DataBaseCon.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ownerspace{

    private Connection con = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
 public   boolean spaceUpdated(String name) throws SQLException{
     String serivce="update";
     boolean flag = false;
     try{
     con = DbConnection.getConnection();
   String Query="update ownerreg set service=? where sharedkey=?";
   ps=con.prepareStatement(Query);
    ps.setString(1, serivce);
    ps.setString(2, name);
            int n=0;
            n=ps.executeUpdate();
     if (n>0) {
         return flag=true;
     } 
     }catch(Exception e){
     e.printStackTrace();
     }finally{
             try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
 }
     return flag;
 }
  
  public int aownerSpace(String uname){
  int availmemory=0;
  try {
            con = DbConnection.getConnection();
            String query = "select storage from cloudservice where name1 = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            rs = ps.executeQuery();
            if (rs.next()) {
                availmemory = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error at getting user memory " + e.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();                
                con.close();
            } catch (Exception e) {
            }
        }
  
  return availmemory;
  } 
  
  
   public int rownerSpace(String uname){
  int availmemoryy=0;
  try {
            con = DbConnection.getConnection();
            String query = "select storage from cloudservice where name1 = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, uname);
            rs = ps.executeQuery();
            if (rs.next()) {
                availmemoryy = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error at getting user memory " + e.getMessage());
        } finally {
            try {
                rs.close();
                ps.close();                
                con.close();
            } catch (Exception e) {
            }
        }
  
  return availmemoryy;
  } 
  
   public boolean updateaownerSpace(String uname, long mem1) {
        boolean flag = false;
        try {
            String query = "update cloudservice set storage = ? where name1 = ?";
            con = DbConnection.getConnection();
            ps = con.prepareStatement(query);
            ps.setLong(1, mem1);
            ps.setString(2, uname);
            int no = ps.executeUpdate();
            if (no > 0) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println("Error frm user memory update " + e.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }
   public boolean updaterownerSpace(String uname1, long mem2) {
        boolean flag = false;
        try {
            String query = "update cloudservice set storage = ? where name1 = ?";
            con = DbConnection.getConnection();
            ps = con.prepareStatement(query);
            ps.setLong(1, mem2);
            ps.setString(2, uname1);
            int no = ps.executeUpdate();
            if (no > 0) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println("Error frm user memory update " + e.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }
   
      public boolean updaeStaus(String uname2, int rid) {
        boolean flag = false;
        try {
            String query = "update reqspace set requestedStatus = ? where rid = ?";
            con = DbConnection.getConnection();
            ps = con.prepareStatement(query);
            ps.setString(1, uname2);
            ps.setInt(2, rid);
            int no = ps.executeUpdate();
            if (no > 0) {
                flag = true;
            }
        } catch (Exception e) {
            System.out.println("Error frm user memory update " + e.getMessage());
        } finally {
            try {
                ps.close();
                con.close();
            } catch (Exception e) {
            }
        }
        return flag;
    }
  
}
