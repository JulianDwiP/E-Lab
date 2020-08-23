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
public class Guru {
    private String id_guru;
    private String id_mapel;
    private String nip;
    private String nama_guru;
    
    public String getId_guru() {
        return id_guru;
    }

    public void setIdi_guru(String id_guru) {
        this.id_guru = id_guru;
    }
    public String getId_mapel() {
        return id_mapel;
    }

    public void setIdi_mapel(String id_mapel) {
        this.id_mapel = id_mapel;
    }public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }public String getNama_guru() {
        return nama_guru;
    }

    public void setNama_guru(String nama_guru) {
        this.nama_guru = nama_guru;
    }
}
