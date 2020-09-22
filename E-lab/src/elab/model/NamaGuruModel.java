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
import elab.entity.Jadwal_mapel4;
import elab.entity.Nama_guru1;
import elab.entity.Nama_guru2;
import elab.entity.Nama_guru3;
import elab.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class NamaGuruModel {
     private Connection connection;
     
      public NamaGuruModel(){
        connection = Database.getConnection();
    }
      public Nama_guru1 getNama_guru1(Jadwal_mapel1 id_guru) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Nama_guru1 n = null;
        
        String sql = "select * from guru where id_guru =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_guru.getId_guru());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              n = new Nama_guru1();
              n.setId_guru(rs.getString("id_guru"));
              n.setNama_Guru(rs.getString("nama_guru"));
          }
          return n;
        }catch (SQLException ex){
            Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }

        public Nama_guru1 getNama_guru2(Jadwal_mapel2 id_guru) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Nama_guru1 n = null;
        
        String sql = "select * from guru where id_guru =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_guru.getId_guru());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              n = new Nama_guru1();
              n.setId_guru(rs.getString("id_guru"));
              n.setNama_Guru(rs.getString("nama_guru"));
          }
          return n;
        }catch (SQLException ex){
            Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
        public Nama_guru1 getNama_guru3(Jadwal_mapel3 id_guru) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Nama_guru1 n = null;
        
        String sql = "select * from guru where id_guru =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_guru.getId_guru());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              n = new Nama_guru1();
              n.setId_guru(rs.getString("id_guru"));
              n.setNama_Guru(rs.getString("nama_guru"));
          }
          return n;
        }catch (SQLException ex){
            Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                        Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
        
        public Nama_guru1 getNama_guru4(Jadwal_mapel4 id_guru) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Nama_guru1 n = null;
        
        String sql = "select * from guru where id_guru =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_guru.getId_guru());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              n = new Nama_guru1();
              n.setId_guru(rs.getString("id_guru"));
              n.setNama_Guru(rs.getString("nama_guru"));
          }
          return n;
        }catch (SQLException ex){
            Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                        Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(NamaGuruModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
