/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.model;

import elab.config.Database;
import elab.entity.JumlahFileTugas;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
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
public class Attachment_tugasModel {
    private Connection connection;
    public Attachment_tugasModel(){
        connection = Database.getConnection();
    }
    
    public void downloadFile_1(String id_tugas){
    
    PreparedStatement smt = null;
    InputStream input = null;
    FileOutputStream output = null;
    ResultSet rs = null;
    String filename = "";
    String SQL = "SELECT attachment,nama_file FROM attachment_tugas WHERE id_tugas=? limit 0,1"; //Here I mistakenly wrote 'FILANAME' here instead of a 'PICTURE'
    try {
        smt = connection.prepareStatement(SQL);
        smt.setString(1, id_tugas);  //in this row we have a png picture
        rs = smt.executeQuery();

        while (rs.next()) {
            java.sql.Blob blob = rs.getBlob("attachment");
            input = blob.getBinaryStream(); //get it from col name
            filename = rs.getString("nama_file");
            output = new FileOutputStream(new File("/Users/ASUS/Downloads/"+filename));
            
            int r = 0;

/*
*there I've tried with array but nothing changed..Like this :
* byte[] buffer = new byte[2048];
* int r = 0;
* while((r = input.read(buffer)) != -1){
*        out.write(buffer,0,r);}
*/

            while ((r = input.read()) != -1) {
                output.write(r);

            }
        }
        
        File file = new File("/Users/ASUS/Downloads/"+filename);
        if(!Desktop.isDesktopSupported()){
            System.out.println("Desktop is not supported");
            return;
        }
        Desktop desktop = Desktop.getDesktop();
        if(file.exists()) desktop.open(file);
        JOptionPane.showMessageDialog(null, "File tersimpan di Downloads");

    } catch (SQLException e) {
        System.err.println("Connection failed!");   
        e.printStackTrace();
    } catch (FileNotFoundException e) {
        System.err.println("File not found!");
        e.printStackTrace();
    } catch (IOException e) {
        System.err.println("File writing error..!");
        e.printStackTrace();
    }finally {
        if(rs != null){
//                input.close();
//                output.flush();
//                output.close();
//                smt.close();
//                connection.close();

            }
        }
    }
    public void downloadFile_2(String id_tugas){
    
    PreparedStatement smt = null;
    InputStream input = null;
    FileOutputStream output = null;
    ResultSet rs = null;
    String SQL = "SELECT attachment,nama_file FROM attachment_tugas WHERE id_tugas=? limit 1,1"; //Here I mistakenly wrote 'FILANAME' here instead of a 'PICTURE'
    try {
        smt = connection.prepareStatement(SQL);
        smt.setString(1, id_tugas);  //in this row we have a png picture
        rs = smt.executeQuery();

        while (rs.next()) {
            java.sql.Blob blob = rs.getBlob("attachment");
            input = blob.getBinaryStream(); //get it from col name
            String filename = rs.getString("nama_file");
            output = new FileOutputStream(new File("/Users/ASUS/Downloads/"+filename));
            
            int r = 0;

/*
*there I've tried with array but nothing changed..Like this :
* byte[] buffer = new byte[2048];
* int r = 0;
* while((r = input.read(buffer)) != -1){
*        out.write(buffer,0,r);}
*/

            while ((r = input.read()) != -1) {
                output.write(r);

            }
        }
        
        JOptionPane.showMessageDialog(null, "File tersimpan di Downloads");

    } catch (SQLException e) {
        System.err.println("Connection failed!");   
        e.printStackTrace();
    } catch (FileNotFoundException e) {
        System.err.println("File not found!");
        e.printStackTrace();
    } catch (IOException e) {
        System.err.println("File writing error..!");
        e.printStackTrace();
    }finally {
        if(rs != null){
//                input.close();
//                output.flush();
//                output.close();
//                smt.close();
//                connection.close();

            }
        }
    }
    
    public JumlahFileTugas getDownload_row(String id_tugas) {
        PreparedStatement st = null;
        ResultSet rs = null;
        JumlahFileTugas jft = null;
        
        String sql = "select count(id_attachment) as hasil from attachment_tugas where id_tugas =?";
        try {
            st = connection.prepareStatement(sql);
            st.setString(1, id_tugas);
            rs = st.executeQuery();
          while (rs.next()){
              jft = new JumlahFileTugas();
              jft.setHasil(rs.getString("hasil"));
          }
          return jft;
        }catch (SQLException ex){
            Logger.getLogger(Attachment_tugasModel.class.getName()).log(Level.SEVERE,null,ex);
            return null;
        }finally{
            if(st!=null){
                try{
                    st.close();
                }catch (SQLException ex){
                    Logger.getLogger(Attachment_tugasModel.class.getName()).log(Level.SEVERE,null,ex);
                }
            }
            if (rs!=null){
                try{    
                     rs.close();
                }catch (SQLException ex){
                    Logger.getLogger(Attachment_tugasModel.class.getName()).log(Level.SEVERE,null,ex);
                }
                }                          
            }
        }
}
