/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.web.controller;

import com.opgea.attendance.domain.modal.JsonModelMap;
import com.opgea.attendance.service.CompanyService;
import com.opgea.attendence.web.controller.dto.CompanyDTO;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author Ramesh
 */
@Controller
@RequestMapping(value="/company")
public class CompanyController {
    
    
    @Autowired
    private CompanyService companyService;
    
    @RequestMapping(method= RequestMethod.GET)
    private String show(){
        return "company";
    }
    
    @RequestMapping(method= RequestMethod.POST, value="create")
    public @ResponseBody Map<String, Object> create(CompanyDTO companyDTO){
        companyService.create(companyDTO); 
        System.out.println("Cms >> PostCreate:");
        return JsonModelMap.success().data(companyDTO.getEmail());
    }
}
