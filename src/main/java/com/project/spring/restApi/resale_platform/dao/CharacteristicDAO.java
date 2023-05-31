package com.project.spring.restApi.resale_platform.dao;

import com.project.spring.restApi.resale_platform.entity.Characteristic;

import java.util.List;

public interface CharacteristicDAO {
    List<Characteristic> getCharacteristicsByProductId(int id);
    void saveCharacteristic(Characteristic characteristic);
    Characteristic getCharacteristic(int id);
    void deleteCharacteristic(int id);


}
