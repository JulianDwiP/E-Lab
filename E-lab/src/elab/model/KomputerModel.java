/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.Guru;
import elab.entity.Komputer;
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
public class KomputerModel {
    private Connection connection;

    public KomputerModel(){
        connection = Database.getConnection();
    } 
    public Komputer getKomputer(User user) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Komputer k = null;
        
        String sql = "select * from komputer where id_komputer =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, user.getId_kom());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              k = new Komputer();
              k.setId_komputer(rs.getString("id_komputer"));
              k.setNama_komputer(rs.getString("nama_komputer"));
              k.setSpesifikasi(rs.getString("spesifikasi"));
              k.setId_lab(rs.getString("id_lab"));
              k.setIp_address(rs.getString("ip_address"));
          }
          return k;
        }catch (SQLException ex){
            Logger.getLogger(KomputerModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(KomputerModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(KomputerModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
