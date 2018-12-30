package com.example.accidentpropertyapi.Repository;

import com.example.accidentpropertyapi.Model.Property;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface PropertyRepository {

    @Select("select * from PROPERTY_INFO where delete_flag is NULL")
    @Results({
            @Result(property = "propertyId", column = "property_id"),
            @Result(property = "imageUrl", column = "image_url"),
            @Result(property = "addUser", column = "add_user"),
            @Result(property = "addDate", column = "add_date"),
            @Result(property = "updateUser", column = "update_user"),
            @Result(property = "updateDate", column = "update_date")
    })
    List<Property> propertyFindAll();
}
