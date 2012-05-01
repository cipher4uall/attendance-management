/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.dao;

import com.opgea.attendance.domain.entities.City;
import java.util.List;

/**
 *
 * @author Ramesh
 */
public interface CityDAO {
    
    public City create(City city);
    public City update(City city);
    public City delete(Long id);
    public City find(Long id);
    public List<City> findAll();
    public List<City> findAllByCountry(Long id);
}
