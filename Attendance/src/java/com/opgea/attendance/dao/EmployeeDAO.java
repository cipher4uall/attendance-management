/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.dao;

import com.opgea.attendance.domain.entities.Employee;
import java.util.List;

/**
 *
 * @author Ramesh
 */
public interface EmployeeDAO {
    
    public Employee create(Employee employee);
    public Employee update(Employee employee);
    public Employee remove(Long id);
    public Employee find(Long id);
    public List<Employee> findAll();
    
}
