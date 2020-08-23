/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import elab.config.Database;
import elab.entity.Billing;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Julian Dwi Putra
 */
public class BillingModel {
    private Connection connection;

    public BillingModel(){
        connection = Database.getConnection();
    } 
    public void insertBilling(Billing billing){
        PreparedStatement st = null;
        String sql = "insert into billing(id_komputer,nis,date_time,id_mapel,id_guru,created_at,updated_at,deleted_at) values(?,?,?,?,?,?,?,?)";
        try{
            st = connection.prepareStatement(sql);
            
            st.setString(1, billing.getId_komputer());
            st.setString(2, billing.getNis());
            st.setTimestamp(3, billing.getDate_time());
            st.setString(4, billing.getId_mapel());
            st.setString(5, billing.getId_guru());
            st.setTimestamp(6, billing.getDate_time());
            st.setTimestamp(7, billing.getDate_time());
            java.util.Date date=new java.util.Date();
            java.sql.Date sqlDate=new java.sql.Date(0000-00-00);
            st.setDate(8, sqlDate );
            st.executeUpdate();
        }catch(SQLException ex){
            Logger.getLogger(BillingModel.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch(SQLException ex){
                    Logger.getLogger(BillingModel.class.getName()).log(Level.SEVERE, null,ex);
                }
            }
        }
    }
}
