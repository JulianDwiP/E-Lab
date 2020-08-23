/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.Hari;
import elab.entity.Komputer;
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
public class HariModel {
    private Connection connection;

    public HariModel(){
        connection = Database.getConnection();
    } 
    public Hari getHari(Hari hari, Komputer komputer) {
        PreparedStatement st = null;
        ResultSet rs = null;
        Hari h = null;
        
        String sql = "select * from hari where hari =? && id_lab=?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, hari.getHari());
            st.setString(2, komputer.getId_lab());
            rs = st.executeQuery();
            
            
          while (rs.next()){
              h = new Hari();
              h.setHari(rs.getString("hari"));
              h.setId_hari(rs.getString("id_hari"));
              h.setId_lab(rs.getString("id_lab"));
          }
          return h;
        }catch (SQLException ex){
            Logger.getLogger(HariModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(HariModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(HariModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
