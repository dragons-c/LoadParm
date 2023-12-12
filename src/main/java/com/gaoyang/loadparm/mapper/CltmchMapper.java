package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Cltmch;
import com.gaoyang.loadparm.entity.CltmchExample;
import com.gaoyang.loadparm.entity.CltmchKey;
import java.util.List;

public interface CltmchMapper {
    int deleteByPrimaryKey(CltmchKey key);

    int insert(Cltmch record);

    int insertSelective(Cltmch record);

    List<Cltmch> selectByExample(CltmchExample example);

    Cltmch selectByPrimaryKey(CltmchKey key);

    int updateByPrimaryKeySelective(Cltmch record);

    int updateByPrimaryKey(Cltmch record);
}