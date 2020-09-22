/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.Hari;
import elab.entity.Jadwal_lab1;
import elab.entity.Jadwal_lab2;
import elab.entity.Jadwal_mapel1;
import elab.entity.Jadwal_mapel2;
import elab.entity.Jadwal_mapel3;
import elab.entity.Jadwal_mapel4;
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
public class Jadwal_mapelModel {
    private Connection connection;

    public Jadwal_mapelModel(){
        connection = Database.getConnection();
    } 
    public Jadwal_mapel1 getJadwal_mapel1(Jadwal_lab1 jadwal_lab1) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_mapel1 jm1 = null;
        
        String sql = "select * from jadwal_mapel where id_jadwal_lab=? order by jam_mulai limit 0,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, jadwal_lab1.getId_jadwal_lab());
            rs = st.executeQuery();

          while (rs.next()){
              jm1 = new Jadwal_mapel1();
              jm1.setId_jadwal_lab(rs.getString("id_jadwal_mapel"));
              jm1.setId_kelas(rs.getString("id_kelas"));
              jm1.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jm1.setId_mapel(rs.getString("id_mapel"));
              jm1.setId_guru(rs.getString("id_guru"));
              jm1.setJam_mulai(rs.getString("jam_mulai"));
              jm1.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jm1;
        }catch (SQLException ex){
            Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    public Jadwal_mapel2 getJadwal_mapel2(Jadwal_lab1 jadwal_lab1) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_mapel2 jm2 = null;
        
        String sql = "select * from jadwal_mapel where id_jadwal_lab=? order by jam_mulai limit 1,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, jadwal_lab1.getId_jadwal_lab());
            rs = st.executeQuery();

          while (rs.next()){
              jm2 = new Jadwal_mapel2();
              jm2.setId_jadwal_lab(rs.getString("id_jadwal_mapel"));
              jm2.setId_kelas(rs.getString("id_kelas"));
              jm2.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jm2.setId_mapel(rs.getString("id_mapel"));
              jm2.setId_guru(rs.getString("id_guru"));
              jm2.setJam_mulai(rs.getString("jam_mulai"));
              jm2.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jm2;
        }catch (SQLException ex){
            Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    public Jadwal_mapel3 getJadwal_mapel3(Jadwal_lab1 jadwal_lab1) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_mapel3 jm3 = null;
        
        String sql = "select * from jadwal_mapel where id_jadwal_lab=? order by jam_mulai limit 2,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, jadwal_lab1.getId_jadwal_lab());
            rs = st.executeQuery();

          while (rs.next()){
              jm3 = new Jadwal_mapel3();
              jm3.setId_jadwal_lab(rs.getString("id_jadwal_mapel"));
              jm3.setId_kelas(rs.getString("id_kelas"));
              jm3.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jm3.setId_mapel(rs.getString("id_mapel"));
              jm3.setId_guru(rs.getString("id_guru"));
              jm3.setJam_mulai(rs.getString("jam_mulai"));
              jm3.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jm3;
        }catch (SQLException ex){
            Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    public Jadwal_mapel4 getJadwal_mapel4(Jadwal_lab1 jadwal_lab1) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_mapel4 jm4 = null;
        
        String sql = "select * from jadwal_mapel where id_jadwal_lab=? order by jam_mulai limit 3,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, jadwal_lab1.getId_jadwal_lab());
            rs = st.executeQuery();

          while (rs.next()){
              jm4 = new Jadwal_mapel4();
              jm4.setId_jadwal_lab(rs.getString("id_jadwal_mapel"));
              jm4.setId_kelas(rs.getString("id_kelas"));
              jm4.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jm4.setId_mapel(rs.getString("id_mapel"));
              jm4.setId_guru(rs.getString("id_guru"));
              jm4.setJam_mulai(rs.getString("jam_mulai"));
              jm4.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jm4;
        }catch (SQLException ex){
            Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    
    public Jadwal_mapel1 getJadwal_mapel2_1(Jadwal_lab2 jadwal_lab1) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_mapel1 jm1 = null;
        
        String sql = "select * from jadwal_mapel where id_jadwal_lab=? order by jam_mulai limit 0,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, jadwal_lab1.getId_jadwal_lab());
            rs = st.executeQuery();

          while (rs.next()){
              jm1 = new Jadwal_mapel1();
              jm1.setId_jadwal_lab(rs.getString("id_jadwal_mapel"));
              jm1.setId_kelas(rs.getString("id_kelas"));
              jm1.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jm1.setId_mapel(rs.getString("id_mapel"));
              jm1.setId_guru(rs.getString("id_guru"));
              jm1.setJam_mulai(rs.getString("jam_mulai"));
              jm1.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jm1;
        }catch (SQLException ex){
            Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    public Jadwal_mapel2 getJadwal_mapel2_2(Jadwal_lab2 jadwal_lab1) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_mapel2 jm2 = null;
        
        String sql = "select * from jadwal_mapel where id_jadwal_lab=? order by jam_mulai limit 1,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, jadwal_lab1.getId_jadwal_lab());
            rs = st.executeQuery();

          while (rs.next()){
              jm2 = new Jadwal_mapel2();
              jm2.setId_jadwal_lab(rs.getString("id_jadwal_mapel"));
              jm2.setId_kelas(rs.getString("id_kelas"));
              jm2.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jm2.setId_mapel(rs.getString("id_mapel"));
              jm2.setId_guru(rs.getString("id_guru"));
              jm2.setJam_mulai(rs.getString("jam_mulai"));
              jm2.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jm2;
        }catch (SQLException ex){
            Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    public Jadwal_mapel3 getJadwal_mapel2_3(Jadwal_lab2 jadwal_lab1) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_mapel3 jm3 = null;
        
        String sql = "select * from jadwal_mapel where id_jadwal_lab=? order by jam_mulai limit 2,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, jadwal_lab1.getId_jadwal_lab());
            rs = st.executeQuery();

          while (rs.next()){
              jm3 = new Jadwal_mapel3();
              jm3.setId_jadwal_lab(rs.getString("id_jadwal_mapel"));
              jm3.setId_kelas(rs.getString("id_kelas"));
              jm3.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jm3.setId_mapel(rs.getString("id_mapel"));
              jm3.setId_guru(rs.getString("id_guru"));
              jm3.setJam_mulai(rs.getString("jam_mulai"));
              jm3.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jm3;
        }catch (SQLException ex){
            Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    public Jadwal_mapel4 getJadwal_mapel2_4(Jadwal_lab2 jadwal_lab1) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_mapel4 jm4 = null;
        
        String sql = "select * from jadwal_mapel where id_jadwal_lab=? order by jam_mulai limit 3,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, jadwal_lab1.getId_jadwal_lab());
            rs = st.executeQuery();

          while (rs.next()){
              jm4 = new Jadwal_mapel4();
              jm4.setId_jadwal_lab(rs.getString("id_jadwal_mapel"));
              jm4.setId_kelas(rs.getString("id_kelas"));
              jm4.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jm4.setId_mapel(rs.getString("id_mapel"));
              jm4.setId_guru(rs.getString("id_guru"));
              jm4.setJam_mulai(rs.getString("jam_mulai"));
              jm4.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jm4;
        }catch (SQLException ex){
            Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Jadwal_mapelModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
