/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.service.impl;

import com.opgea.attendance.dao.EmployeeDAO;
import com.opgea.attendance.domain.entities.Employee;
import com.opgea.attendance.service.EmployeeService;
import com.opgea.attendence.web.controller.dto.EmployeeDTO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ramesh
 */
@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeDAO employeeDAO;
    
    @Override
    public EmployeeDTO create(EmployeeDTO employeeDTO) {
        Employee employee = new Employee();
        employee.setFirstName(employeeDTO.getFirstName());
        employee.setMiddleInitial(employeeDTO.getMiddleInitial());
        employee.setLastName(employeeDTO.getLastName());
        employee.setEmail(employeeDTO.getEmail());
        employee.setDob(employeeDTO.getDateOfBirth());
        employee.setContactNo(employeeDTO.getPhone1());
        //employee.setBranch(employeeDTO.getBranchId());
        employeeDAO.create(employee);
        return employeeDTO;
    }

    @Override
    public EmployeeDTO update(EmployeeDTO employeeDTO) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EmployeeDTO remove(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public EmployeeDTO find(Long id) {
        Employee employee = employeeDAO.find(id);
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setId(employee.getId());
        employeeDTO.setFirstName(employee.getFirstName());
        employeeDTO.setMiddleInitial(employee.getMiddleInitial());
        employeeDTO.setLastName(employee.getLastName());
        employeeDTO.setEmail(employee.getEmail());
        //employeeDTO.setContactNo();
        employeeDTO.setBranchId(id);
        employeeDTO.setCompanyId(employee.getCompany().getId());
        return employeeDTO;
    }

    @Override
    public List<EmployeeDTO> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
