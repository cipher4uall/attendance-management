/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.service.impl;

import com.opgea.attendance.dao.CityDAO;
import com.opgea.attendance.dao.CountryDAO;
import com.opgea.attendance.domain.entities.City;
import com.opgea.attendance.domain.entities.Country;
import com.opgea.attendance.domain.modal.SimpleModel;
import com.opgea.attendance.domain.qualifier.EmployeeType;
import com.opgea.attendance.service.UtilService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Ramesh
 */
@Service
public class UtilServiceImpl implements UtilService{

    
    @Autowired
    private CountryDAO countryDAO;
    @Autowired
    private CityDAO cityDAO;

    
    
    @Override
    public List<SimpleModel> getAllCountries() {
        List<Country> countries = countryDAO.findAll();
        List<SimpleModel> countryList = new ArrayList<SimpleModel>();
        for(Country country : countries){
            SimpleModel model = new SimpleModel();
            model.setId(new Long(country.getId()));
            model.setValue(country.getName());
            countryList.add(model);
        }
        return countryList;
    }

    @Override
    public List<SimpleModel> getAllCities() {
        List<City> cities = cityDAO.findAll();
        List<SimpleModel> cityList = new ArrayList<SimpleModel>();
        for(City city : cities){
            SimpleModel model = new SimpleModel();
            model.setId(new Long(city.getId()));
            model.setValue(city.getName());
            cityList.add(model);
        }
        return cityList;
    }

    @Override
    public List<SimpleModel> getCitiesByCountry(Long countryId) {
        List<City> cities = cityDAO.findAllByCountry(countryId);
        List<SimpleModel> cityList = new ArrayList<SimpleModel>();
        for(City city : cities){
            SimpleModel model = new SimpleModel();
            model.setId(new Long(city.getId()));
            model.setValue(city.getName());
            cityList.add(model);
        }
        return cityList;
    }

    

    @Override
    public List<SimpleModel> getAllEmployeeTypes() {
        List<SimpleModel> employeeTypeList = new ArrayList<SimpleModel>();
        for(EmployeeType qualifier : EmployeeType.values()){
            SimpleModel model = new SimpleModel();
            model.setId(new Long(qualifier.ordinal()));
            model.setValue(qualifier.name());
            employeeTypeList.add(model);
        }
        return employeeTypeList;
    }

        
}
