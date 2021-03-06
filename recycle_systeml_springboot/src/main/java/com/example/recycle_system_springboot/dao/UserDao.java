package com.example.recycle_system_springboot.dao;

import com.example.recycle_system_springboot.pojo.entity.User;
import com.example.recycle_system_springboot.pojo.vo.UserVo;
import com.github.pagehelper.Page;
import org.apache.ibatis.annotations.Param;

public interface UserDao {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByUserName(String username);

    UserVo selectAddress(Integer userId);

    int updatePhoneByPrimaryKey(@Param("userId") int userId,@Param("phone") String phone);

}
