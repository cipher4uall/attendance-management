/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.domain.entities;

import com.opgea.attendance.domain.qualifier.AbsentType;
import java.io.Serializable;
import java.sql.Timestamp;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 *
 * @author Ramesh
 */
@Entity
public class Attendance implements Serializable {
    
    
    @EmbeddedId
    private AttendancePK attendancePK;
    private Timestamp inTime;
    private Timestamp outTime;
    private AbsentType absentType;

    public Attendance() {
    }

    public Attendance(AttendancePK attendancePK, Timestamp inTime, Timestamp outTime, AbsentType absentType) {
        this.attendancePK = attendancePK;
        this.inTime = inTime;
        this.outTime = outTime;
        this.absentType = absentType;
    }

    public AbsentType getAbsentType() {
        return absentType;
    }

    public void setAbsentType(AbsentType absentType) {
        this.absentType = absentType;
    }

    public AttendancePK getAttendancePK() {
        return attendancePK;
    }

    public void setAttendancePK(AttendancePK attendancePK) {
        this.attendancePK = attendancePK;
    }

    public Timestamp getInTime() {
        return inTime;
    }

    public void setInTime(Timestamp inTime) {
        this.inTime = inTime;
    }

    public Timestamp getOutTime() {
        return outTime;
    }

    public void setOutTime(Timestamp outTime) {
        this.outTime = outTime;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Attendance other = (Attendance) obj;
        if (this.attendancePK != other.attendancePK && (this.attendancePK == null || !this.attendancePK.equals(other.attendancePK))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 41 * hash + (this.attendancePK != null ? this.attendancePK.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Attendance{" + "attendancePK=" + attendancePK + ", inTime=" + inTime + ", outTime=" + outTime + ", absentType=" + absentType + '}';
    }
    
    
}
