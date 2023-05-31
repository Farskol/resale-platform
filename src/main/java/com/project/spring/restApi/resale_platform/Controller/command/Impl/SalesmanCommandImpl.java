package com.project.spring.restApi.resale_platform.Controller.command.Impl;

import com.project.spring.restApi.resale_platform.Controller.command.SalesmanCommand;
import com.project.spring.restApi.resale_platform.dto.salesmanDTO.RegisteredSalesmanDTO;
import com.project.spring.restApi.resale_platform.dto.salesmanDTO.SalesmanDTO;
import com.project.spring.restApi.resale_platform.mapper.SalesmanMapper;
import com.project.spring.restApi.resale_platform.service.SalesmanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesmanCommandImpl implements SalesmanCommand {

    @Autowired
    private SalesmanService salesmanService;
    @Autowired
    private SalesmanMapper salesmanMapper;

    @Override
    public List<SalesmanDTO> getAllSalesman() {
        return salesmanService.getAllSalesman()
                .stream()
                .map(salesman -> salesmanMapper.toDTO(salesman))
                .toList();
    }

    @Override
    public SalesmanDTO getSalesman(int id) {
        return salesmanMapper.toDTO(salesmanService.getSalesman(id));
    }

    @Override
    public void saveSalesman(RegisteredSalesmanDTO registeredSalesmanDTO) {
        //todo
    }

    @Override
    public void deleteSalesman(int id) {
        //todo
    }
}
