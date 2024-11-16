package com.atguigu.cloud.service;

import org.apache.ibatis.annotations.Param;
/**
 * @Author：cjy
 * @Project：cloud2024
 * @Date：2024/11/16 12:00
 * @Description：
 */
public interface AccountService {
    /**
     * 扣减账户余额
     * @param userId 用户id
     * @param money 本次消费金额
     */
    void decrease(@Param("userId") Long userId, @Param("money") Long money);
}
