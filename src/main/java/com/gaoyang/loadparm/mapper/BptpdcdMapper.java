package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Bptpdcd;
import com.gaoyang.loadparm.entity.BptpdcdExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BptpdcdMapper {
    int deleteByPrimaryKey(String PRDT_CODE);

    int insert(Bptpdcd record);

    int insertSelective(Bptpdcd record);

    List<Bptpdcd> selectByExample(BptpdcdExample example);

    Bptpdcd selectByPrimaryKey(String PRDT_CODE);

    int updateByPrimaryKeySelective(Bptpdcd record);

    int updateByPrimaryKey(Bptpdcd record);
}