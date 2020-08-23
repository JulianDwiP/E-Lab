/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.Guru;
import elab.entity.Mapel1;
import elab.entity.User;
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
public class GuruModel {
    private Connection connection;

    public GuruModel(){
        connection = Database.getConnection();
    } 
    public Guru getData_guruV(Mapel1 id_mapel) {
        PreparedStatement st = null;
        ResultSet rs = null;
        User u = new User();
        Guru g = null;
        
        String sql = "select * from guru where id_mapel =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_mapel.getId_mapel());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              g = new Guru();
              g.setIdi_guru(rs.getString("id_guru"));
              g.setIdi_mapel(rs.getString("id_mapel"));
              g.setNip(rs.getString("nip"));
              g.setNama_guru(rs.getString("nama_guru"));
          }
          return g;
        }catch (SQLException ex){
            Logger.getLogger(GuruModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(GuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(GuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    
    public Guru getDataGuru() {
        PreparedStatement st = null;
        ResultSet rs = null;
        Guru g = null;
        String sql = "select * from guru";
        try {
            st = connection.prepareStatement(sql);
            rs = st.executeQuery();
            
            
          while (rs.next()){
              g = new Guru();
              g.setIdi_guru(rs.getString("id_guru"));
              g.setIdi_mapel(rs.getString("id_mapel"));
              g.setNip(rs.getString("nip"));
              g.setNama_guru(rs.getString("nama_guru"));
          }
          return g;
        }catch (SQLException ex){
            Logger.getLogger(GuruModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(GuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(GuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
