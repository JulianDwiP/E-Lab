/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.entity;

import java.sql.Timestamp;

/**
 *
 * @author Julian Dwi Putra
 */
public class Billing {
    String id_billing;
    String id_komputer;
    String nis;
    Timestamp date_time;
    Timestamp jam_keluar;
    String id_mapel;
    String id_guru;

    public Timestamp getJam_keluar() {
        return jam_keluar;
    }

    public void setJam_keluar(Timestamp jam_keluar) {
        this.jam_keluar = jam_keluar;
    }
    

    public String getId_billing() {
        return id_billing;
    }

    public void setId_billing(String id_billing) {
        this.id_billing = id_billing;
    }

    public String getId_komputer() {
        return id_komputer;
    }

    public void setId_komputer(String id_komputer) {
        this.id_komputer = id_komputer;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public Timestamp getDate_time() {
        return date_time;
    }

    public void setDate_time(Timestamp date_time) {
        this.date_time = date_time;
    }

    public String getId_mapel() {
        return id_mapel;
    }

    public void setId_mapel(String id_mapel) {
        this.id_mapel = id_mapel;
    }

    public String getId_guru() {
        return id_guru;
    }

    public void setId_guru(String id_guru) {
        this.id_guru = id_guru;
    }
    
    
}
