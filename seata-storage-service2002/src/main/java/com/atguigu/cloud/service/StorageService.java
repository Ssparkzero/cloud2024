package com.atguigu.cloud.service;

/**
 * @Author：cjy
 * @Project：cloud2024
 * @Date：2024/11/16 11:07
 * @Description：
 */
public interface StorageService {
    /**
     * 扣减库存
     */
    void decrease(Long productId, Integer count);
}
