/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.entity;

/**
 *
 * @author Julian Dwi Putra
 */
public class Jadwal_lab2 {
    String id_jadwal_lab;
    String id_kelas;
    String id_hari;
    String jam_mulai;
    String jam_selesai;

    public String getId_jadwal_lab() {
        return id_jadwal_lab;
    }

    public void setId_jadwal_lab(String id_jadwal_lab) {
        this.id_jadwal_lab = id_jadwal_lab;
    }

    public String getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(String id_kelas) {
        this.id_kelas = id_kelas;
    }

    public String getId_hari() {
        return id_hari;
    }

    public void setId_hari(String id_hari) {
        this.id_hari = id_hari;
    }

    public String getJam_mulai() {
        return jam_mulai;
    }

    public void setJam_mulai(String jam_mulai) {
        this.jam_mulai = jam_mulai;
    }

    public String getJam_selesai() {
        return jam_selesai;
    }

    public void setJam_selesai(String jam_selesai) {
        this.jam_selesai = jam_selesai;
    }
}
