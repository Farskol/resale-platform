package com.project.spring.restApi.resale_platform.Controller;

import com.project.spring.restApi.resale_platform.Controller.command.CharacteristicCommand;
import com.project.spring.restApi.resale_platform.dto.characteristicDTO.CharacteristicDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/characteristic")
public class CharacteristicController {

    @Autowired
    private CharacteristicCommand characteristicCommand;

    @GetMapping("/by-product/{id}")
    public List<CharacteristicDTO> getAllCharacteristicByProductId(@PathVariable int id){
        return characteristicCommand.getCharacteristicsByProductId(id);
    }

    @GetMapping("/{id}")
    public CharacteristicDTO getCharacteristic(@PathVariable int id){
        return characteristicCommand.getCharacteristic(id);
    }
}
