/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.dao;

import com.opgea.attendance.domain.entities.Login;
import java.util.List;

/**
 *
 * @author Ramesh
 */
public interface LoginDAO {
 
    public Login create(Login login);
    public Login update(Login login);
    public Login remove(String loginId);
    public Login find(String loginId);
    public List<Login> findAll();
}
