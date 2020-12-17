package com.example.recycle_system_springboot.controller;


import com.example.recycle_system_springboot.dao.AdminDao;
import com.example.recycle_system_springboot.dao.CollectorDao;
import com.example.recycle_system_springboot.dao.UserDao;

import com.example.recycle_system_springboot.pojo.dto.LoginMsg;
import com.example.recycle_system_springboot.pojo.entity.Admin;
import com.example.recycle_system_springboot.pojo.entity.Collector;
import com.example.recycle_system_springboot.pojo.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    UserDao userDao;
    @Resource
    AdminDao adminDao;
    @Resource
    CollectorDao collectorDao;

    @GetMapping("/checklogin/{identity}/{username}/{password}")
    @ResponseBody
    public LoginMsg CheckLogin(@PathVariable("identity") int identity, @PathVariable("username") String username, @PathVariable("password") String password){
        LoginMsg msg = new LoginMsg();
        if(identity==1){
            User user=userDao.selectByUserName(username);
            if(user.getPassword().equals(password)){
                msg.setId(user.getUserId());
                msg.setIdentity(identity);
                msg.setName(user.getUserRealname());
                return msg;
            }
            else {
                return null;
            }
        }
        else if(identity==2){
            Collector collector = collectorDao.selectByUserName(username);
            if (collector.getPassword().equals(password)) {
                msg.setId(collector.getCollectorPersonId());
                msg.setIdentity(identity);
                msg.setName(collector.getCollectorName());
                return msg;
            } else {
                return null;
            }
        }
        else if(identity==3) {
            Admin admin=adminDao.selectByUserName(username);
            if(admin.getPassword().equals(password)){
                msg.setIdentity(identity);
                msg.setId(admin.getAdminId());
                msg.setName(admin.getUserName());
                return msg;
            }else {
                return null;
            }
        }
        return null;
    }

}
