package com.example.recycle_system_springboot.pojo.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class DoingOrdersVo {
    private Integer recycleOrderId;

    private String addressDetails;

    private String collectorName;

    private String scheduledTime;

    private String phone;

}
