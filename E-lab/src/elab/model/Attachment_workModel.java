/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import com.mysql.jdbc.PreparedStatement;
import elab.config.Database;
import elab.entity.attachment_work;
import elab.entity.Hari;
import elab.entity.Komputer;
import elab.tampilan.TampilanTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Julian Dwi Putra
 */
public class Attachment_workModel {
     private Connection connection;
     String nama_file;
     public Attachment_workModel(){
        connection = Database.getConnection();
    }
     
    public void UploadWork(String id_work){
        JFileChooser chooser = new JFileChooser();
    
        FileNameExtensionFilter jpg = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg");
        FileNameExtensionFilter docx = new FileNameExtensionFilter("MS Word File(.docx)", "docx");
        chooser.setFileFilter(jpg);
        chooser.setFileFilter(docx);
        int returnVal = chooser.showOpenDialog(null);
        File file = null;
        if(returnVal == JFileChooser.APPROVE_OPTION) {
             file = chooser.getSelectedFile();
             nama_file = file.getName();
             PreparedStatement st = null;
             String path = file.getAbsolutePath();

            try {
                String sql = "INSERT INTO attachment_work (id_work, attachment, created_at,updated_at, deleted_at, nama_file,path_file) values (?, ?, ?,?,?,?,?)";
                st = (PreparedStatement) connection.prepareStatement(sql);

                // max limit 1MB
                // ubah di C:/xampp/mysql/my.ini
                //set max_allowed_packet = 300mb (ini max sekarang)

                st.setString(1, id_work);
                InputStream inputStream = new FileInputStream(file);
                st.setBlob(2, inputStream);
                java.util.Date date=new java.util.Date();
                java.sql.Date sqlDate=new java.sql.Date(date.getTime());
                st.setDate(3, sqlDate);
                st.setDate(4, sqlDate);
                st.setDate(5, sqlDate);
                st.setString(6, nama_file);
                st.setString(7, path);


                int row = st.executeUpdate();
                if (row > 0) {
                    
                }

            } catch (SQLException ex) {
                ex.printStackTrace();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }else{
             file = null;
             nama_file = "";
             JOptionPane.showMessageDialog(null, "Pilih file");
        }
        
    }
    
    public attachment_work getAttachment_work1(String id_work) {
        java.sql.PreparedStatement st = null;
        ResultSet rs = null;
        attachment_work aw = null;
        
        String sql = "select * from attachment_work where id_work=? Limit 0,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_work);
            rs = st.executeQuery();
          while (rs.next()){
              aw = new attachment_work();
              aw.setAttachment(rs.getBlob("attachment"));
              aw.setNama_file(rs.getString("nama_file"));
              aw.setId_attachment_work(rs.getString("id_attachment_work"));
              aw.setId_work(rs.getString("id_work"));
              aw.setPath_file(rs.getString("path_file"));
              
              
              TampilanTask task = new TampilanTask();
              task.setBtnUpload1(rs.getString("nama_file"));
          }
          return aw;
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
    
    public attachment_work getAttachment_work2(String id_work) {
        java.sql.PreparedStatement st = null;
        ResultSet rs = null;
        attachment_work aw = null;
        
        String sql = "select * from attachment_work where id_work=? Limit 1,1";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_work);
            rs = st.executeQuery();
          while (rs.next()){
              aw = new attachment_work();
              aw.setAttachment(rs.getBlob("attachment"));
              aw.setNama_file(rs.getString("nama_file"));
              aw.setId_attachment_work(rs.getString("id_attachment_work"));
              aw.setId_work(rs.getString("id_work"));
              aw.setPath_file(rs.getString("path_file"));
              
              TampilanTask ts = new TampilanTask();
              ts.setBtnUpload2(rs.getString("nama_file"));
          }
          return aw;
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
    
    public void delete_work(String nama_file){
        java.sql.PreparedStatement st = null;
        
        
        String sql = "delete from attachment_work where nama_file=?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, nama_file);
            st.executeUpdate();
        }catch (SQLException ex){
            Logger.getLogger(HariModel.class.getName()).log(Level.SEVERE,null,ex);
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(HariModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }                       
        }
    }
}
