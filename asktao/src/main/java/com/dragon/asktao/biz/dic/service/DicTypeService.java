package com.dragon.asktao.biz.dic.service;


import com.dragon.asktao.common.entity.dto.DicTypeDto;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DicTypeService {
    /**
     * 新增一条字典类型
     * @param dicTypePo 字典类型实体
     * @return
     */
    DicTypeDto insertData(DicTypeDto dicTypePo);

    List<DicTypeDto> getDtoDataByCondition(DicTypeDto dto,String orderBy);

    PageInfo<DicTypeDto> getPageDataByCondition(DicTypeDto dto,String orderBy,Integer pageNum,Integer pageSize);
}
