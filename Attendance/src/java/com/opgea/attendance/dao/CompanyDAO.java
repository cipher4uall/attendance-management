/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.dao;

import com.opgea.attendance.domain.entities.Company;
import java.util.List;

/**
 *
 * @author Ramesh
 */
public interface CompanyDAO {
    
    public Company create(Company company);
    public Company update(Company company);
    public Company remove(Long id);
    public Company find(Long id);
    public List<Company> findAll();
}
