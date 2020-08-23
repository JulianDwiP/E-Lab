/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.User;
import elab.service.ServiceUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserModel implements ServiceUser {
    private Connection connection;

    public UserModel(){
        connection = Database.getConnection();
    } 
    public Boolean getLogin(User usr) {
        PreparedStatement st = null;
        ResultSet rs = null;
        String sql = "select count(*) from siswa where username=? and password=?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1,usr.getUsername());
            st.setString(2,usr.getPassword());
            rs = st.executeQuery();
            
            int h = 0;
            
            if(rs.next())
                h = rs.getInt(1);
            if(h==0)
                return false;
            else
                return true;
        }catch (SQLException ex){
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE,null,ex);
            return false;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
    }
    public void insertUser(User usr){
        PreparedStatement st = null;
        String sql = "insert into billing value(null,?,?,?,?,?)";
        try{
            st = connection.prepareStatement(sql);
            st.setString(1, usr.getMapel());
            st.setString(2, usr.getUsername());
            st.setString(3, usr.getPassword());
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE, null,ex);
                }
            }
        }
    }

    public User getLoginData(User usr) {
        PreparedStatement st = null;
        ResultSet rs = null;
        User u = null;
        String sql = "select * from siswa where username=? and password=?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1,usr.getUsername());
            st.setString(2,usr.getPassword());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              u = new User();
              u.setNis(rs.getString("nis"));
              u.setNama(rs.getString("nama"));
              u.setUsername(rs.getString("username"));
              u.setPassword(rs.getString("password"));
              u.setId_kom(rs.getString("id_komputer"));
              u.setId_kelas(rs.getString("id_kelas"));
          }
          return u;
        }catch (SQLException ex){
            Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(UserModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    

}
