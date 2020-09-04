/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.Tugas;
import elab.entity.WorkDone;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julian Dwi Putra
 */
public class WorkDoneModel {
    private Connection connection;

    public WorkDoneModel(){
        connection = Database.getConnection();
    } 
    public WorkDone getWork(String nis, String id_tugas) {
        PreparedStatement st = null;
        ResultSet rs = null;
        WorkDone m = null;
        
        String sql = "select * from work where nis =? and id_tugas=? ";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, nis);
            st.setString(2, id_tugas);
            rs = st.executeQuery();
            
            
          while (rs.next()){
              m = new WorkDone();
              m.setId_tugas(rs.getString("id_tugas"));
              m.setId_work(rs.getString("id_work"));
              m.setNis(rs.getString("nis"));
              m.setStatus(rs.getString("status"));
          }
          return m;
        }catch (SQLException ex){
            Logger.getLogger(WorkDoneModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(WorkDoneModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(WorkDoneModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    
    public void UpdateWork(String status, String nis) {
        PreparedStatement st = null;
        
        String sql = "update work set status =? where nis=?  ";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, status);
            st.setString(2, nis);
         
        }catch (SQLException ex){
            Logger.getLogger(WorkDoneModel.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(WorkDoneModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
        }                          
    }
}

