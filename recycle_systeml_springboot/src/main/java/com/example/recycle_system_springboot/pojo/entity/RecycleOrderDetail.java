package com.example.recycle_system_springboot.pojo.entity;

import java.io.Serializable;

/**
 * recycle_order_detail
 * @author 
 */
public class RecycleOrderDetail implements Serializable {
    private Integer recycleOrderDetailId;

    private Integer itemId;

    private Integer recycleOrderId;

    private Integer quantity;

    private static final long serialVersionUID = 1L;

    public Integer getRecycleOrderDetailId() {
        return recycleOrderDetailId;
    }

    public void setRecycleOrderDetailId(Integer recycleOrderDetailId) {
        this.recycleOrderDetailId = recycleOrderDetailId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Integer getRecycleOrderId() {
        return recycleOrderId;
    }

    public void setRecycleOrderId(Integer recycleOrderId) {
        this.recycleOrderId = recycleOrderId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}