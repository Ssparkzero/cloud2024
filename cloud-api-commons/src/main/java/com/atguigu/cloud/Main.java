package com.atguigu.cloud;

import java.time.ZonedDateTime;

/**
 * @author cjy
 * @date 2024/11/7 10:13
 */
public class Main {
    public static void main(String[] args) {
        ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
        System.out.println(zbj);
    }
}