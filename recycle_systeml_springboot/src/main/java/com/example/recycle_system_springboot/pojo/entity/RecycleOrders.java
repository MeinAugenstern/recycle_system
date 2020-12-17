package com.example.recycle_system_springboot.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * recycle_orders
 * @author 
 */
public class RecycleOrders implements Serializable {
    private Integer recycleOrderId;

    private Integer addressId;

    private Integer collectorPersonId;

    private Integer evaluationId;

    private Integer userId;

    private Date scheduledTime;

    private Date finishedTime;

    private Double totalAmount;

    private static final long serialVersionUID = 1L;

    public Integer getRecycleOrderId() {
        return recycleOrderId;
    }

    public void setRecycleOrderId(Integer recycleOrderId) {
        this.recycleOrderId = recycleOrderId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getCollectorPersonId() {
        return collectorPersonId;
    }

    public void setCollectorPersonId(Integer collectorPersonId) {
        this.collectorPersonId = collectorPersonId;
    }

    public Integer getEvaluationId() {
        return evaluationId;
    }

    public void setEvaluationId(Integer evaluationId) {
        this.evaluationId = evaluationId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(Date scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public Date getFinishedTime() {
        return finishedTime;
    }

    public void setFinishedTime(Date finishedTime) {
        this.finishedTime = finishedTime;
    }

    public Double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }
}