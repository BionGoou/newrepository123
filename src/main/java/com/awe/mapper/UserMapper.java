package com.awe.mapper;

import com.awe.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<User> queryAllUsers();

    User queryUserById(int id);

}
