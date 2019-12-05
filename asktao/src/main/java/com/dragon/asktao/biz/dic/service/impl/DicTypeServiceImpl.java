package com.dragon.asktao.biz.dic.service.impl;

import com.dragon.asktao.biz.dic.mapper.DicTypeMapper;
import com.dragon.asktao.biz.dic.service.DicTypeService;
import com.dragon.asktao.common.entity.dto.DicTypeDto;
import com.dragon.asktao.common.entity.po.DicTypePo;
import com.dragon.asktao.common.util.CommonUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.UUID;


@Service
@Transactional
public class DicTypeServiceImpl implements DicTypeService {
    @Resource
    private DicTypeMapper dicTypeMapper;

    @Override
    public DicTypeDto insertData(DicTypeDto dto) {
        dto.setId(CommonUtil.getUUID());
        if(dto.getCreateTime() == null){
            dto.setCreateTime(new Date());
        }
        dicTypeMapper.insertData(dto);
        return dto;
    }

    @Override
    public List<DicTypeDto> getDtoDataByCondition(DicTypeDto dto, String orderBy) {
        if(dto == null){
            dto = new DicTypeDto();
        }
        if(StringUtils.isNotBlank(orderBy)){
            dto.setOrderBy(orderBy);
        }
        List<DicTypeDto> list = dicTypeMapper.getPoDataByCondition(dto);
        return list;
    }

    @Override
    public PageInfo<DicTypeDto> getPageDataByCondition(DicTypeDto dto, String orderBy, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<DicTypeDto> data = getDtoDataByCondition(dto, orderBy);
        PageInfo<DicTypeDto> page = new PageInfo<>(data);
        return page;
    }
}
