package com.project.spring.restApi.resale_platform.dao.impl;

import com.project.spring.restApi.resale_platform.dao.CharacteristicDAO;
import com.project.spring.restApi.resale_platform.entity.Characteristic;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CharacteristicDAOImpl implements CharacteristicDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Characteristic> getCharacteristicsByProductId(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Characteristic where product.id =: ProductId",Characteristic.class)
                .setParameter("ProductId", id).getResultList();
    }

    @Override
    public void saveCharacteristic(Characteristic characteristic) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(characteristic);
    }

    @Override
    public Characteristic getCharacteristic(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Characteristic.class, id);
    }

    @Override
    public void deleteCharacteristic(int id) {
        Session session = entityManager.unwrap(Session.class);
        session.createQuery("delete from Characteristic where id =: CharacteristicId")
                .setParameter("CharacteristicId", id).executeUpdate();
    }
}
