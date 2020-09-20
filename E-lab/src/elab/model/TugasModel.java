/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.Tugas;
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
public class TugasModel {
     private Connection connection;

    public TugasModel(){
        connection = Database.getConnection();
    } 
    public Tugas getTugas(String id_mapel) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Tugas m = null;
        
        String sql = "select * from tugas where id_tugas =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_mapel);
            rs = st.executeQuery();
            
            
          while (rs.next()){
              m = new Tugas();
              m.setId_tugas(rs.getString("id_tugas"));
              m.setId_jadwal_mapel(rs.getString("id_jadwal_mapel"));
              m.setTitle(rs.getString("title"));
              m.setDescription(rs.getString("description"));
              m.setDue_date(rs.getTimestamp("due_date"));
              m.setStatus(rs.getString("status"));
          }
          return m;
        }catch (SQLException ex){
            Logger.getLogger(TugasModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(TugasModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(TugasModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
