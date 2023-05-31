package com.project.spring.restApi.resale_platform.service.impl;

import com.project.spring.restApi.resale_platform.dao.CharacteristicDAO;
import com.project.spring.restApi.resale_platform.entity.Characteristic;
import com.project.spring.restApi.resale_platform.service.CharacteristicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacteristicServiceImpl implements CharacteristicService {
    @Autowired
    private CharacteristicDAO characteristicDAO;
    @Override
    public List<Characteristic> getCharacteristicsByProductId(int id) {
        return characteristicDAO.getCharacteristicsByProductId(id);
    }

    @Override
    public void saveCharacteristic(Characteristic characteristic) {
        characteristicDAO.saveCharacteristic(characteristic);
    }

    @Override
    public Characteristic getCharacteristic(int id) {
        return characteristicDAO.getCharacteristic(id);
    }

    @Override
    public void deleteCharacteristic(int id) {
        characteristicDAO.deleteCharacteristic(id);
    }
}
