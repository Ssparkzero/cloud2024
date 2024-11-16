package com.atguigu.cloud.service;

import com.atguigu.cloud.entities.Order;

/**
 * @Author：cjy
 * @Project：cloud2024
 * @Date：2024/11/16 10:35
 * @Description：
 */
public interface OrderService {

    /**
     * 创建订单
     */
    void create(Order order);

}
