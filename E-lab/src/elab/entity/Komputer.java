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
public class Komputer {
    String id_komputer;
    String nama_komputer;
    String spesifikasi;
    String id_lab;
    String ip_address;

    public String getId_komputer() {
        return id_komputer;
    }

    public void setId_komputer(String id_komputer) {
        this.id_komputer = id_komputer;
    }

    public String getNama_komputer() {
        return nama_komputer;
    }

    public void setNama_komputer(String nama_komputer) {
        this.nama_komputer = nama_komputer;
    }

    public String getSpesifikasi() {
        return spesifikasi;
    }

    public void setSpesifikasi(String spesifikasi) {
        this.spesifikasi = spesifikasi;
    }

    public String getId_lab() {
        return id_lab;
    }

    public void setId_lab(String id_lab) {
        this.id_lab = id_lab;
    }

    public String getIp_address() {
        return ip_address;
    }

    public void setIp_address(String ip_address) {
        this.ip_address = ip_address;
    }
    
}
