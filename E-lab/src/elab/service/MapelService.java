/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.service;

import elab.entity.Jadwal_mapel1;
import elab.entity.Jadwal_mapel2;
import elab.entity.Jadwal_mapel3;
import elab.entity.Mapel1;

/**
 *
 * @author Julian Dwi Putra
 */
public interface MapelService {
    Mapel1 getMapel_1(Jadwal_mapel1 id_mapel);
    Mapel1 getMapel_2(Jadwal_mapel2 id_mapel);
    Mapel1 getMapel_3(Jadwal_mapel3 id_mapel);
}
