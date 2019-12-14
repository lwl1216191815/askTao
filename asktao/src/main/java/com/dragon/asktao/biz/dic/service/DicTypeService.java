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
    DicTypeDto insert(DicTypeDto dicTypePo);

    List<DicTypeDto> find(DicTypeDto dto, String orderBy);

    PageInfo<DicTypeDto> findWithPage(DicTypeDto dto, String orderBy, Integer pageNum, Integer pageSize);

    int delete(DicTypeDto dto);
}
