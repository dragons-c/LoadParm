package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Citoic;
import com.gaoyang.loadparm.entity.CitoicExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CitoicMapper {
    int deleteByPrimaryKey(String OIC_NO);

    int insert(Citoic record);

    int insertSelective(Citoic record);

    List<Citoic> selectByExample(CitoicExample example);

    Citoic selectByPrimaryKey(String OIC_NO);

    int updateByPrimaryKeySelective(Citoic record);

    int updateByPrimaryKey(Citoic record);
}