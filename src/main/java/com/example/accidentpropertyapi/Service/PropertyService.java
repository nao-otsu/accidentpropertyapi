package com.example.accidentpropertyapi.Service;

import com.example.accidentpropertyapi.Model.Property;
import com.example.accidentpropertyapi.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    PropertyRepository propertyRepository;

    public List<Property> propertyFindAll(){
        return propertyRepository.propertyFindAll();
    }
}
