package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Bptpdme;
import com.gaoyang.loadparm.entity.BptpdmeExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BptpdmeMapper {
    int deleteByPrimaryKey(String PRDT_CODE);

    int insert(Bptpdme record);

    int insertSelective(Bptpdme record);

    List<Bptpdme> selectByExample(BptpdmeExample example);

    Bptpdme selectByPrimaryKey(String PRDT_CODE);

    int updateByPrimaryKeySelective(Bptpdme record);

    int updateByPrimaryKey(Bptpdme record);
}