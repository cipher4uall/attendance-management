/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.service.impl;

import com.opgea.attendance.dao.EmployeeDAO;
import com.opgea.attendance.dao.LoginDAO;
import com.opgea.attendance.domain.entities.Employee;
import com.opgea.attendance.domain.entities.Login;
import com.opgea.attendance.service.LoginService;
import com.opgea.attendence.web.controller.dto.LoginDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ramesh
 */
@Service
public class LoginServiceImpl implements LoginService{

    @Autowired
    private LoginDAO loginDAO;
    
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    public LoginDTO create(LoginDTO loginDTO) {
        Employee employee = employeeDAO.find(loginDTO.getEmployeeId());
        Login login = new Login();
        login.setLoginId(loginDTO.getLoginId());
        login.setPassword(loginDTO.getPassword());
        login.setEmployee(employee);
        loginDAO.create(login);
        return loginDTO;
    }

    @Override
    public LoginDTO update(LoginDTO loginDTO) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LoginDTO remove(String loginId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public LoginDTO find(String loginId) {
        Login login = loginDAO.find(loginId);
        LoginDTO loginDTO = new LoginDTO();
        loginDTO.setEmployeeId(login.getEmployee().getId());
        loginDTO.setLoginId(login.getLoginId());
        loginDTO.setPassword(login.getPassword());
        return loginDTO;
    }

    @Override
    public List<LoginDTO> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    
    @Override
    public Boolean isAuthenticUser(String loginId, String password) {
        Boolean authentic = false;
        Login login = loginDAO.find(loginId);
        if(login != null){
            if(login.getPassword().equals(password) && login.getIsActive() == true){
                authentic = true;
            }
        }
        return authentic;
    }
    
}
