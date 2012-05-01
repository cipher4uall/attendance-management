/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.dao.impl;

import com.opgea.attendance.dao.EmployeeDAO;
import com.opgea.attendance.domain.entities.Employee;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Ramesh
 */
@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Employee create(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        tx.begin();
        session.save(employee);
        tx.commit();
        session.close();
        return employee;
    }

    @Override
    public Employee update(Employee employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        tx.begin();
        session.update(employee);
        tx.commit();
        session.close();
        return employee;
    }

    @Override
    public Employee remove(Long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Employee find(Long id) {
        Session session = sessionFactory.openSession();
        //Query query = session.getNamedQuery("Employee.findById");
        //query.setParameter("id", id);
        Query query = session.createQuery("from Employee e WHERE e.id="+id);
        Employee employee = (Employee)query.uniqueResult();
        session.close();
        return employee;
    }

    @Override
    public List<Employee> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
