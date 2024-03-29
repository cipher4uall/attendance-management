/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.service;

import com.opgea.attendence.web.controller.dto.EmployeeDTO;
import java.util.List;

/**
 *
 * @author Ramesh
 */
public interface EmployeeService {
    
    public EmployeeDTO create(EmployeeDTO employeeDTO);
    public EmployeeDTO update(EmployeeDTO employeeDTO);
    public EmployeeDTO remove(Long id);
    public EmployeeDTO find(Long id);
    public List<EmployeeDTO> findAll();
}
