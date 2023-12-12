package com.gaoyang.loadparm.mapper;

import com.gaoyang.loadparm.entity.Bptgrp;
import com.gaoyang.loadparm.entity.BptgrpExample;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BptgrpMapper {
    int deleteByPrimaryKey(String ROLE_CD);

    int insert(Bptgrp record);

    int insertSelective(Bptgrp record);

    List<Bptgrp> selectByExample(BptgrpExample example);

    Bptgrp selectByPrimaryKey(String ROLE_CD);

    int updateByPrimaryKeySelective(Bptgrp record);

    int updateByPrimaryKey(Bptgrp record);
}