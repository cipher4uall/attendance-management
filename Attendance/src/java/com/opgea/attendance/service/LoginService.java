/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.service;

import com.opgea.attendence.web.controller.dto.LoginDTO;
import java.util.List;

/**
 *
 * @author Ramesh
 */
public interface LoginService {
 
    public LoginDTO create(LoginDTO loginDTO);
    public LoginDTO update(LoginDTO loginDTO);
    public LoginDTO remove(String loginId);
    public LoginDTO find(String loginId);
    public Boolean isAuthenticUser(String loginId, String password);
    public List<LoginDTO> findAll();
}
