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
public class Tugas {
    String id_tugas, id_jadwal_mapel,title,description,due_date,status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId_tugas() {
        return id_tugas;
    }

    public void setId_tugas(String id_tugas) {
        this.id_tugas = id_tugas;
    }

    public String getId_jadwal_mapel() {
        return id_jadwal_mapel;
    }

    public void setId_jadwal_mapel(String id_jadwal_mapel) {
        this.id_jadwal_mapel = id_jadwal_mapel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }
    
    
    
}
