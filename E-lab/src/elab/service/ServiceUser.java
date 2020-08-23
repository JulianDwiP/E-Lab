/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elab.service;
import elab.entity.User;
import java.util.List;

public interface ServiceUser {
    Boolean getLogin(User usr);
    User getLoginData(User usr);
}
