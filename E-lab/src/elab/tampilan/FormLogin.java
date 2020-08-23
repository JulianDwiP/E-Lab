/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.tampilan;

import elab.entity.Hari;
import elab.entity.Jadwal_lab1;
import elab.entity.Jadwal_lab2;
import elab.entity.Komputer;
import elab.entity.User;
import elab.model.HariModel;
import elab.model.JadwalLabModel;
import elab.model.KomputerModel;
import elab.model.UserModel;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingWorker;


    /**
     * Creates new form FormUser
     */
    public class FormLogin extends javax.swing.JFrame {

    public static String id_kelas, id_hari;
    private UserModel userm = new UserModel();
    private String ipAddress, hari;
    User userg = new User();
    User r = null;
    
    Hari h = new Hari();
    HariModel hm = new HariModel();
    Hari hh = null;
    
    private  KomputerModel komputerModel = new KomputerModel();
    Komputer komputer = new Komputer();

    public FormLogin() {
        initComponents();
        
        ProgressBar.setVisible(false);
        lblwait.setVisible(false);
    }
    
class TampilWorker extends SwingWorker{
        @Override
        protected Object doInBackground() throws Exception{
            for (int i = 0; i<=100; i++){
                try{
                    Thread.sleep(20);
                    ProgressBar.setVisible(true);
                    lblwait.setVisible(true);
                    ProgressBar.setValue(i);
                    ProgressBar.setIndeterminate(true);
                } catch (Exception e){
                }
            }
               return null; 
        }
        
        @Override
        protected void done(){
        
        
        if (userm.getLogin(userg)== true){
        r = userm.getLoginData(userg);
        id_kelas = r.getId_kelas();
        
        try {
            ipAddress = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException ex) {
            Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        komputer = komputerModel.getKomputer(r);
            try {
                YesDone();
            } catch (SQLException ex) {
                Logger.getLogger(FormLogin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            ProgressBar.setVisible(false);
            lblwait.setVisible(false);
            
            JOptionPane.showMessageDialog(null, "Login Gagal");
        }
        }

        private void YesDone() throws SQLException {
        FormMain fm = new FormMain();
        if(ipAddress.equals(komputer.getIp_address())){
            dispose();
        getid_hari();
        fm.setNama(r.getNama());
        fm.setNis(r.getNis());
        fm.setId_komputer(r.getId_kom());
        fm.setIdLab(hh.getId_lab());
        fm.setHari(hh.getHari());
        fm.getJadwalMapel(r.getId_kelas(), hh.getId_hari());
        
        JOptionPane.showMessageDialog(null, "Berhasil");
       
        fm.setVisible(true);
        
        }else{
            JOptionPane.showMessageDialog(null, "Ini Bukan Komputer Anda");
        }
        
        }

        private void getid_hari() {
            Date date = new Date();
            if (date.toString().contains("Sun")) {
                hari = "Minggu";
                h.setHari(hari);
                hh = hm.getHari(h, komputer);
                id_hari = hh.getId_hari();
            }else if(date.toString().contains("Mon")){
                hari = "Senin";
                h.setHari(hari);
                hh = hm.getHari(h, komputer);
                id_hari = hh.getId_hari();
            }else if(date.toString().contains("Tue")){
                hari = "Selasa";
                h.setHari(hari);
                hh = hm.getHari(h, komputer);
                id_hari = hh.getId_hari();
            }else if(date.toString().contains("Wed")){
                hari = "Rabu";
                h.setHari(hari);
                hh = hm.getHari(h, komputer);
                id_hari = hh.getId_hari();
            }else if(date.toString().contains("Thu")){
                hari = "Kamis";
                h.setHari(hari);
                hh = hm.getHari(h, komputer);
                id_hari = hh.getId_hari();
            }else if(date.toString().contains("Fri")){
                hari = "Jumat";
                h.setHari(hari);
                hh = hm.getHari(h, komputer);
                id_hari = hh.getId_hari();
            }else if(date.toString().contains("Sat")){
                hari = "Sabtu";
                h.setHari(hari);
                hh = hm.getHari(h, komputer);
                id_hari = hh.getId_hari();
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        ProgressBar = new javax.swing.JProgressBar();
        lblwait = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Username");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Password");

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblwait.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblwait.setText("Tunggu...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblwait, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(password))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(lblwait)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

//    public String IpAddress() throws UnknownHostException{
//        ipAddress = InetAddress.getLocalHost().getHostAddress();
//        return ipAddress;
//    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String username = jTextField1.getText();
        String password = this.password.getText();
        
        userg.setUsername(username);
        userg.setPassword(password);
        
        
        TampilWorker tw = new TampilWorker();
        
        tw.done();
    }//GEN-LAST:event_jButton1ActionPerformed
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar ProgressBar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lblwait;
    private javax.swing.JPasswordField password;
    // End of variables declaration//GEN-END:variables
}
