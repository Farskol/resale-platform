package com.project.spring.restApi.resale_platform.dao.impl;

import com.project.spring.restApi.resale_platform.dao.ProductDAO;
import com.project.spring.restApi.resale_platform.entity.Product;
import jakarta.persistence.EntityManager;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class ProductDAOImpl implements ProductDAO {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Product> getAllProducts() {
        Session session = entityManager.unwrap(Session.class);
        return session.createQuery("from Product", Product.class).getResultList();
    }

    @Override
    public void saveProduct(Product product) {
        Session session = entityManager.unwrap(Session.class);
        session.saveOrUpdate(product);
    }

    @Override
    public Product getProduct(int id) {
        Session session = entityManager.unwrap(Session.class);
        return session.get(Product.class, id);
    }

    @Override
    public void deleteProduct(int id) {
        Session session = entityManager.unwrap(Session.class);
        session.createQuery("delete from Product where id =:ProductId")
                .setParameter("ProductID",id)
                .executeUpdate();
    }
}
