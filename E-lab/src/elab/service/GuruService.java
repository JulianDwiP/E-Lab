/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.service;
import elab.entity.Guru;
import elab.entity.Mapel1;
import java.util.List;
/**
 *
 * @author Julian Dwi Putra
 */
public interface GuruService {
    Guru getGuru(Mapel1 id_mapel);
}
