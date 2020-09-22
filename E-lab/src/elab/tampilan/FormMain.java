
package elab.tampilan;

import elab.entity.Billing;
import elab.entity.Guru;
import elab.entity.Hari;
import elab.entity.Jadwal_lab1;
import elab.entity.Jadwal_lab2;
import elab.entity.Jadwal_mapel1;
import elab.entity.Jadwal_mapel2;
import elab.entity.Jadwal_mapel3;
import elab.entity.Jadwal_mapel4;
import elab.entity.Jumlah_mapel;
import elab.entity.Mapel1;
import elab.entity.Nama_guru1;
import elab.entity.User;
import elab.model.BillingModel;
import elab.model.GuruModel;
import elab.model.JadwalLabModel;
import elab.model.Jadwal_mapelModel;
import elab.model.Jumlah_mapelModel;
import elab.model.MapelModel;
import elab.model.NamaGuruModel;
import java.awt.AWTException;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;


public class FormMain extends javax.swing.JFrame {
    private GuruModel guruModel = new GuruModel();
    Guru guru = new Guru();
    String id_kelas, id_hari, jam_keluar, id_jadwal_mapel;
    JadwalLabModel jadwalLabModel = new JadwalLabModel();
    Jadwal_lab1 jl1 = new Jadwal_lab1();
    Jadwal_lab2 jl2 = null;
    
    Jadwal_mapelModel jadwal_mapelModel = new Jadwal_mapelModel();
    Jadwal_mapel1 jmp1 = new Jadwal_mapel1();
    Jadwal_mapel2 jmp2 = new Jadwal_mapel2();
    Jadwal_mapel3 jmp3 = new Jadwal_mapel3();
    Jadwal_mapel4 jmp4 = new Jadwal_mapel4();
    
    MapelModel mapelModel = new MapelModel();
    Mapel1 mapel = new Mapel1();
    
    NamaGuruModel namaGuru = new NamaGuruModel();
    Nama_guru1 nagu = new Nama_guru1();
    
    Jumlah_mapelModel jumlah_mapelModel = new Jumlah_mapelModel();
    Jumlah_mapel jumlah_mapel= new Jumlah_mapel();
    
    User user = new User();
    Hari hari = new Hari();
    
