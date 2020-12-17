package com.example.recycle_system_springboot.pojo.vo;


import com.example.recycle_system_springboot.pojo.entity.User;
import lombok.Data;

import java.util.List;
@Data
public class UserVo extends User {
    private List<AddressVo> addressList;
}
