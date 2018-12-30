package com.example.accidentpropertyapi.Controller;

import com.example.accidentpropertyapi.Model.Property;
import com.example.accidentpropertyapi.Service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PropertyController {

    @Autowired
    PropertyService propertyService;

    @RequestMapping(value = "/property", method = RequestMethod.GET)
    public List<Property> propertyFindAll(){
        return propertyService.propertyFindAll();
    }
}
