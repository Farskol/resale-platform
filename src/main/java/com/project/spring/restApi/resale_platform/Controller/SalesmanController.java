package com.project.spring.restApi.resale_platform.Controller;

import com.project.spring.restApi.resale_platform.Controller.command.SalesmanCommand;
import com.project.spring.restApi.resale_platform.dto.salesmanDTO.SalesmanDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/salesman")
public class SalesmanController {
    @Autowired
    private SalesmanCommand salesmanCommand;

    @GetMapping("")
    public List<SalesmanDTO> getAllSalesman(){
        return salesmanCommand.getAllSalesman();
    }

    @GetMapping("/{id}")
    public SalesmanDTO getSalesman(@PathVariable int id){
        return salesmanCommand.getSalesman(id);
    }
}
