/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.service;
import elab.entity.Jadwal_mapel1;
import elab.entity.Jadwal_mapel2;
import elab.entity.Jadwal_mapel3;
import elab.entity.Nama_guru1;
/**
 *
 * @author ASUS
 */
public interface NamaGuruService {
    Nama_guru1 getNama_guru1(Jadwal_mapel1 id_guru);
    Nama_guru1 getNama_guru2(Jadwal_mapel2 id_guru);
    Nama_guru1 getNama_guru3(Jadwal_mapel3 id_guru);
}
