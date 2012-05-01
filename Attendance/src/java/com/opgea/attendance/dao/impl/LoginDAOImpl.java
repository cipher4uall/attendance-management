/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.opgea.attendance.dao.impl;

import com.opgea.attendance.dao.LoginDAO;
import com.opgea.attendance.domain.entities.Login;
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
public class LoginDAOImpl implements LoginDAO{

    @Autowired
    private SessionFactory sessionFactory;
    
    @Override
    public Login create(Login login) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.getTransaction();
        tx.begin();
        session.save(login);
        tx.commit();
        session.close();
        return login;
    }

    @Override
    public Login update(Login login) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Login remove(String loginId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Login find(String loginId) {
        Session session = sessionFactory.openSession();
        Query query = session.getNamedQuery("Login.findByLoginId");
        query.setParameter("loginId", loginId);
        Login login = (Login) query.uniqueResult();
        session.close();
        return login;
    }

    @Override
    public List<Login> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
   
}