    Billing billing = new Billing();
    BillingModel billingModel = new BillingModel();
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
        txt_jamKeluar.setVisible(false);
        txt_idGuru.setVisible(false);
        
        
//        this.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
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
    public void setJam_masuk(String jam){
        txt_jamKeluar.setText(jam);
        jam_keluar = txt_jamKeluar.getText();
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
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_waktuAwal1 = new javax.swing.JLabel();
        txt_waktuAkhir1 = new javax.swing.JLabel();
        txt_jadwal1 = new javax.swing.JLabel();
        btn_task1 = new javax.swing.JButton();
        guru1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        txt_waktuAwal2 = new javax.swing.JLabel();
        txt_jadwal2 = new javax.swing.JLabel();
        txt_waktuAkhir2 = new javax.swing.JLabel();
        btn_task2 = new javax.swing.JButton();
        guru2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txt_waktuAwal3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_waktuAkhir3 = new javax.swing.JLabel();
        txt_jadwal3 = new javax.swing.JLabel();
        btn_task3 = new javax.swing.JButton();
        guru3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_date = new javax.swing.JLabel();
        txt_idKelas = new javax.swing.JLabel();
        txt_idGuru = new javax.swing.JLabel();
        txt_jamKeluar = new javax.swing.JLabel();
        txt_idHari = new javax.swing.JLabel();
        test_1 = new javax.swing.JLabel();
        txt_idkom = new javax.swing.JLabel();
        txt_nis = new javax.swing.JLabel();
        txt_idLab = new javax.swing.JLabel();
        lblNama = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_history = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        txt_waktuAwal4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_waktuAkhir4 = new javax.swing.JLabel();
        txt_jadwal4 = new javax.swing.JLabel();
        btn_task4 = new javax.swing.JButton();
        guru4 = new javax.swing.JLabel();

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

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("-");

        txt_waktuAwal1.setText("07:00:00");

        txt_waktuAkhir1.setText("08:30:00");

        txt_jadwal1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_jadwal1.setText("jadwal1");

        btn_task1.setText("Click Task");
        btn_task1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_task1ActionPerformed(evt);
            }
        });

        guru1.setText("guru1");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_jadwal1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txt_waktuAwal1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_waktuAkhir1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(guru1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_task1)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_waktuAwal1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(txt_waktuAkhir1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jadwal1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guru1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(btn_task1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setText("-");

        txt_waktuAwal2.setText("07:00:00");

        txt_jadwal2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_jadwal2.setText("jadwal2");

        txt_waktuAkhir2.setText("08:30:00");

        btn_task2.setText("Click Task");
        btn_task2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_task2ActionPerformed(evt);
            }
        });

        guru2.setText("guru2");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_waktuAwal2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_waktuAkhir2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(txt_jadwal2, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(guru2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                .addComponent(btn_task2)
                .addGap(42, 42, 42))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_waktuAwal2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txt_waktuAkhir2, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jadwal2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guru2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(btn_task2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        txt_waktuAwal3.setText("07:00:00");

        jLabel5.setText("-");

        txt_waktuAkhir3.setText("08:30:00");

        txt_jadwal3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_jadwal3.setText("jadwal3");

        btn_task3.setText("Click Task");
        btn_task3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_task3ActionPerformed(evt);
            }
        });

        guru3.setText("guru3");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_jadwal3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txt_waktuAwal3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_waktuAkhir3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guru3, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_task3)
                .addGap(42, 42, 42))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_waktuAwal3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)
                            .addComponent(txt_waktuAkhir3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jadwal3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guru3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn_task3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Mata Pelajaran");

        txt_date.setText("waktu");

        txt_idKelas.setText("jLabel3");

        txt_idGuru.setText("jLabel6");

        txt_jamKeluar.setText("jLabel6");

        txt_idHari.setText("test_id_hari");

        test_1.setText("test_hari");

        txt_idkom.setText("id_kom");

        txt_nis.setText("nis");

        txt_idLab.setText("jLabel3");

        lblNama.setText("nama");

        btn_logout.setText("Logout");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        btn_history.setText("History");
        btn_history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_historyActionPerformed(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        txt_waktuAwal4.setText("07:00:00");

        jLabel6.setText("-");

        txt_waktuAkhir4.setText("08:30:00");

        txt_jadwal4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txt_jadwal4.setText("jadwal4");

        btn_task4.setText("Click Task");
        btn_task4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_task4ActionPerformed(evt);
            }
        });

        guru4.setText("guru4");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_jadwal4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(txt_waktuAwal4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_waktuAkhir4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(guru4, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_task4)
                .addGap(42, 42, 42))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_waktuAwal4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txt_waktuAkhir4, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_jadwal4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(guru4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(btn_task4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txt_idKelas, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addComponent(jPanel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txt_idLab, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nis)
                                .addGap(31, 31, 31)
                                .addComponent(txt_idkom, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(test_1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idHari, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6)
                                .addComponent(txt_jamKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_idGuru, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(btn_history)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNama, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(btn_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(txt_date, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_idKelas))
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_history)
                    .addComponent(btn_logout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNama)
                    .addComponent(txt_nis)
                    .addComponent(txt_idkom)
                    .addComponent(test_1)
                    .addComponent(txt_idHari)
                    .addComponent(txt_idLab)
                    .addComponent(txt_jamKeluar)
                    .addComponent(txt_idGuru))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        
        if (JOptionPane.showConfirmDialog(null, "Yakin ingin keluar?","Ya",
            JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION){
            try {
                postBilling();
                dispose();
                FormLogin fl = new FormLogin();
                fl.setVisible(true);
            } catch (ParseException ex) {
                Logger.getLogger(FormMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (AWTException ex) {
                Logger.getLogger(FormMain.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InterruptedException ex) {
                Logger.getLogger(FormMain.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_task1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_task1ActionPerformed
        FormMapel formMapel = new FormMapel();
        formMapel.setnama_Mapel(txt_jadwal1.getText());
        formMapel.setVisible(true);
        formMapel.setnama_Guru(guru1.getText());
        formMapel.setwaktuAwal(txt_waktuAwal1.getText());
        formMapel.setwaktuAkhir(txt_waktuAkhir1.getText());
        formMapel.set_nis(txt_nis.getText());
        
        
        
        //tampilanTask.setId_jadwal_mapel("9", txt_nis.getText());
    }//GEN-LAST:event_btn_task1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_task2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_task2ActionPerformed
        // TODO add your handling code here:
        FormMapel formMapel = new FormMapel();
        formMapel.setnama_Mapel(txt_jadwal2.getText());
        formMapel.setVisible(true);
        formMapel.setnama_Guru(guru2.getText());
        formMapel.setwaktuAwal(txt_waktuAwal2.getText());
        formMapel.setwaktuAkhir(txt_waktuAkhir2.getText());
        formMapel.set_nis(txt_nis.getText());
    }//GEN-LAST:event_btn_task2ActionPerformed

    private void btn_task3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_task3ActionPerformed
        
        FormMapel formMapel = new FormMapel();
        formMapel.setnama_Mapel(txt_jadwal3.getText());
        formMapel.setVisible(true);
        formMapel.setnama_Guru(guru3.getText());
        formMapel.setwaktuAwal(txt_waktuAwal3.getText());
        formMapel.setwaktuAkhir(txt_waktuAkhir3.getText());
        formMapel.set_nis(txt_nis.getText());
    }//GEN-LAST:event_btn_task3ActionPerformed

    private void btn_historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_historyActionPerformed
        FrmBilling fb = new FrmBilling();
        fb.setVisible(true);
    }//GEN-LAST:event_btn_historyActionPerformed

    private void btn_task4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_task4ActionPerformed
        FormMapel formMapel = new FormMapel();
        formMapel.setnama_Mapel(txt_jadwal4.getText());
        formMapel.setVisible(true);
        formMapel.setnama_Guru(guru4.getText());
        formMapel.setwaktuAwal(txt_waktuAwal4.getText());
        formMapel.setwaktuAkhir(txt_waktuAkhir4.getText());
        formMapel.set_nis(txt_nis.getText());
    }//GEN-LAST:event_btn_task4ActionPerformed

    private void postBilling() throws ParseException{
        String nis = txt_nis.getText();
        String id_kom = txt_idkom.getText();
        String id_guru = txt_idGuru.getText();
        Date date = new Date();
        Date jamKeldate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(jam_keluar);
        
        SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd, yyyy HH:mm:ss a");
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String jam_masuk = dateFormat.format(date);
        String jam_kel = dateFormat.format(jamKeldate);
        Date jamKel = dateFormat.parse(jam_masuk);
        Date jamMasuk = dateFormat1.parse(jam_keluar);
        Timestamp ts_jamkel = new Timestamp(jamKel.getTime());
        Timestamp ts_jamMasuk = new Timestamp(jamMasuk.getTime());
        
        billing.setNis(nis);
        billing.setDate_time(ts_jamMasuk);
        billing.setId_guru("1");
        billing.setId_komputer(id_kom);
        billing.setId_mapel("1");
        billing.setJam_keluar(ts_jamkel);
        billingModel.insertBilling(billing);
    }
    
    private void getDatajadwal_mapel() {
        jl1 = jadwalLabModel.getJadwal_1(user, hari);
        jl2 = jadwalLabModel.getJadwal_2(user, hari);
        if (jl1 != null && jl2 != null) {
            get2Jmapel();
        }else if(jl1 != null && jl2 == null){
            getJmapel();
        }else{
            txt_jadwal1.setText("Kosong");
            guru1.setText("Kosong");
            txt_waktuAwal1.setText("--:--");
            txt_jadwal2.setText("Kosong");
            guru2.setText("Kosong");
            txt_waktuAwal2.setText("--:--");
            txt_jadwal3.setText("Kosong");
            guru3.setText("Kosong");
            txt_waktuAwal3.setText("--:--");
            btn_task1.setVisible(false);
            btn_task2.setVisible(false);
            btn_task3.setVisible(false);
            
            txt_jadwal4.setText("Kosong");
            guru4.setText("Kosong");
            txt_waktuAwal4.setText("--:--");
            txt_waktuAkhir4.setText("--:--");
            btn_task4.setVisible(false);
        }
    }
    private void get2Jmapel(){
        
        jumlah_mapel = jumlah_mapelModel.getMapel_row(jl1);
        if (jumlah_mapel.getHasil() != null) {
        
        jmp1 = jadwal_mapelModel.getJadwal_mapel1(jl1);
        if(jmp1 != null ){
            mapel = mapelModel.getMapel_1(jmp1);
            nagu = namaGuru.getNama_guru1(jmp1);
            txt_jadwal1.setText(mapel.getNama_mapel());
            guru1.setText(nagu.getNama_guru());
            txt_waktuAwal1.setText(jmp1.getJam_mulai());
            txt_waktuAkhir1.setText(jmp1.getJam_selesai());
            txt_idGuru.setText(jmp1.getId_guru());
            
            jmp2 = jadwal_mapelModel.getJadwal_mapel2(jl1);
            if (jmp2 != null) {
                mapel = mapelModel.getMapel_2(jmp2);
                nagu = namaGuru.getNama_guru2(jmp2);
                txt_jadwal2.setText(mapel.getNama_mapel());
                guru2.setText(nagu.getNama_guru());
                txt_waktuAwal2.setText(jmp2.getJam_mulai());
                txt_waktuAkhir2.setText(jmp2.getJam_selesai());
                
                jmp3 = jadwal_mapelModel.getJadwal_mapel3(jl1);
                if (jmp3 != null) {
                    mapel = mapelModel.getMapel_3(jmp3);
                    nagu = namaGuru.getNama_guru3(jmp3);
                    txt_jadwal3.setText(mapel.getNama_mapel());
                    guru3.setText(nagu.getNama_guru());
                    txt_waktuAwal3.setText(jmp3.getJam_mulai());
                    txt_waktuAkhir3.setText(jmp3.getJam_selesai());
                    
                    jmp4 = jadwal_mapelModel.getJadwal_mapel4(jl1);
                    if (jmp4 != null) {
                        
                        mapel = mapelModel.getMapel_4(jmp4);
                        nagu = namaGuru.getNama_guru4(jmp4);
                        txt_jadwal4.setText(mapel.getNama_mapel());
                        guru4.setText(nagu.getNama_guru());
                        txt_waktuAwal4.setText(jmp4.getJam_mulai());
                        txt_waktuAkhir4.setText(jmp4.getJam_selesai());
                    }else{
                        jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                        
                        if (jmp1 != null) {
                            mapel = mapelModel.getMapel_1(jmp1);
                            nagu = namaGuru.getNama_guru1(jmp1);
                            txt_jadwal4.setText(mapel.getNama_mapel());
                            guru4.setText(nagu.getNama_guru());
                            txt_waktuAwal4.setText(jmp1.getJam_mulai());
                            txt_waktuAkhir4.setText(jmp1.getJam_selesai());
                        }else{
                            txt_jadwal4.setText("Kosong");
                            guru4.setText("Kosong");
                            txt_waktuAwal4.setText("--:--");
                            txt_waktuAkhir4.setText("--:--");
                            btn_task4.setVisible(false);
                        }
                    }
                }else{
                    jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                    if (jmp1 != null) {
                    mapel = mapelModel.getMapel_1(jmp1);
                    nagu = namaGuru.getNama_guru1(jmp1);
                    txt_jadwal3.setText(mapel.getNama_mapel());
                    guru3.setText(nagu.getNama_guru());
                    txt_waktuAwal3.setText(jmp1.getJam_mulai());
                    txt_waktuAkhir3.setText(jmp1.getJam_selesai());
                    
                    jmp2 = jadwal_mapelModel.getJadwal_mapel2_2(jl2);    
                        if (jmp2 != null) {
                            mapel = mapelModel.getMapel_2(jmp2);
                            nagu = namaGuru.getNama_guru2(jmp2);
                            txt_jadwal4.setText(mapel.getNama_mapel());
                            guru4.setText(nagu.getNama_guru());
                            txt_waktuAwal4.setText(jmp2.getJam_mulai());
                            txt_waktuAkhir4.setText(jmp2.getJam_selesai());
                        }else{
                            txt_jadwal4.setText("Kosong");
                            guru4.setText("Kosong");
                            txt_waktuAwal4.setText("--:--");
                            txt_waktuAkhir4.setText("--:--");
                            btn_task4.setVisible(false);
                        }
                    }else{
                        txt_jadwal3.setText("Kosong");
                        guru3.setText("Kosong");
                        txt_waktuAwal3.setText("--:--");
                        txt_waktuAkhir3.setText("--:--");
                        btn_task3.setVisible(false);
                        
                        txt_jadwal4.setText("Kosong");
                        guru4.setText("Kosong");
                        txt_waktuAwal4.setText("--:--");
                        txt_waktuAkhir4.setText("--:--");
                        btn_task4.setVisible(false);
                    }
                }
            }else{
                jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                
                if (jmp1 != null) {
                    mapel = mapelModel.getMapel_1(jmp1);
                    nagu = namaGuru.getNama_guru1(jmp1);
                    txt_jadwal2.setText(mapel.getNama_mapel());
                    guru2.setText(nagu.getNama_guru());
                    txt_waktuAwal2.setText(jmp1.getJam_mulai());
                    txt_waktuAkhir2.setText(jmp1.getJam_selesai());

                    jmp2 = jadwal_mapelModel.getJadwal_mapel2_2(jl2);
                    if (jmp2 !=null) {
                        mapel = mapelModel.getMapel_2(jmp2);
                        nagu = namaGuru.getNama_guru2(jmp2);
                        txt_jadwal3.setText(mapel.getNama_mapel());
                        guru3.setText(nagu.getNama_guru());
                        txt_waktuAwal3.setText(jmp2.getJam_mulai());
                        txt_waktuAkhir3.setText(jmp2.getJam_selesai());
                        
                        jmp3 = jadwal_mapelModel.getJadwal_mapel2_3(jl2);
                        if (jmp3 !=null) {
                            
                            mapel = mapelModel.getMapel_3(jmp3);
                            nagu = namaGuru.getNama_guru3(jmp3);
                            txt_jadwal4.setText(mapel.getNama_mapel());
                            guru4.setText(nagu.getNama_guru());
                            txt_waktuAwal4.setText(jmp3.getJam_mulai());
                            txt_waktuAkhir4.setText(jmp3.getJam_selesai());
                        }else{
                            txt_jadwal4.setText("Kosong");
                            guru4.setText("Kosong");
                            txt_waktuAwal4.setText("--:--");
                            txt_waktuAkhir4.setText("--:--");
                            btn_task4.setVisible(false);
                        }
                     } else{
                            txt_jadwal3.setText("Kosong");
                            guru3.setText("Kosong");
                            txt_waktuAwal3.setText("--:--");
                            txt_waktuAkhir3.setText("--:--");
                            btn_task3.setVisible(false);
                            
                            txt_jadwal4.setText("Kosong");
                            guru4.setText("Kosong");
                            txt_waktuAwal4.setText("--:--");
                            txt_waktuAkhir4.setText("--:--");
                            btn_task4.setVisible(false);
                           }
                    }else{
                    txt_jadwal2.setText("Kosong");
                    guru2.setText("Kosong");
                    txt_waktuAwal2.setText("--:--");
                    txt_waktuAkhir2.setText("--:--");
                    btn_task2.setVisible(false);
                    
                    txt_jadwal3.setText("Kosong");
                    guru3.setText("Kosong");
                    txt_waktuAwal3.setText("--:--");
                    txt_waktuAkhir3.setText("--:--");
                    btn_task3.setVisible(false);
                    
                    txt_jadwal4.setText("Kosong");
                    guru4.setText("Kosong");
                    txt_waktuAwal4.setText("--:--");
                    txt_waktuAkhir4.setText("--:--");
                    btn_task4.setVisible(false);
                }
            }
        }else{
            jumlah_mapel = jumlah_mapelModel.getMapel_row2(jl2);
            
            if (jumlah_mapel.getHasil().equals("4")) {
                jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                mapel = mapelModel.getMapel_1(jmp1);
                nagu = namaGuru.getNama_guru1(jmp1);
                txt_jadwal1.setText(mapel.getNama_mapel());
                guru1.setText(nagu.getNama_guru());
                txt_waktuAwal1.setText(jmp1.getJam_mulai());
                txt_waktuAkhir1.setText(jmp1.getJam_selesai());

                jmp2 = jadwal_mapelModel.getJadwal_mapel2_2(jl2);
                mapel = mapelModel.getMapel_2(jmp2);
                nagu = namaGuru.getNama_guru2(jmp2);
                txt_jadwal2.setText(mapel.getNama_mapel());
                guru2.setText(nagu.getNama_guru());
                txt_waktuAwal2.setText(jmp2.getJam_mulai());
                txt_waktuAkhir2.setText(jmp2.getJam_selesai());

                jmp3 = jadwal_mapelModel.getJadwal_mapel2_3(jl2);
                mapel = mapelModel.getMapel_3(jmp3);
                nagu = namaGuru.getNama_guru3(jmp3);
                txt_jadwal3.setText(mapel.getNama_mapel());
                guru3.setText(nagu.getNama_guru());
                txt_waktuAwal3.setText(jmp3.getJam_mulai());
                txt_waktuAkhir3.setText(jmp3.getJam_selesai());

                jmp4 = jadwal_mapelModel.getJadwal_mapel2_4(jl2);
                mapel = mapelModel.getMapel_4(jmp4);
                nagu = namaGuru.getNama_guru4(jmp4);
                txt_jadwal4.setText(mapel.getNama_mapel());
                guru4.setText(nagu.getNama_guru());
                txt_waktuAwal4.setText(jmp4.getJam_mulai());
                txt_waktuAkhir4.setText(jmp4.getJam_selesai());
                
            }else if (jumlah_mapel.getHasil().equals("3")) {
                jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                txt_idGuru.setText(jmp1.getId_guru());
                mapel = mapelModel.getMapel_1(jmp1);
                nagu = namaGuru.getNama_guru1(jmp1);
                txt_jadwal1.setText(mapel.getNama_mapel());
                guru1.setText(nagu.getNama_guru());
                txt_waktuAwal1.setText(jmp1.getJam_mulai());
                txt_waktuAkhir1.setText(jmp1.getJam_selesai());

                jmp2 = jadwal_mapelModel.getJadwal_mapel2_2(jl2);
                mapel = mapelModel.getMapel_2(jmp2);
                nagu = namaGuru.getNama_guru2(jmp2);
                txt_jadwal2.setText(mapel.getNama_mapel());
                guru2.setText(nagu.getNama_guru());
                txt_waktuAwal2.setText(jmp2.getJam_mulai());
                txt_waktuAkhir2.setText(jmp2.getJam_selesai());

                jmp3 = jadwal_mapelModel.getJadwal_mapel2_3(jl2);
                mapel = mapelModel.getMapel_3(jmp3);
                nagu = namaGuru.getNama_guru3(jmp3);
                txt_jadwal3.setText(mapel.getNama_mapel());
                guru3.setText(nagu.getNama_guru());
                txt_waktuAwal3.setText(jmp3.getJam_mulai());
                txt_waktuAkhir3.setText(jmp3.getJam_selesai());
                
                txt_jadwal4.setText("Kosong");
                guru4.setText("Kosong");
                txt_waktuAwal4.setText("--:--");
                txt_waktuAkhir4.setText("--:--");
                btn_task4.setVisible(false);
            }else if(jumlah_mapel.getHasil().equals("2")){
                jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                txt_idGuru.setText(jmp1.getId_guru());
                mapel = mapelModel.getMapel_1(jmp1);
                nagu = namaGuru.getNama_guru1(jmp1);
                txt_jadwal1.setText(mapel.getNama_mapel());
                guru1.setText(nagu.getNama_guru());
                txt_waktuAwal1.setText(jmp1.getJam_mulai());
                txt_waktuAkhir1.setText(jmp1.getJam_selesai());

                jmp2 = jadwal_mapelModel.getJadwal_mapel2_2(jl2);
                mapel = mapelModel.getMapel_2(jmp2);
                nagu = namaGuru.getNama_guru2(jmp2);
                txt_jadwal2.setText(mapel.getNama_mapel());
                guru2.setText(nagu.getNama_guru());
                txt_waktuAwal2.setText(jmp2.getJam_mulai());
                txt_waktuAkhir2.setText(jmp2.getJam_selesai());
                
                txt_jadwal3.setText("Kosong");
                guru3.setText("Kosong");
                txt_waktuAwal3.setText("--:--");
                txt_waktuAkhir3.setText("--:--");
                btn_task3.setVisible(false);
                
                txt_jadwal4.setText("Kosong");
                guru4.setText("Kosong");
                txt_waktuAwal4.setText("--:--");
                txt_waktuAkhir4.setText("--:--");
                btn_task4.setVisible(false);
                
            }else if(jumlah_mapel.getHasil().equals("1")){
                jmp1 = jadwal_mapelModel.getJadwal_mapel2_1(jl2);
                mapel = mapelModel.getMapel_1(jmp1);
                nagu = namaGuru.getNama_guru1(jmp1);
                txt_jadwal1.setText(mapel.getNama_mapel());
                guru1.setText(nagu.getNama_guru());
                txt_waktuAwal1.setText(jmp1.getJam_mulai());
                txt_waktuAkhir1.setText(jmp1.getJam_selesai());
                txt_idGuru.setText(jmp1.getId_guru());
                
                txt_jadwal2.setText("Kosong");
                guru2.setText("Kosong");
                txt_waktuAwal2.setText("--:--");
                txt_waktuAkhir2.setText("--:--");
                btn_task2.setVisible(false);
                
                txt_jadwal3.setText("Kosong");
                guru3.setText("Kosong");
                txt_waktuAwal3.setText("--:--");
                txt_waktuAkhir3.setText("--:--");
                btn_task3.setVisible(false);
                
                txt_jadwal4.setText("Kosong");
                guru4.setText("Kosong");
                txt_waktuAwal4.setText("--:--");
                txt_waktuAkhir4.setText("--:--");
                btn_task4.setVisible(false);
            }else{
                txt_jadwal1.setText("Kosong");
                guru1.setText("Kosong");
                txt_waktuAwal1.setText("--:--");
                txt_waktuAkhir1.setText("--:--");
                btn_task1.setVisible(false);
                
                txt_jadwal2.setText("Kosong");
                guru2.setText("Kosong");
                txt_waktuAwal2.setText("--:--");
                txt_waktuAkhir2.setText("--:--");
                btn_task2.setVisible(false);
                
                txt_jadwal3.setText("Kosong");
                guru3.setText("Kosong");
                txt_waktuAwal3.setText("--:--");
                txt_waktuAkhir3.setText("--:--");
                btn_task3.setVisible(false);
                
                txt_jadwal4.setText("Kosong");
                guru4.setText("Kosong");
                txt_waktuAwal4.setText("--:--");
                txt_waktuAkhir4.setText("--:--");
                btn_task4.setVisible(false);
            }
            
        }
        
        }else{
            txt_jadwal1.setText("Kosong");
            guru1.setText("Kosong");
            txt_waktuAwal1.setText("--:--");
            txt_waktuAkhir1.setText("--:--");
            btn_task1.setVisible(false);
            
            txt_jadwal2.setText("Kosong");
            guru2.setText("Kosong");
            txt_waktuAwal2.setText("--:--");
            txt_waktuAkhir2.setText("--:--");
            btn_task2.setVisible(false);
            
            txt_jadwal3.setText("Kosong");
            guru3.setText("Kosong");
            txt_waktuAwal3.setText("--:--");
            txt_waktuAkhir3.setText("--:--");
            btn_task3.setVisible(false);
            
            txt_jadwal4.setText("Kosong");
            guru4.setText("Kosong");
            txt_waktuAwal4.setText("--:--");
            txt_waktuAkhir4.setText("--:--");
            btn_task4.setVisible(false);
        }
    }
    private void getJmapel(){
        jumlah_mapel = jumlah_mapelModel.getMapel_row(jl1);
        if (jumlah_mapel.getHasil().equals("4")) {
            
        jmp1 = jadwal_mapelModel.getJadwal_mapel1(jl1);
        mapel = mapelModel.getMapel_1(jmp1);
        nagu = namaGuru.getNama_guru1(jmp1);
        txt_jadwal1.setText(mapel.getNama_mapel());
        guru1.setText(nagu.getNama_guru());
        txt_waktuAwal1.setText(jmp1.getJam_mulai());
        txt_waktuAkhir1.setText(jmp1.getJam_selesai());
        
        jmp2 = jadwal_mapelModel.getJadwal_mapel2(jl1);
        mapel = mapelModel.getMapel_2(jmp2);
        nagu = namaGuru.getNama_guru2(jmp2);
        txt_jadwal2.setText(mapel.getNama_mapel());
        guru2.setText(nagu.getNama_guru());
        txt_waktuAwal2.setText(jmp2.getJam_mulai());
        txt_waktuAkhir2.setText(jmp2.getJam_selesai());
        
        jmp3 = jadwal_mapelModel.getJadwal_mapel3(jl1);
        mapel = mapelModel.getMapel_3(jmp3);
        nagu = namaGuru.getNama_guru3(jmp3);
        txt_jadwal3.setText(mapel.getNama_mapel());
        guru3.setText(nagu.getNama_guru());
        txt_waktuAwal3.setText(jmp3.getJam_mulai());
        txt_waktuAkhir3.setText(jmp3.getJam_selesai());
        
        jmp4 = jadwal_mapelModel.getJadwal_mapel4(jl1);
        mapel = mapelModel.getMapel_4(jmp4);
        nagu = namaGuru.getNama_guru4(jmp4);
        txt_jadwal4.setText(mapel.getNama_mapel());
        guru4.setText(nagu.getNama_guru());
        txt_waktuAwal4.setText(jmp4.getJam_mulai());
        txt_waktuAkhir4.setText(jmp4.getJam_selesai());
            
        }else if (jumlah_mapel.getHasil().equals("3")) {
        
        jmp1 = jadwal_mapelModel.getJadwal_mapel1(jl1);
        mapel = mapelModel.getMapel_1(jmp1);
        nagu = namaGuru.getNama_guru1(jmp1);
        txt_jadwal1.setText(mapel.getNama_mapel());
        guru1.setText(nagu.getNama_guru());
        txt_waktuAwal1.setText(jmp1.getJam_mulai());
        txt_waktuAkhir1.setText(jmp1.getJam_selesai());
        
        jmp2 = jadwal_mapelModel.getJadwal_mapel2(jl1);
        mapel = mapelModel.getMapel_2(jmp2);
        nagu = namaGuru.getNama_guru2(jmp2);
        txt_jadwal2.setText(mapel.getNama_mapel());
        guru2.setText(nagu.getNama_guru());
        txt_waktuAwal2.setText(jmp2.getJam_mulai());
        txt_waktuAkhir2.setText(jmp2.getJam_selesai());
        
        jmp3 = jadwal_mapelModel.getJadwal_mapel3(jl1);
        mapel = mapelModel.getMapel_3(jmp3);
        nagu = namaGuru.getNama_guru3(jmp3);
        txt_jadwal3.setText(mapel.getNama_mapel());
        guru3.setText(nagu.getNama_guru());
        txt_waktuAwal3.setText(jmp3.getJam_mulai());
        txt_waktuAkhir3.setText(jmp3.getJam_selesai());
        
        txt_jadwal4.setText("Kosong");
        guru4.setText("Kosong");
        txt_waktuAwal4.setText("--:--");
        txt_waktuAkhir4.setText("--:--");
        btn_task4.setVisible(false);
        
        }else if(jumlah_mapel.getHasil().equals("2")){
            
        jmp1 = jadwal_mapelModel.getJadwal_mapel1(jl1);
        mapel = mapelModel.getMapel_1(jmp1);
        nagu = namaGuru.getNama_guru1(jmp1);
        txt_jadwal1.setText(mapel.getNama_mapel());
        guru1.setText(nagu.getNama_guru());
        txt_waktuAwal1.setText(jmp1.getJam_mulai());
        txt_waktuAkhir1.setText(jmp1.getJam_selesai());
        
        jmp2 = jadwal_mapelModel.getJadwal_mapel2(jl1);
        mapel = mapelModel.getMapel_2(jmp2);
        nagu = namaGuru.getNama_guru2(jmp2);
        txt_jadwal2.setText(mapel.getNama_mapel());
        guru2.setText(nagu.getNama_guru());
        txt_waktuAwal2.setText(jmp2.getJam_mulai());
        txt_waktuAkhir2.setText(jmp2.getJam_selesai());
        
        txt_jadwal3.setText("Kosong");
        guru3.setText("Kosong");
        txt_waktuAwal3.setText("--:--");
        txt_waktuAkhir3.setText("--:--");
        btn_task3.setVisible(false);
        
        txt_jadwal4.setText("Kosong");
        guru4.setText("Kosong");
        txt_waktuAwal4.setText("--:--");
        txt_waktuAkhir4.setText("--:--");
        btn_task4.setVisible(false);
        
        }else if(jumlah_mapel.getHasil().equals("1")){

        jmp1 = jadwal_mapelModel.getJadwal_mapel1(jl1);
        mapel = mapelModel.getMapel_1(jmp1);
        nagu = namaGuru.getNama_guru1(jmp1);
        txt_jadwal1.setText(mapel.getNama_mapel());
        guru1.setText(nagu.getNama_guru());
        txt_waktuAwal1.setText(jmp1.getJam_mulai());
        txt_waktuAkhir1.setText(jmp1.getJam_selesai());
        
        txt_jadwal2.setText("Kosong");
        guru2.setText("Kosong");
        txt_waktuAwal2.setText("--:--");
        txt_waktuAkhir2.setText("--:--");
        btn_task2.setVisible(false);
        
        txt_jadwal3.setText("Kosong");
        guru3.setText("Kosong");
        txt_waktuAwal3.setText("--:--");
        txt_waktuAkhir3.setText("--:--");
        btn_task3.setVisible(false);
        
        txt_jadwal4.setText("Kosong");
        guru4.setText("Kosong");
        txt_waktuAwal4.setText("--:--");
        txt_waktuAkhir4.setText("--:--");
        btn_task4.setVisible(false);
        }else if(jumlah_mapel.getHasil().equals("0")){
            
            txt_jadwal1.setText("Kosong");
            guru1.setText("Kosong");
            txt_waktuAwal1.setText("--:--");
            txt_waktuAkhir1.setText("--:--");
            btn_task1.setVisible(false);

            txt_jadwal2.setText("Kosong");
            guru2.setText("Kosong");
            txt_waktuAwal2.setText("--:--");
            txt_waktuAkhir2.setText("--:--");
            btn_task2.setVisible(false);

            txt_jadwal3.setText("Kosong");
            guru3.setText("Kosong");
            txt_waktuAwal3.setText("--:--");
            txt_waktuAkhir3.setText("--:--");
            btn_task3.setVisible(false);
            
            txt_jadwal4.setText("Kosong");
            guru4.setText("Kosong");
            txt_waktuAwal4.setText("--:--");
            txt_waktuAkhir4.setText("--:--");
            btn_task4.setVisible(false);
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
    private javax.swing.JButton btn_history;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_task1;
    private javax.swing.JButton btn_task2;
    private javax.swing.JButton btn_task3;
    private javax.swing.JButton btn_task4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel guru1;
    private javax.swing.JLabel guru2;
    private javax.swing.JLabel guru3;
    private javax.swing.JLabel guru4;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblNama;
    private javax.swing.JLabel test_1;
    private javax.swing.JLabel txt_date;
    private javax.swing.JLabel txt_idGuru;
    private javax.swing.JLabel txt_idHari;
    private javax.swing.JLabel txt_idKelas;
    private javax.swing.JLabel txt_idLab;
    private javax.swing.JLabel txt_idkom;
    private javax.swing.JLabel txt_jadwal1;
    private javax.swing.JLabel txt_jadwal2;
    private javax.swing.JLabel txt_jadwal3;
    private javax.swing.JLabel txt_jadwal4;
    private javax.swing.JLabel txt_jamKeluar;
    private javax.swing.JLabel txt_nis;
    private javax.swing.JLabel txt_waktuAkhir1;
    private javax.swing.JLabel txt_waktuAkhir2;
    private javax.swing.JLabel txt_waktuAkhir3;
    private javax.swing.JLabel txt_waktuAkhir4;
    private javax.swing.JLabel txt_waktuAwal1;
    private javax.swing.JLabel txt_waktuAwal2;
    private javax.swing.JLabel txt_waktuAwal3;
    private javax.swing.JLabel txt_waktuAwal4;
    // End of variables declaration//GEN-END:variables

    

    
}
