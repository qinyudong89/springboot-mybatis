package com.example.springbootmybatis.dao.mapper;

import com.example.springbootmybatis.dao.model.OrderModel;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer orderNo);

    int insertSelective(OrderModel record);

    OrderModel selectByPrimaryKey(Integer orderNo);

    int updateByPrimaryKeySelective(OrderModel record);

}