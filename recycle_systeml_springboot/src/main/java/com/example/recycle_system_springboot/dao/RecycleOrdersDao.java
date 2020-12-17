package com.example.recycle_system_springboot.dao;

import com.example.recycle_system_springboot.pojo.entity.RecycleOrders;
import com.example.recycle_system_springboot.pojo.vo.DoingOrdersVo;
import com.example.recycle_system_springboot.pojo.vo.RecycleOrdersVo;

import java.util.List;

public interface RecycleOrdersDao {
    int deleteByPrimaryKey(Integer recycleOrderId);

    int insert(RecycleOrders record);

    int insertSelective(RecycleOrders record);

    RecycleOrders selectByPrimaryKey(Integer recycleOrderId);

    int updateByPrimaryKeySelective(RecycleOrders record);

    int updateByPrimaryKey(RecycleOrders record);

    List<RecycleOrdersVo> selectOrderByUserId(Integer userid);

    List<DoingOrdersVo> selectDoingOrderByUserId(Integer userid);
}
