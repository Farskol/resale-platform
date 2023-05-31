package com.project.spring.restApi.resale_platform.dao.impl;

import com.project.spring.restApi.resale_platform.dao.SalesmanDAO;
import com.project.spring.restApi.resale_platform.entity.Salesman;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
public class SalesmanDAOImpl implements SalesmanDAO {

    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Salesman> geAllSalesman() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Salesman", Salesman.class).getResultList();
    }

    @Override
    public void saveSalesman(Salesman salesman) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(salesman);

    }

    @Override
    public Salesman getSalesman(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Salesman.class, id);
    }

    @Override
    public void deleteSalesman(int id) {
        Session session = entityManager.unwrap(Session.class);
        session.createQuery("delete from Salesman where id =:SalesmanId")
                .setParameter("SalesmanId",id)
                .executeUpdate();
    }
}
