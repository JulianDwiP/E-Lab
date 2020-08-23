
package elab.tampilan;

import elab.config.Database;
import elab.entity.Billing;
import elab.entity.Guru;
import elab.entity.Hari;
import elab.entity.Jadwal_lab1;
import elab.entity.Jadwal_lab2;
import elab.entity.Jadwal_mapel1;
import elab.entity.Jadwal_mapel2;
import elab.entity.Jadwal_mapel3;
import elab.entity.Jumlah_mapel;
import elab.entity.Mapel1;
import elab.entity.User;
import elab.model.BillingModel;
import elab.model.GuruModel;
import elab.model.JadwalLabModel;
import elab.model.Jadwal_mapelModel;
import elab.model.Jumlah_mapelModel;
import elab.model.MapelModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class FormMain extends javax.swing.JFrame {
    private GuruModel guruModel = new GuruModel();
    Guru guru = new Guru();
    String id_kelas, id_hari;
    JadwalLabModel jadwalLabModel = new JadwalLabModel();
//    Jadwal_lab1 jadwal_lab =new Jadwal_lab1();
    Jadwal_lab1 jl1 = new Jadwal_lab1();
    
//    Jadwal_lab2 jadwal_lab1 = new Jadwal_lab2();
    Jadwal_lab2 jl2 = null;
    
    Jadwal_mapelModel jadwal_mapelModel = new Jadwal_mapelModel();
    Jadwal_mapel1 jmp1 = new Jadwal_mapel1();
    Jadwal_mapel2 jmp2 = new Jadwal_mapel2();
    Jadwal_mapel3 jmp3 = new Jadwal_mapel3();
    
    MapelModel mapelModel = new MapelModel();
    Mapel1 mapel = new Mapel1();
    
    Jumlah_mapelModel jumlah_mapelModel = new Jumlah_mapelModel();
    Jumlah_mapel jumlah_mapel= new Jumlah_mapel();
    
    User user = new User();
    Hari hari = new Hari();
    public FormMain() throws SQLException {
        initComponents();
        
        Timer timer = new Timer();
        TimerTask myTask = new TimerTask() {
        @Override
        public void run() {
            Date date = new Date();
            SimpleDateFormat cdt = new SimpleDateFormat("HH:mm:ss dd/MM/yyyy");
            txt_date.setText(cdt.format(date));
            }
        };
        timer.schedule(myTask, 1000, 1000);
        txt_date.setVisible(true);
        lblNama.setVisible(false);
        txt_nis.setVisible(false);
        txt_idkom.setVisible(false);
        txt_idKelas.setVisible(false);
        test_1.setVisible(false);
        txt_idHari.setVisible(false);
        txt_idLab.setVisible(false);
    }
    
    public void setNama(String nama){
        lblNama.setText(nama);
    }
    public void setIdLab(String id_lab){
        txt_idLab.setText(id_lab);
        
    }
    public void getJadwalMapel(String id_kelas, String id_hari){
        txt_idKelas.setText(id_kelas);
        txt_idHari.setText(id_hari);
        id_kelas = txt_idKelas.getText();
        id_hari = txt_idHari.getText();
        user.setId_kelas(id_kelas);
        hari.setId_hari(id_hari);
        getDatajadwal_mapel();
    }
    public void setNis(String nis){
        txt_nis.setText(nis);
    }
    public void setId_komputer(String id_komputer){
        txt_idkom.setText(id_komputer);
    }
    public void setHari(String hari){
        test_1.setText(hari);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        txt_date = new javax.swing.JLabel();
        txt_nis = new javax.swing.JLabel();
        txt_idkom = new javax.swing.JLabel();
        txt_jadwal2 = new javax.swing.JLabel();
        txt_jadwal3 = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        test_1 = new javax.swing.JLabel();
        txt_idHari = new javax.swing.JLabel();
        txt_idLab = new javax.swing.JLabel();
        txt_idKelas = new javax.swing.JLabel();
        txt_waktuAkhir2 = new javax.swing.JLabel();
        txt_waktuAwal2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_waktuAkhir3 = new javax.swing.JLabel();
        txt_waktuAwal3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        panel_jadwal1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_waktuAkhir1 = new javax.swing.JLabel();
        txt_jadwal1 = new javax.swing.JLabel();
        txt_waktuAwal1 = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Mata Pelajaran");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mata Pelajaran");

        lblNama.setText("nama");

        txt_date.setText("waktu");

        txt_nis.setText("nis");

        txt_idkom.setText("id_kom");

        txt_jadwal2.setText("jadwal2");

        txt_jadwal3.setText("jadwal3");

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        test_1.setText("test_hari");

        txt_idHari.setText("test_id_hari");

        txt_idLab.setText("jLabel3");

        txt_idKelas.setText("jLabel3");

        txt_waktuAkhir2.setText("08:30:00");

        txt_waktuAwal2.setText("07:00:00");

        jLabel4.setText("-");

        txt_waktuAkhir3.setText("08:30:00");

        txt_waktuAwal3.setText("07:00:00");

        jLabel5.setText("-");

        jLabel3.setText("-");

        txt_waktuAkhir1.setText("08:30:00");

        txt_jadwal1.setText("jadwal1");

        txt_waktuAwal1.setText("07:00:00");

        javax.swing.GroupLayout panel_jadwal1Layout = new javax.swing.GroupLayout(panel_jadwal1);
        panel_jadwal1.setLayout(panel_jadwal1Layout);
        panel_jadwal1Layout.setHorizontalGroup(
            panel_jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jadwal1Layout.createSequentialGroup()
                .addGroup(panel_jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_jadwal1Layout.createSequentialGroup()
                        .addComponent(txt_waktuAwal1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(txt_waktuAkhir1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txt_jadwal1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_jadwal1Layout.setVerticalGroup(
            panel_jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_jadwal1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txt_jadwal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_jadwal1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_waktuAwal1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txt_waktuAkhir1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btn_logout))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_idLab, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nis)
                                .addGap(18, 18, 18)
                                .addComponent(txt_idkom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(test_1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idHari, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                                .addComponent(lblNama))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_jadwal3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_waktuAwal2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_waktuAkhir2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_waktuAwal3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_waktuAkhir3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(panel_jadwal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txt_idKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)))
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_jadwal2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(txt_idKelas)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panel_jadwal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(txt_jadwal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_waktuAwal2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txt_waktuAkhir2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(txt_jadwal3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_waktuAwal3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(txt_waktuAkhir3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(txt_nis)
                    .addComponent(txt_idkom)
                    .addComponent(test_1)
                    .addComponent(txt_idHari)
                    .addComponent(txt_idLab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_logout)
                .addGap(290, 290, 290))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void getDatajadwal_mapel() {
        jl1 = jadwalLabModel.getJadwal_1(user, hari);
        jl2 = jadwalLabModel.getJadwal_2(user, hari);
        if (jl1 != null && jl2 != null) {
            get2Jmapel();
        }else if(jl1 != null && jl2 == null){
            getJmapel();
        }else{
            txt_jadwal1.setText("Kosong");
            txt_waktuAwal1.setText("--:--");
            txt_jadwal2.setText("Kosong");
            txt_waktuAwal2.setText("--:--");
            txt_jadwal3.setText("Kosong");
            txt_waktuAwal3.setText("--:--");
        }
    }
    private void get2Jmapel(){
        
        jumlah_mapel = jumlah_mapelModel.getMapel_row(jl1);
        if (jumlah_mapel.getHasil() != null) {
        
        jmp1 = jadwal_mapelModel.getJadwal_mapel1(jl1);
        if(jmp1 != null ){
            mapel = mapelModel.getMapel_1(jmp1);
            txt_jadwal1.setText(mapel.getNama_mapel());
            txt_waktuAwal1.setText(jmp1.getJam_mulai());
            txt_waktuAkhir1.setText(jmp1.getJam_selesai());
            
            jmp2 = jadwal_mapelModel.getJadwal_mapel2(jl1);
            if (jmp2 != null) {
                mapel = mapelModel.getMapel_2(jmp2);
                txt_jadwal2.setText(mapel.getNama_mapel());
                txt_waktuAwal2.setText(jmp2.getJam_mulai());
                txt_waktuAkhir2.setText(jmp2.getJam_selesai());
                
                jmp3 = jadwal_mapelModel.getJadwal_mapel3(jl1);
                if (jmp3 != null) {
                    mapel = mapelModel.getMapel_3(jmp3);
                    txt_jadwal3.setText(mapel.getNama_mapel());
                    txt_waktuAwal3.setText(jmp3.getJam_mulai());
                    txt_waktuAkhir3.setText(jmp3.getJam_selesai());
                }else{
                    jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                    if (jmp1 != null) {
                    mapel = mapelModel.getMapel_1(jmp1);
                    txt_jadwal3.setText(mapel.getNama_mapel());
                    txt_waktuAwal3.setText(jmp1.getJam_mulai());
                    txt_waktuAkhir3.setText(jmp1.getJam_selesai());
                    }else{
                        txt_jadwal3.setText("Kosong");
                        txt_waktuAwal3.setText("--:--");
                        txt_waktuAkhir3.setText("--:--");
                    }
                }
            }else{
                jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                if (jmp1 != null) {
                    mapel = mapelModel.getMapel_1(jmp1);
                    txt_jadwal2.setText(mapel.getNama_mapel());
                    txt_waktuAwal2.setText(jmp1.getJam_mulai());
                    txt_waktuAkhir2.setText(jmp1.getJam_selesai());

                    jmp2 = jadwal_mapelModel.getJadwal_mapel2_2(jl2);
                    if (jmp2 !=null) {
                        mapel = mapelModel.getMapel_2(jmp2);
                        txt_jadwal3.setText(mapel.getNama_mapel());
                        txt_waktuAwal3.setText(jmp2.getJam_mulai());
                        txt_waktuAkhir3.setText(jmp2.getJam_selesai());
                            }else{
                            txt_jadwal3.setText("Kosong");
                            txt_waktuAwal3.setText("--:--");
                            txt_waktuAkhir3.setText("--:--");
                           }
                    }else{
                    txt_jadwal2.setText("Kosong");
                    txt_waktuAwal2.setText("--:--");
                    txt_waktuAkhir2.setText("--:--");
                    txt_jadwal3.setText("Kosong");
                    txt_waktuAwal3.setText("--:--");
                    txt_waktuAkhir3.setText("--:--");
                }
            }
        }else{
            jumlah_mapel = jumlah_mapelModel.getMapel_row2(jl2);
            
            if (jumlah_mapel.getHasil().equals("3")) {
                jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                mapel = mapelModel.getMapel_1(jmp1);
                txt_jadwal1.setText(mapel.getNama_mapel());
                txt_waktuAwal1.setText(jmp1.getJam_mulai());
                txt_waktuAkhir1.setText(jmp1.getJam_selesai());

                jmp2 = jadwal_mapelModel.getJadwal_mapel2_2(jl2);
                mapel = mapelModel.getMapel_2(jmp2);
                txt_jadwal2.setText(mapel.getNama_mapel());
                txt_waktuAwal2.setText(jmp2.getJam_mulai());
                txt_waktuAkhir2.setText(jmp2.getJam_selesai());

                jmp3 = jadwal_mapelModel.getJadwal_mapel2_3(jl2);
                mapel = mapelModel.getMapel_3(jmp3);
                txt_jadwal3.setText(mapel.getNama_mapel());
                txt_waktuAwal3.setText(jmp3.getJam_mulai());
                txt_waktuAkhir3.setText(jmp3.getJam_selesai());
            }else if(jumlah_mapel.getHasil().equals("2")){
                jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                mapel = mapelModel.getMapel_1(jmp1);
                txt_jadwal1.setText(mapel.getNama_mapel());
                txt_waktuAwal1.setText(jmp1.getJam_mulai());
                txt_waktuAkhir1.setText(jmp1.getJam_selesai());

                jmp2 = jadwal_mapelModel.getJadwal_mapel2_2(jl2);
                mapel = mapelModel.getMapel_2(jmp2);
                txt_jadwal2.setText(mapel.getNama_mapel());
                txt_waktuAwal2.setText(jmp2.getJam_mulai());
                txt_waktuAkhir2.setText(jmp2.getJam_selesai());
                
                txt_jadwal3.setText("Kosong");
                txt_waktuAwal3.setText("--:--");
                txt_waktuAkhir3.setText("--:--");
            }else if(jumlah_mapel.getHasil().equals("1")){
                jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                mapel = mapelModel.getMapel_1(jmp1);
                txt_jadwal1.setText(mapel.getNama_mapel());
                txt_waktuAwal1.setText(jmp1.getJam_mulai());
                txt_waktuAkhir1.setText(jmp1.getJam_selesai());
                
                txt_jadwal2.setText("Kosong");
                txt_waktuAwal2.setText("--:--");
                txt_waktuAkhir2.setText("--:--");
                txt_jadwal3.setText("Kosong");
                txt_waktuAwal3.setText("--:--");
                txt_waktuAkhir3.setText("--:--");
            }else{
                txt_jadwal1.setText("Kosong");
                txt_waktuAwal1.setText("--:--");
                txt_waktuAkhir1.setText("--:--");
                txt_jadwal2.setText("Kosong");
                txt_waktuAwal2.setText("--:--");
                txt_waktuAkhir2.setText("--:--");
                txt_jadwal3.setText("Kosong");
                txt_waktuAwal3.setText("--:--");
                txt_waktuAkhir3.setText("--:--");
            }
            
        }
        
        }else{
            txt_jadwal1.setText("Kosong");
            txt_waktuAwal1.setText("--:--");
            txt_waktuAkhir1.setText("--:--");
            txt_jadwal2.setText("Kosong");
            txt_waktuAwal2.setText("--:--");
            txt_waktuAkhir2.setText("--:--");
            txt_jadwal3.setText("Kosong");
            txt_waktuAwal3.setText("--:--");
            txt_waktuAkhir3.setText("--:--");
        }
    }
    private void getJmapel(){
        jumlah_mapel = jumlah_mapelModel.getMapel_row(jl1);
        if (jumlah_mapel.getHasil().equals("3")) {
        
        //jadwal jam pertama
        jmp1 = jadwal_mapelModel.getJadwal_mapel1(jl1);
        mapel = mapelModel.getMapel_1(jmp1);
        txt_jadwal1.setText(mapel.getNama_mapel());
        txt_waktuAwal1.setText(jmp1.getJam_mulai());
        txt_waktuAkhir1.setText(jmp1.getJam_selesai());
        
        //jadwal jam kedua
        jmp2 = jadwal_mapelModel.getJadwal_mapel2(jl1);
        mapel = mapelModel.getMapel_2(jmp2);
        txt_jadwal2.setText(mapel.getNama_mapel());
        txt_waktuAwal2.setText(jmp2.getJam_mulai());
        txt_waktuAkhir2.setText(jmp2.getJam_selesai());
        
        //jadwal jam ketiga
        jmp3 = jadwal_mapelModel.getJadwal_mapel3(jl1);
        mapel = mapelModel.getMapel_3(jmp3);
        txt_jadwal3.setText(mapel.getNama_mapel());
        txt_waktuAwal3.setText(jmp3.getJam_mulai());
        txt_waktuAkhir3.setText(jmp3.getJam_selesai());
        
        }else if(jumlah_mapel.getHasil().equals("2")){
        //jadwal jam pertama
            
        jmp1 = jadwal_mapelModel.getJadwal_mapel1(jl1);
        mapel = mapelModel.getMapel_1(jmp1);
        txt_jadwal1.setText(mapel.getNama_mapel());
        txt_waktuAwal1.setText(jmp1.getJam_mulai());
        txt_waktuAkhir1.setText(jmp1.getJam_selesai());
        
        //jadwal jam kedua
        jmp2 = jadwal_mapelModel.getJadwal_mapel2(jl1);
        mapel = mapelModel.getMapel_2(jmp2);
        txt_jadwal2.setText(mapel.getNama_mapel());
        txt_waktuAwal2.setText(jmp2.getJam_mulai());
        txt_waktuAkhir2.setText(jmp2.getJam_selesai());
        
        txt_jadwal3.setText("Kosong");
        txt_waktuAwal3.setText("--:--");
        
        }else if(jumlah_mapel.getHasil().equals("1")){
        //jadwal jam pertama
        jmp1 = jadwal_mapelModel.getJadwal_mapel1(jl1);
        mapel = mapelModel.getMapel_1(jmp1);
        txt_jadwal1.setText(mapel.getNama_mapel());
        txt_waktuAwal1.setText(jmp1.getJam_mulai());
        txt_waktuAkhir1.setText(jmp1.getJam_selesai());
        
        txt_jadwal2.setText("Kosong");
        txt_waktuAwal2.setText("--:--");
        txt_jadwal3.setText("Kosong");
        txt_waktuAwal3.setText("--:--");
        }else if(jumlah_mapel.getHasil().equals("0")){
            
            txt_jadwal1.setText("Kosong");
            txt_waktuAwal1.setText("--:--");
            txt_jadwal2.setText("Kosong");
            txt_waktuAwal2.setText("--:--");
            txt_jadwal3.setText("Kosong");
            txt_waktuAwal3.setText("--:--");
        }
        
    }
    
    public static void main(String args[]) {
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
                try {
                    new FormMain().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(FormMain.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_logout;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblNama;
    private javax.swing.JPanel panel_jadwal1;
    private javax.swing.JLabel test_1;
    private javax.swing.JLabel txt_date;
    private javax.swing.JLabel txt_idHari;
    private javax.swing.JLabel txt_idKelas;
    private javax.swing.JLabel txt_idLab;
    private javax.swing.JLabel txt_idkom;
    private javax.swing.JLabel txt_jadwal1;
    private javax.swing.JLabel txt_jadwal2;
    private javax.swing.JLabel txt_jadwal3;
    private javax.swing.JLabel txt_nis;
    private javax.swing.JLabel txt_waktuAkhir1;
    private javax.swing.JLabel txt_waktuAkhir2;
    private javax.swing.JLabel txt_waktuAkhir3;
    private javax.swing.JLabel txt_waktuAwal1;
    private javax.swing.JLabel txt_waktuAwal2;
    private javax.swing.JLabel txt_waktuAwal3;
    // End of variables declaration//GEN-END:variables

    

    
}
