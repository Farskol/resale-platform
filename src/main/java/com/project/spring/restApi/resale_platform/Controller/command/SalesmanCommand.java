package com.project.spring.restApi.resale_platform.Controller.command;

import com.project.spring.restApi.resale_platform.dto.salesmanDTO.RegisteredSalesmanDTO;
import com.project.spring.restApi.resale_platform.dto.salesmanDTO.SalesmanDTO;

import java.util.List;

public interface SalesmanCommand {
    List<SalesmanDTO> getAllSalesman();

    SalesmanDTO getSalesman(int id);

    void saveSalesman(RegisteredSalesmanDTO registeredSalesmanDTO);
    void deleteSalesman(int id);
}
