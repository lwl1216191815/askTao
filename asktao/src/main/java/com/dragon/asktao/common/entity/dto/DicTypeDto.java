package com.dragon.asktao.common.entity.dto;

import com.dragon.asktao.common.entity.po.DicTypePo;

public class DicTypeDto extends DicTypePo {
    /**
     * 模糊查询名称
     */
    private String likeName;
    /**
     * 排序
     */
    private String orderBy;

    public String getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(String orderBy) {
        this.orderBy = orderBy;
    }

    public String getLikeName() {
        return likeName;
    }

    public void setLikeName(String likeName) {
        this.likeName = likeName;
    }
}
