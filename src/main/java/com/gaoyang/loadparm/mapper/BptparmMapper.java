package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Bptparm;
import com.gaoyang.loadparm.entity.BptparmExample;
import com.gaoyang.loadparm.entity.BptparmKey;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BptparmMapper {
    int deleteByPrimaryKey(BptparmKey key);

    int insert(Bptparm record);

    int insertSelective(Bptparm record);

    List<Bptparm> selectByExampleWithBLOBs(BptparmExample example);

    List<Bptparm> selectByExample(BptparmExample example);

    Bptparm selectByPrimaryKey(BptparmKey key);

    int updateByPrimaryKeySelective(Bptparm record);

    int updateByPrimaryKeyWithBLOBs(Bptparm record);

    int updateByPrimaryKey(Bptparm record);
}