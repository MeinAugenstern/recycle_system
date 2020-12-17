package com.example.recycle_system_springboot.pojo.vo;

import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
public class RecycleOrdersVo  {
    private Integer recycleOrderId;

    private String addressDetails;

    private String collectorName;

    private Date scheduledTime;

    private Date finishedTime;

    private String phone;

    private List<RecycleOrdersDetailVo> recycleOrdersDetailVoList;
}
