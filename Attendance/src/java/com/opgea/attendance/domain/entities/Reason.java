/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.domain.entities;

import com.opgea.attendance.domain.qualifier.ReasonOf;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Ramesh
 */
@Entity
public class Reason implements Serializable{
    
    @Id
    private Long id;
    private ReasonOf reasonType;
    private String reason;
    @ManyToOne
    private Attendance attendance;

    public Reason() {
    }

    public Attendance getAttendance() {
        return attendance;
    }

    public void setAttendance(Attendance attendance) {
        this.attendance = attendance;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public ReasonOf getReasonType() {
        return reasonType;
    }

    public void setReasonType(ReasonOf reasonType) {
        this.reasonType = reasonType;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Reason other = (Reason) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "Reason{" + "id=" + id + ", reasonType=" + reasonType + ", reason=" + reason + ", attendance=" + attendance + '}';
    }
    
    
}
