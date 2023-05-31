package com.project.spring.restApi.resale_platform.service;

import com.project.spring.restApi.resale_platform.entity.Salesman;

import java.util.List;

public interface SalesmanService {

    List<Salesman> getAllSalesman();
    void saveSalesman(Salesman salesman);
    Salesman getSalesman(int id);

    void deleteSalesman(int id);

}
