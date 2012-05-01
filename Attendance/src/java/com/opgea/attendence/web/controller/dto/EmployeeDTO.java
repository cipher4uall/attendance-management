/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendence.web.controller.dto;

import java.util.Date;

/**
 *
 * @author Ramesh
 */
public class EmployeeDTO {
    
    
    private Long id;
    private Long companyId;
    private String firstName;
    private String middleInitial;
    private String lastName;
    private Date dateOfBirth;
    private Long branchId;
    
    private String email;
    private String phone1;
    private String phone2;
    
    private String empCode;
    private Long destinationId;
    private String destinationName;

    public EmployeeDTO() {
    }

    public EmployeeDTO(Long id, Long companyId, String firstName, String middleInitial, String lastName, Date dateOfBirth, Long branchId, String email, String phone1, String phone2, String empCode, Long destinationId, String destinationName) {
        this.id = id;
        this.companyId = companyId;
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.branchId = branchId;
        this.email = email;
        this.phone1 = phone1;
        this.phone2 = phone2;
        this.empCode = empCode;
        this.destinationId = destinationId;
        this.destinationName = destinationName;
    }

   

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public Long getDestinationId() {
        return destinationId;
    }

    public void setDestinationId(Long destinationId) {
        this.destinationId = destinationId;
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getPhone1() {
        return phone1;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public Long getBranchId() {
        return branchId;
    }

    public void setBranchId(Long branchId) {
        this.branchId = branchId;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" + "id=" + id + ", companyId=" + companyId + ", firstName=" + firstName + ", middleInitial=" + middleInitial + ", lastName=" + lastName + ", emailId=" + email + ", phone1=" + phone1 + ", phone2=" + phone2 + ", empCode=" + empCode + ", destinationId=" + destinationId + ", destinationName=" + destinationName + '}';
    }

    
    
    
}
