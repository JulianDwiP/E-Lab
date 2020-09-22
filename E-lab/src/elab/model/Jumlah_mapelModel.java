/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.Jadwal_lab1;
import elab.entity.Jadwal_lab2;
import elab.entity.Jadwal_mapel1;
import elab.entity.Jumlah_mapel;
import elab.entity.Mapel1;
import elab.entity.Nama_guru1;
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
public class Jumlah_mapelModel {
    private Connection connection;

    public Jumlah_mapelModel(){
        connection = Database.getConnection();
    } 
    public Jumlah_mapel getMapel_row(Jadwal_lab1 id_lab) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jumlah_mapel jm = null;
        
        String sql = "select count(id_jadwal_lab) as hasil from jadwal_mapel where id_jadwal_lab =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_lab.getId_jadwal_lab());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              jm = new Jumlah_mapel();
              jm.setHasil(rs.getString("hasil"));
          }
          return jm;
        }catch (SQLException ex){
            Logger.getLogger(Jumlah_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jumlah_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jumlah_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    public Jumlah_mapel getMapel_row2(Jadwal_lab2 id_lab) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jumlah_mapel jm = null;
        
        String sql = "select count(id_jadwal_lab) as hasil from jadwal_mapel where id_jadwal_lab =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_lab.getId_jadwal_lab());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              jm = new Jumlah_mapel();
              jm.setHasil(rs.getString("hasil"));
          }
          return jm;
        }catch (SQLException ex){
            Logger.getLogger(Jumlah_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jumlah_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jumlah_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
