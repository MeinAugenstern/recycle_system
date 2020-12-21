package com.example.recycle_system_springboot.controller;


import com.example.recycle_system_springboot.dao.AdminDao;
import com.example.recycle_system_springboot.dao.CollectorDao;
import com.example.recycle_system_springboot.dao.UserDao;

import com.example.recycle_system_springboot.pojo.dto.LoginMsg;
import com.example.recycle_system_springboot.pojo.entity.Admin;
import com.example.recycle_system_springboot.pojo.entity.Collector;
import com.example.recycle_system_springboot.pojo.entity.User;
import com.example.recycle_system_springboot.service.LoginService;
import com.example.recycle_system_springboot.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    LoginService loginService;

    @GetMapping("/checklogin/{identity}/{username}/{password}")
    @ResponseBody
    public LoginMsg CheckLogin(@PathVariable("identity") int identity, @PathVariable("username") String username, @PathVariable("password") String password) {
        LoginMsg result = loginService.CheckLogin(identity,username,password);
        return result;
    }
}
