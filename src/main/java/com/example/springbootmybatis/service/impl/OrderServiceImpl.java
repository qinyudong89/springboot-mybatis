package com.example.springbootmybatis.service.impl;

import com.example.springbootmybatis.dao.mapper.OrderMapper;
import com.example.springbootmybatis.dao.model.OrderModel;
import com.example.springbootmybatis.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Description:
 * @Auther: 覃钰栋
 * @Date: 2020/9/1 17:07
 */
@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public OrderModel edit(OrderModel orderModel) {
        if (orderModel.getOrderNo() == null){
            orderMapper.insertSelective(orderModel);
            orderModel.setCreateTime(new Date());
        }else {
            orderMapper.updateByPrimaryKeySelective(orderModel);
        }
        return orderModel;
    }
}
