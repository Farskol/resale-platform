package com.project.spring.restApi.resale_platform.Controller.command;

import com.project.spring.restApi.resale_platform.dto.characteristicDTO.CharacteristicDTO;

import java.util.List;

public interface CharacteristicCommand {

    List<CharacteristicDTO> getCharacteristicsByProductId(int id);
    void saveCharacteristic(CharacteristicDTO characteristicDTO);
    CharacteristicDTO getCharacteristic(int id);
    void deleteCharacteristic(int id);
}
