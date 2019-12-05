package com.dragon.asktao.common.util;

import java.util.UUID;

/**
 * 通用工具类
 */
public class CommonUtil {
    /**
     * 获取36位的UUID
     * @return
     */
    public static String getUUID(){
        return UUID.randomUUID().toString();
    }
}
