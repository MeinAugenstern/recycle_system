package com.example.recycle_system_springboot.controller;

import com.example.recycle_system_springboot.dao.RecycleOrdersDao;
import com.example.recycle_system_springboot.pojo.entity.RecycleOrders;
import com.example.recycle_system_springboot.pojo.vo.DoingOrdersVo;
import com.example.recycle_system_springboot.pojo.vo.DoingOrdersVoFormatData;
import com.example.recycle_system_springboot.pojo.vo.RecycleOrdersVo;
import com.example.recycle_system_springboot.pojo.vo.RecycleOrdersVoFormatData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RecycleOrderController {
    @Resource
    RecycleOrdersDao recycleOrdersDao;

    @GetMapping("/userAllorders/{id}")
    @ResponseBody
    public List<RecycleOrdersVoFormatData> userfindAllOrders(@PathVariable("id") int id){
        List<RecycleOrdersVo> list = recycleOrdersDao.selectOrderByUserId(id);
        List<RecycleOrdersVoFormatData> result = new ArrayList<>();
        for(RecycleOrdersVo r:list){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formats = sdf.format(r.getScheduledTime());
            String formatf=null;
            if(r.getFinishedTime()!=null){
                 formatf = sdf.format(r.getFinishedTime());
            }
            RecycleOrdersVoFormatData re = new RecycleOrdersVoFormatData();
            re.setAddressDetails(r.getAddressDetails());
            re.setCollectorName(r.getCollectorName());
            re.setPhone(r.getPhone());
            re.setRecycleOrderId(r.getRecycleOrderId());
            re.setScheduledTime(formats);
            re.setFinishedTime(formatf);
            re.setRecycleOrdersDetailVoList(r.getRecycleOrdersDetailVoList());
            result.add(re);

        }
        return result;
    }

    @GetMapping("/userDoingorders/{id}")
    @ResponseBody
    public List<DoingOrdersVoFormatData> userfindDoingOrders(@PathVariable("id") int id){
        List<DoingOrdersVo> list = recycleOrdersDao.selectDoingOrderByUserId(id);
        List<DoingOrdersVoFormatData> result = new ArrayList<>();
        for(DoingOrdersVo d:list){
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String formats = sdf.format(d.getScheduledTime());
            DoingOrdersVoFormatData doingOrdersVoFormatData = new DoingOrdersVoFormatData();
            doingOrdersVoFormatData.setAddressDetails(d.getAddressDetails());
            doingOrdersVoFormatData.setCollectorName(d.getCollectorName());
            doingOrdersVoFormatData.setPhone(d.getPhone());
            doingOrdersVoFormatData.setRecycleOrderId(d.getRecycleOrderId());
            doingOrdersVoFormatData.setScheduledTime(formats);
            doingOrdersVoFormatData.setRecycleOrdersDetailVoList(d.getRecycleOrdersDetailVoList());
            result.add(doingOrdersVoFormatData);
        }
        return result;
    }
}
