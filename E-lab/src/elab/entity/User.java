/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.entity;

/**
 *
 * @author ASUS
 */
public class User {
   
    private String username;
    private String password;
    private String nama;
    private String nis;
    private String mapel;
    private String waktu;
    private String id_komputer;
    private String id_kelas;

    public String getId_kelas() {
        return id_kelas;
    }

    public void setId_kelas(String id_kelas) {
        this.id_kelas = id_kelas;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getId_kom() {
        return id_komputer;
    }

    public void setId_kom(String id_kom) {
        this.id_komputer = id_kom;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String id) {
        this.nis = id;
    }
     public String getMapel() {
            return mapel;
    }

    public void setMapel(String mapel) {
        this.mapel = mapel;
    }
    
}
