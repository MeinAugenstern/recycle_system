package com.example.recycle_system_springboot.pojo.vo;

import lombok.Data;

@Data
public class RecycleOrdersDetailVo {
    private String itemName;

    private Double itemPrice;

    private Integer quantity;
}
