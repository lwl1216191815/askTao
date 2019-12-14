package com.dragon.asktao.biz.dic.service.impl;

import com.dragon.asktao.biz.dic.mapper.DicTypeMapper;
import com.dragon.asktao.biz.dic.service.DicTypeService;
import com.dragon.asktao.common.entity.dto.DicTypeDto;
import com.dragon.asktao.common.util.CommonUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


@Service
@Transactional
public class DicTypeServiceImpl implements DicTypeService {
    @Resource
    private DicTypeMapper dicTypeMapper;

    @Override
    public DicTypeDto insert(DicTypeDto dto) {
        dto.setId(CommonUtil.getUUID());
        if(dto.getCreateTime() == null){
            dto.setCreateTime(new Date());
        }
        dicTypeMapper.insert(dto);
        return dto;
    }

    @Override
    public List<DicTypeDto> find(DicTypeDto dto, String orderBy) {
        if(dto == null){
            dto = new DicTypeDto();
        }
        if(StringUtils.isNotBlank(orderBy)){
            dto.setOrderBy(orderBy);
        }
        List<DicTypeDto> list = dicTypeMapper.find(dto);
        return list;
    }

    @Override
    public PageInfo<DicTypeDto> findWithPage(DicTypeDto dto, String orderBy, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum,pageSize);
        List<DicTypeDto> data = find(dto, orderBy);
        PageInfo<DicTypeDto> page = new PageInfo<>(data);
        return page;
    }

    @Override
    public int delete(DicTypeDto dto) {
        if(dto == null){
            dto = new DicTypeDto();
        }
        return dicTypeMapper.delete(dto);
    }
}
