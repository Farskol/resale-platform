package com.project.spring.restApi.resale_platform.Controller.command.Impl;

import com.project.spring.restApi.resale_platform.Controller.command.CharacteristicCommand;
import com.project.spring.restApi.resale_platform.dto.characteristicDTO.CharacteristicDTO;
import com.project.spring.restApi.resale_platform.mapper.CharacteristicMapper;
import com.project.spring.restApi.resale_platform.service.CharacteristicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CharacteristicCommandImpl implements CharacteristicCommand {
    @Autowired
    private CharacteristicService characteristicService;

    @Autowired
    private CharacteristicMapper characteristicMapper;

    @Override
    public List<CharacteristicDTO> getCharacteristicsByProductId(int id) {
        return characteristicService.getCharacteristicsByProductId(id)
                .stream()
                .map(characteristic -> characteristicMapper.toDTO(characteristic))
                .toList();
    }

    @Override
    public void saveCharacteristic(CharacteristicDTO characteristicDTO) {
        characteristicService.saveCharacteristic(characteristicMapper.toCharacteristic(characteristicDTO));
    }

    @Override
    public CharacteristicDTO getCharacteristic(int id) {
        return characteristicMapper.toDTO(characteristicService.getCharacteristic(id));
    }

    @Override
    public void deleteCharacteristic(int id) {
        characteristicService.deleteCharacteristic(id);
    }
}
