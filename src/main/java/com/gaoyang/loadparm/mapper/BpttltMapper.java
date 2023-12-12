package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Bpttlt;
import com.gaoyang.loadparm.entity.BpttltExample;
import com.gaoyang.loadparm.entity.BpttltWithBLOBs;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BpttltMapper {
    int deleteByPrimaryKey(String TLR);

    int insert(BpttltWithBLOBs record);

    int insertSelective(BpttltWithBLOBs record);

    List<BpttltWithBLOBs> selectByExampleWithBLOBs(BpttltExample example);

    List<Bpttlt> selectByExample(BpttltExample example);

    BpttltWithBLOBs selectByPrimaryKey(String TLR);

    int updateByPrimaryKeySelective(BpttltWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(BpttltWithBLOBs record);

    int updateByPrimaryKey(Bpttlt record);
}