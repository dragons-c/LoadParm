package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Citteam;
import com.gaoyang.loadparm.entity.CitteamExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CitteamMapper {
    int deleteByPrimaryKey(String TEAM_NO);

    int insert(Citteam record);

    int insertSelective(Citteam record);

    List<Citteam> selectByExample(CitteamExample example);

    Citteam selectByPrimaryKey(String TEAM_NO);

    int updateByPrimaryKeySelective(Citteam record);

    int updateByPrimaryKey(Citteam record);
}