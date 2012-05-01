/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.domain.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

/**
 *
 * @author Ramesh
 */
@Embeddable
public class AttendancePK implements Serializable {
    
    private String loginId;
    private Date dateOfAttendance;

    public AttendancePK() {
    }

    public AttendancePK(String loginId, Date dateOfAttendance) {
        this.loginId = loginId;
        this.dateOfAttendance = dateOfAttendance;
    }

    public Date getDateOfAttendance() {
        return dateOfAttendance;
    }

    public void setDateOfAttendance(Date dateOfAttendance) {
        this.dateOfAttendance = dateOfAttendance;
    }

    public String getLoginId() {
        return loginId;
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AttendancePK other = (AttendancePK) obj;
        if ((this.loginId == null) ? (other.loginId != null) : !this.loginId.equals(other.loginId)) {
            return false;
        }
        if (this.dateOfAttendance != other.dateOfAttendance && (this.dateOfAttendance == null || !this.dateOfAttendance.equals(other.dateOfAttendance))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.loginId != null ? this.loginId.hashCode() : 0);
        hash = 97 * hash + (this.dateOfAttendance != null ? this.dateOfAttendance.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "AttendancePK{" + "loginId=" + loginId + ", dateOfAttendance=" + dateOfAttendance + '}';
    }
    
    
}
