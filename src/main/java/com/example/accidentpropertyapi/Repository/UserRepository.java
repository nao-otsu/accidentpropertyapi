package com.example.accidentpropertyapi.Repository;

import com.example.accidentpropertyapi.Model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserRepository {

    @Select("select * from USER_INFO where delete_flag is null")
    @Results({
            @Result(property = "userId", column = "user_id"),
            @Result(property = "addUser", column = "add_user"),
            @Result(property = "addDate", column = "add_date"),
            @Result(property = "updateUser", column = "update_user"),
            @Result(property = "updateDate", column = "update_date")
    })
    List<User> userAll();
}
