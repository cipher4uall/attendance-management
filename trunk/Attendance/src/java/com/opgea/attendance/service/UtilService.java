/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.service;

import com.opgea.attendance.domain.modal.SimpleModel;
import java.util.List;

/**
 *
 * @author Ramesh
 */
public interface UtilService {
    
    public List<SimpleModel> getAllCountries();
    public List<SimpleModel> getAllCities();
    public List<SimpleModel> getCitiesByCountry(Long countryId);
    public List<SimpleModel> getAllEmployeeTypes();
}
