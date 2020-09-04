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
public class WorkDone {
    String id_work,nis,id_tugas,status;

    public String getId_work() {
        return id_work;
    }

    public void setId_work(String id_work) {
        this.id_work = id_work;
    }

    public String getNis() {
        return nis;
    }

    public void setNis(String nis) {
        this.nis = nis;
    }

    public String getId_tugas() {
        return id_tugas;
    }

    public void setId_tugas(String id_tugas) {
        this.id_tugas = id_tugas;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
