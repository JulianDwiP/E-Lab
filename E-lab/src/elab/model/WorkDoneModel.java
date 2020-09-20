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
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
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
              m.setDate_time(rs.getTimestamp("date_time"));
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
    
    public void InsertWork(String nis, String id_tugas, String status){
        PreparedStatement st = null;
        
        String sql = "insert into work(nis,id_tugas,status,created_at,updated_at, deleted_at,date_time) value(?,?,?,?,?,?,?)";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, nis);
            st.setString(2, id_tugas);
            st.setString(3, status);
            java.util.Date date=new java.util.Date();
            java.sql.Date sqlDate=new java.sql.Date(date.getTime());
            st.setDate(4, sqlDate);
            st.setDate(5, sqlDate);
            st.setDate(6, sqlDate);
            Timestamp ts = new Timestamp(date.getTime());
            st.setTimestamp(7, ts);
            st.executeUpdate();
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
    
    public void UpdateWork(String status, Timestamp ts, String nis, String id_tugas) {
        PreparedStatement st = null;
        
        String sql = "update work set status =?, date_time =? where nis=? && id_tugas=?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, status);
            st.setTimestamp(2, ts);
            st.setString(3, nis);
            st.setString(4, id_tugas);
            st.executeUpdate();
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
    public void UpdateTugas(String status, String id_tugas) {
        PreparedStatement st = null;
        
        String sql = "update tugas set status =? where id_tugas=?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, status);
            st.setString(2, id_tugas);
            st.executeUpdate();
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

