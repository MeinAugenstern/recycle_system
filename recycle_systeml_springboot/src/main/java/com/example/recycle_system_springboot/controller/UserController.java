package com.example.recycle_system_springboot.controller;

import com.example.recycle_system_springboot.dao.UserDao;
import com.example.recycle_system_springboot.pojo.vo.AddressVo;
import com.example.recycle_system_springboot.pojo.vo.UserVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class UserController {
    @Resource
    UserDao userDao;

    @GetMapping("/userAlladdress/{id}")
    @ResponseBody
    public UserVo userfindAlladdress(@PathVariable("id") int id){
        UserVo userVo = userDao.selectAddress(id);
        return userVo;
    }

}
