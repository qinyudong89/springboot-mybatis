package com.example.springbootmybatis.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.springbootmybatis.dao.model.OrderModel;
import com.example.springbootmybatis.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Auther: 覃钰栋
 * @Date: 2020/9/1 17:16
 */
@Slf4j
@RequestMapping("/order")
@RestController
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/edit")
    public String edit(@RequestBody OrderModel orderModel){
        String msg = "edit，";
        try {
            log.info(msg + "入参：{}", JSONObject.toJSONString(orderModel));
            orderModel = orderService.edit(orderModel);
        } catch (Exception e) {
            log.error(msg + "异常：{}", e);
        }
        return JSONObject.toJSONString(orderModel);
    }
}
