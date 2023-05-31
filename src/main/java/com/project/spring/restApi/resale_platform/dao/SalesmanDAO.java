package com.project.spring.restApi.resale_platform.dao;

import com.project.spring.restApi.resale_platform.entity.Salesman;

import java.util.List;

public interface SalesmanDAO {
    List<Salesman> geAllSalesman();

    void saveSalesman(Salesman salesman);

    Salesman getSalesman(int id);

    void deleteSalesman(int id);
}
