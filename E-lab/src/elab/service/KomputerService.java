/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.service;

import elab.entity.Komputer;
import elab.entity.User;

/**
 *
 * @author Julian Dwi Putra
 */
public interface KomputerService {
    Komputer getKomputer(User user);
}
