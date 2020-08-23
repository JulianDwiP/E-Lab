/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.service;

import elab.entity.Hari;
import elab.entity.Jadwal_lab1;
import elab.entity.Jadwal_lab2;
import elab.entity.User;

/**
 *
 * @author Julian Dwi Putra
 */
public interface Jadwal_labService {
    Jadwal_lab1 getJadwal_lab1(User user, Hari hari);
    Jadwal_lab2 getJadwal_lab2(User user, Hari hari);
}
