/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.Guru;
import elab.entity.Jadwal_mapel1;
import elab.entity.Jadwal_mapel2;
import elab.entity.Jadwal_mapel3;
import elab.entity.Mapel1;
import elab.entity.Mapel2;
import elab.entity.Mapel3;
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
public class MapelModel {
    private Connection connection;

    public MapelModel(){
        connection = Database.getConnection();
    } 
    public Mapel1 getMapel_1(Jadwal_mapel1 id_mapel) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Mapel1 m = null;
        
        String sql = "select * from mapel where id_mapel =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_mapel.getId_mapel());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              m = new Mapel1();
              m.setId_mapel(rs.getString("id_mapel"));
              m.setNama_Mapel(rs.getString("nama_mapel"));
          }
          return m;
        }catch (SQLException ex){
            Logger.getLogger(MapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(MapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(MapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }

        public Mapel1 getMapel_2(Jadwal_mapel2 id_mapel) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Mapel1 m = null;
        
        String sql = "select * from mapel where id_mapel =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_mapel.getId_mapel());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              m = new Mapel1();
              m.setId_mapel(rs.getString("id_mapel"));
              m.setNama_Mapel(rs.getString("nama_mapel"));
          }
          return m;
        }catch (SQLException ex){
            Logger.getLogger(MapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(MapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(MapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
        public Mapel1 getMapel_3(Jadwal_mapel3 id_mapel) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Mapel1 m = null;
        
        String sql = "select * from mapel where id_mapel =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_mapel.getId_mapel());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              m = new Mapel1();
              m.setId_mapel(rs.getString("id_mapel"));
              m.setNama_Mapel(rs.getString("nama_mapel"));
          }
          return m;
        }catch (SQLException ex){
            Logger.getLogger(MapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(MapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(MapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
