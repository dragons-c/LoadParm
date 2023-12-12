package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Bptgrpl;
import com.gaoyang.loadparm.entity.BptgrplExample;
import com.gaoyang.loadparm.entity.BptgrplKey;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BptgrplMapper {
    int deleteByPrimaryKey(BptgrplKey key);

    int insert(Bptgrpl record);

    int insertSelective(Bptgrpl record);

    List<Bptgrpl> selectByExampleWithBLOBs(BptgrplExample example);

    List<Bptgrpl> selectByExample(BptgrplExample example);

    Bptgrpl selectByPrimaryKey(BptgrplKey key);

    int updateByPrimaryKeySelective(Bptgrpl record);

    int updateByPrimaryKeyWithBLOBs(Bptgrpl record);

    int updateByPrimaryKey(Bptgrpl record);
}