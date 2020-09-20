/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.tampilan;
import elab.config.Database;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LABKOM01-RPL12
 */
public class FrmBilling extends javax.swing.JFrame {

    public Connection conn;
    
    private void tgl(){
        Date ys = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
        tableby();
    }
    /**
     * Creates new form FrmBilling
     */
   
    public FrmBilling() {
        initComponents();
        tgl();
       
        load_table();
    }
    private void tableby(){
        DefaultTableModel model = new DefaultTableModel();
            
        model.addColumn("No");
        model.addColumn("Id Billing");
        model.addColumn("Nama Komputer");
        model.addColumn("Nis");
        model.addColumn("Date TIme");
        model.addColumn("Id Guru");
        
        try{
            int no=1;
            String sql = "select billing.id_billing, "
                    + "komputer.nama_komputer, "
                    + "billing.nis, "
                    + "billing.date_time, "
                    + "billing.id_guru "
                    + "from billing join komputer on komputer.id_komputer = billing.id_komputer ";
            conn=Database.getConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                 model.addRow(new Object[]{no++,res.getString(1),res.getString(2),
                                               res.getString(3),res.getString(4),
                                               res.getString(5)});
            }
            tbl.setModel(model);
        }catch(SQLException e){
             
        }
    }
    private void tampilby(){
        Date ys = new Date();
        //txtby.setText("17");
        //tableby();
        DefaultTableModel model = new DefaultTableModel();
        SimpleDateFormat simpledate = new SimpleDateFormat("YYYY-MM-dd", Locale.getDefault());
        String from1 = ((JTextField)datedari.getDateEditor().getUiComponent()).getText(); 
        String to1 = ((JTextField)datesampai.getDateEditor().getUiComponent()).getText(); 
        String froms = from1;
        String tos = to1;
        java.util.Date tglfrom1 = new Date(froms);
        java.util.Date tglto1 = new Date(tos);
        String from = String.valueOf(simpledate.format(tglfrom1));
        String to = String.valueOf(simpledate.format(tglto1));
        
        model.addColumn("No");
        model.addColumn("Id Billing");
        model.addColumn("Nama Komputer");
        model.addColumn("Nis");
        model.addColumn("Date TIme");
        model.addColumn("Id Guru");
        
        try{
            int no=1;
            String sql = "select billing.id_billing, "
                    + "komputer.nama_komputer, "
                    + "billing.nis, "
                    + "billing.date_time, "
                    + "billing.id_guru "
                    + "from billing join komputer on komputer.id_komputer = billing.id_komputer WHERE ( (LEFT(billing.date_time,10)) >= '"+from+"' AND (LEFT(billing.date_time,10)) <= '"+to+"' )";
            conn=Database.getConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                 model.addRow(new Object[]{no++,res.getString(1),res.getString(2),
                                               res.getString(3),res.getString(4),
                                               res.getString(5)});
            }
            tbl.setModel(model);
        }catch(SQLException e){
             
        }
       
    }
    

    private void load_table(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No");
        model.addColumn("Id Billing");
        model.addColumn("Nama Komputer");
        model.addColumn("Nis");
        model.addColumn("Date TIme");
        model.addColumn("Id Guru");
        
        try{
            int no=1;
            String sql = "select billing.id_billing, "
                    + "komputer.nama_komputer, "
                    + "billing.nis, "
                    + "billing.date_time, "
                    + "billing.id_guru "
                    + "from billing join komputer on komputer.id_komputer = billing.id_komputer";
            conn=Database.getConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                 model.addRow(new Object[]{no++,res.getString(1),res.getString(2),
                                               res.getString(3),res.getString(4),
                                               res.getString(5)});
            }
            tbl.setModel(model);
        }catch(SQLException e){
            
        }
    }
    private void cari(){
        SimpleDateFormat simpledate = new SimpleDateFormat("YYYY-MM-dd", Locale.getDefault());
        String from1 = ((JTextField)datedari.getDateEditor().getUiComponent()).getText(); 
        String to1 = ((JTextField)datesampai.getDateEditor().getUiComponent()).getText(); 
        String froms = from1;
        String tos = to1;
        java.util.Date tglfrom1 = new Date(froms);
        java.util.Date tglto1 = new Date(tos);
        String from = String.valueOf(simpledate.format(tglfrom1));
        String to = String.valueOf(simpledate.format(tglto1));
        DefaultTableModel model = new DefaultTableModel();
        
        model.addColumn("No");
        model.addColumn("Id Billing");
        model.addColumn("Nama Komputer");
        model.addColumn("Nis");
        model.addColumn("Date TIme");
        model.addColumn("Id Guru");
        
        try{
            int no=1;
            String sql = "select billing.id_billing, "
                    + "komputer.nama_komputer, "
                    + "billing.nis, "
                    + "billing.date_time, "
                    + "billing.id_guru "
                    + "from billing join komputer on komputer.id_komputer = billing.id_komputer where (komputer.nama_komputer like '"+txtcari.getText()+"%' OR billing.date_time like '"+txtcari.getText()+"%')";
            conn=Database.getConnection();
            java.sql.Statement stm=conn.createStatement();
            java.sql.ResultSet res=stm.executeQuery(sql);
            while(res.next()){
                 model.addRow(new Object[]{no++,res.getString(1),res.getString(2),
                                               res.getString(3),res.getString(4),
                                               res.getString(5)});
            }
            tbl.setModel(model);
        }catch(SQLException e){
            
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tbl = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        txtcari = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        datedari = new com.toedter.calendar.JDateChooser();
        datesampai = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbl);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("History");

        txtcari.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcariKeyReleased(evt);
            }
        });

        jLabel2.setText("Cari");

        jLabel3.setText("Dari :");

        jLabel4.setText("Sampai :");

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(datedari, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(datesampai, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtcari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(jButton1))
                    .addComponent(datedari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datesampai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcariKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcariKeyReleased
        // TODO add your handling code here:
        cari();
    }//GEN-LAST:event_txtcariKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tampilby();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(FrmBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBilling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBilling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser datedari;
    private com.toedter.calendar.JDateChooser datesampai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl;
    private javax.swing.JTextField txtcari;
    // End of variables declaration//GEN-END:variables
}
