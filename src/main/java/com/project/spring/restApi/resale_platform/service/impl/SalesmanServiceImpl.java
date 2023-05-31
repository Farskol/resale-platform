package com.project.spring.restApi.resale_platform.service.impl;

import com.project.spring.restApi.resale_platform.dao.SalesmanDAO;
import com.project.spring.restApi.resale_platform.entity.Salesman;
import com.project.spring.restApi.resale_platform.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SalesmanServiceImpl implements SalesmanService {
    @Autowired
    private SalesmanDAO salesmanDAO;

    @Override
    @Transactional
    public List<Salesman> getAllSalesman() {
        return salesmanDAO.geAllSalesman();
    }

    @Override
    @Transactional
    public Salesman getSalesman(int id) {
        return salesmanDAO.getSalesman(id);
    }

    @Override
    @Transactional
    public void deleteSalesman(int id) {
        salesmanDAO.deleteSalesman(id);
    }

    @Override
    @Transactional
    public void saveSalesman(Salesman salesman) {
        salesmanDAO.saveSalesman(salesman);
    }
}
