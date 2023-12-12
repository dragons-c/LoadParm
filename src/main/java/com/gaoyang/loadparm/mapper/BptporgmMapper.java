package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Bptporgm;
import com.gaoyang.loadparm.entity.BptporgmExample;
import com.gaoyang.loadparm.entity.BptporgmKey;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BptporgmMapper {
    int deleteByPrimaryKey(BptporgmKey key);

    int insert(Bptporgm record);

    int insertSelective(Bptporgm record);

    List<Bptporgm> selectByExample(BptporgmExample example);

    Bptporgm selectByPrimaryKey(BptporgmKey key);

    int updateByPrimaryKeySelective(Bptporgm record);

    int updateByPrimaryKey(Bptporgm record);
}