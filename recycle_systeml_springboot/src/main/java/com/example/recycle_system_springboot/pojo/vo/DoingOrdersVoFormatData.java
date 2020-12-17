package com.example.recycle_system_springboot.pojo.vo;

import lombok.Data;

import java.util.List;

@Data
public class DoingOrdersVoFormatData {
    private Integer recycleOrderId;

    private String addressDetails;

    private String collectorName;

    private String scheduledTime;

    private String phone;

    private List<RecycleOrdersDetailVo> recycleOrdersDetailVoList;

    public Integer getRecycleOrderId() {
        return recycleOrderId;
    }

    public void setRecycleOrderId(Integer recycleOrderId) {
        this.recycleOrderId = recycleOrderId;
    }

    public String getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(String addressDetails) {
        this.addressDetails = addressDetails;
    }

    public String getCollectorName() {
        return collectorName;
    }

    public void setCollectorName(String collectorName) {
        this.collectorName = collectorName;
    }

    public String getScheduledTime() {
        return scheduledTime;
    }

    public void setScheduledTime(String scheduledTime) {
        this.scheduledTime = scheduledTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public List<RecycleOrdersDetailVo> getRecycleOrdersDetailVoList() {
        return recycleOrdersDetailVoList;
    }

    public void setRecycleOrdersDetailVoList(List<RecycleOrdersDetailVo> recycleOrdersDetailVoList) {
        this.recycleOrdersDetailVoList = recycleOrdersDetailVoList;
    }
}
