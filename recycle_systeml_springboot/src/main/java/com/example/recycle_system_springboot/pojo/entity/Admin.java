package com.example.recycle_system_springboot.pojo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * admin
 * @author
 */
@Data
public class Admin implements Serializable {
    private Integer adminId;

    private String userName;

    private String password;

    private static final long serialVersionUID = 1L;

}
