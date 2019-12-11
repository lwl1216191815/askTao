package com.dragon.asktao.biz.dic.controller;

import com.alibaba.fastjson.JSONObject;
import com.dragon.asktao.biz.dic.service.DicTypeService;
import com.dragon.asktao.common.entity.dto.DicTypeDto;
import com.dragon.asktao.common.entity.po.DicTypePo;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashSet;

@RestController
@RequestMapping("dicType")
public class DicTypeController {
    @Resource
    private DicTypeService dicTypeService;

    /**
     * 新增一条字典类型
     * @param json
     * @return
     */
    @RequestMapping("/insertData")
    public DicTypeDto insertData(String json){
        DicTypeDto dicTypeDto = JSONObject.parseObject(json, DicTypeDto.class);
        return dicTypeService.insertData(dicTypeDto);
    }

    /**
     * 获取分页数据
     * @param json
     * @param orderBy
     * @param pageNum
     * @param pageSize
     * @return
     */
    @RequestMapping("/getPageDataByCondition")
    public PageInfo<DicTypeDto> getPageDataByCondition(String json,String orderBy,Integer pageNum,Integer pageSize){
        if(pageNum == null || pageNum < 0 || pageSize == null || pageSize < 0){
            pageNum = 0;
            pageSize = 0;
        }
        DicTypeDto dicTypeDto = JSONObject.parseObject(json, DicTypeDto.class);
        return dicTypeService.getPageDataByCondition(dicTypeDto,orderBy,pageNum,pageSize);
    }

    /**
     * 根据记录ID删除数据
     * @param ids
     * @return
     */
    @RequestMapping("/deleteDataByIds")
    public Integer deleteDataByIds(String ids){
        int count = 0;
        if(StringUtils.isNotBlank(ids)){
            String[] idsArray = ids.split(",");
            HashSet<String> idsSet = new HashSet<>(Arrays.asList(idsArray));
            DicTypeDto dto = new DicTypeDto();
            dto.setIncludeIds(idsSet);
            //count = dicTypeService.deleteDataByDto(dto);
        }
        return count;
    }
}
