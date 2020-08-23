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
import elab.entity.Komputer;
import elab.entity.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Julian Dwi Putra
 */
public class JadwalLabModel {
    private Connection connection;

    public JadwalLabModel(){
        connection = Database.getConnection();
    } 
    public Jadwal_lab1 getJadwal_1(User user, Hari hari) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_lab1 jl = null;
        
        String sql = "select * from jadwal_lab where id_kelas=? && id_hari=? order by jam_mulai limit 0,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, user.getId_kelas());
            st.setString(2, hari.getId_hari());
            rs = st.executeQuery();

          while (rs.next()){
              jl = new Jadwal_lab1();
              jl.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jl.setId_kelas(rs.getString("id_kelas"));
              jl.setId_hari(rs.getString("id_hari"));
              jl.setJam_mulai(rs.getString("jam_mulai"));
              jl.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jl;
        }catch (SQLException ex){
            Logger.getLogger(JadwalLabModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(JadwalLabModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(JadwalLabModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
    public Jadwal_lab2 getJadwal_2(User user, Hari hari) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Jadwal_lab2 jl = null;
        
        String sql = "select * from jadwal_lab where id_kelas=? && id_hari=? order by jam_mulai limit 1,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, user.getId_kelas());
            st.setString(2, hari.getId_hari());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              jl = new Jadwal_lab2();
              jl.setId_jadwal_lab(rs.getString("id_jadwal_lab"));
              jl.setId_kelas(rs.getString("id_kelas"));
              jl.setId_hari(rs.getString("id_hari"));
              jl.setJam_mulai(rs.getString("jam_mulai"));
              jl.setJam_selesai(rs.getString("jam_selesai"));
          }
          return jl;
        }catch (SQLException ex){
            Logger.getLogger(JadwalLabModel.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null, "koneksi gagal "+ex.getMessage());
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(JadwalLabModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(JadwalLabModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
