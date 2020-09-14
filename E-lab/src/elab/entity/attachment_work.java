/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.entity;

import java.sql.Blob;

/**
 *
 * @author Julian Dwi Putra
 */
public class attachment_work {
    String id_attachment_work, id_work, nama_file, path_file;

    public String getPath_file() {
        return path_file;
    }

    public void setPath_file(String path_file) {
        this.path_file = path_file;
    }
    Blob attachment;
    
    public String getId_attachment_work() {
        return id_attachment_work;
    }

    public void setId_attachment_work(String id_attachment_work) {
        this.id_attachment_work = id_attachment_work;
    }

    public String getId_work() {
        return id_work;
    }

    public void setId_work(String id_work) {
        this.id_work = id_work;
    }

    public Blob getAttachment() {
        return attachment;
    }

    public void setAttachment(Blob attachment) {
        this.attachment = attachment;
    }

    

    public String getNama_file() {
        return nama_file;
    }

    public void setNama_file(String nama_file) {
        this.nama_file = nama_file;
    }
    
}
