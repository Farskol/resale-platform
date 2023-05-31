package com.project.spring.restApi.resale_platform.mapper;

import com.project.spring.restApi.resale_platform.dto.salesmanDTO.RegisteredSalesmanDTO;
import com.project.spring.restApi.resale_platform.dto.salesmanDTO.SalesmanDTO;
import com.project.spring.restApi.resale_platform.entity.Product;
import com.project.spring.restApi.resale_platform.entity.Salesman;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SalesmanMapper {
    public SalesmanDTO toDTO(Salesman salesman){
        if(salesman != null){//todo
            List<Integer> productsId = salesman.getProducts()
                    .stream()
                    .map(Product::getId)
                    .toList();

            return new SalesmanDTO(
                    salesman.getId(),
                    salesman.getFirstName(),
                    salesman.getSecondName(),
                    salesman.getEmail(),
                    salesman.getPhoneNumber(),
                    productsId
            );
        }else {
            return null;
        }
    }

    public Salesman toSalesman(RegisteredSalesmanDTO allSalesmanDTO){

        return new Salesman(
                allSalesmanDTO.getFirstName(),
                allSalesmanDTO.getSecondName(),
                allSalesmanDTO.getEmail(),
                allSalesmanDTO.getPhoneNumber(),
                allSalesmanDTO.getPassword(),
                allSalesmanDTO.getLogin(),
                null,
                false
        );
    }
}
