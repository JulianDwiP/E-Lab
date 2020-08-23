/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.service;

import elab.entity.Jadwal_lab1;
import elab.entity.Jadwal_mapel1;
import elab.entity.Jadwal_mapel2;
import elab.entity.Jadwal_mapel3;

/**
 *
 * @author Julian Dwi Putra
 */
public interface Jadwal_mapelService {
    Jadwal_mapel1 getJadwal_mapel1(Jadwal_lab1 jadwal_lab1);
    Jadwal_mapel2 getJadwal_mapel2(Jadwal_lab1 jadwal_lab1);
    Jadwal_mapel3 getJadwal_mapel3(Jadwal_lab1 jadwal_lab1);
}
