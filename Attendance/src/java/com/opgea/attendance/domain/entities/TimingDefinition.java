/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.domain.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 *
 * @author Ramesh
 */
@Entity
public class TimingDefinition implements Serializable {
    
    @Id
    @GeneratedValue
    private Long id;
    private Long inTime;
    private Integer outTime;
    private Float workingHrs;
    private Float minWorkingHrs;
    private Integer lateCount;

    public TimingDefinition() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getInTime() {
        return inTime;
    }

    public void setInTime(Long inTime) {
        this.inTime = inTime;
    }

    public Integer getLateCount() {
        return lateCount;
    }

    public void setLateCount(Integer lateCount) {
        this.lateCount = lateCount;
    }

    public Float getMinWorkingHrs() {
        return minWorkingHrs;
    }

    public void setMinWorkingHrs(Float minWorkingHrs) {
        this.minWorkingHrs = minWorkingHrs;
    }

    public Integer getOutTime() {
        return outTime;
    }

    public void setOutTime(Integer outTime) {
        this.outTime = outTime;
    }

    public Float getWorkingHrs() {
        return workingHrs;
    }

    public void setWorkingHrs(Float workingHrs) {
        this.workingHrs = workingHrs;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final TimingDefinition other = (TimingDefinition) obj;
        if (this.id != other.id && (this.id == null || !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + (this.id != null ? this.id.hashCode() : 0);
        return hash;
    }

    @Override
    public String toString() {
        return "TimingDefinition{" + "id=" + id + ", inTime=" + inTime + ", outTime=" + outTime + ", workingHrs=" + workingHrs + ", minWorkingHrs=" + minWorkingHrs + ", lateCount=" + lateCount + '}';
    }
    
    
}
