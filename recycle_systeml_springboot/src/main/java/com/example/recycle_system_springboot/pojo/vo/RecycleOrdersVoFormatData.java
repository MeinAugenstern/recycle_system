package com.example.recycle_system_springboot.pojo.vo;

import lombok.Data;

import java.util.List;


@Data
public class RecycleOrdersVoFormatData {
    private Integer recycleOrderId;

    private String addressDetails;

    private String collectorName;

    private String scheduledTime;

    private String finishedTime;

    private String phone;

    private List<RecycleOrdersDetailVo> recycleOrdersDetailVoList;
}
