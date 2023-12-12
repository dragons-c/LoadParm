package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.Cltmch;
import com.gaoyang.loadparm.entity.CltmchKey;
import com.gaoyang.loadparm.mapper.CltmchMapper;
import com.gaoyang.loadparm.service.CltmchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CltmchServiceImpl implements CltmchService {
    @Autowired
    private CltmchMapper cltmchMapper;
    @Override
    public void add(Cltmch cltmch) {
        cltmchMapper.insert(cltmch);
    }

    @Override
    public void update(Cltmch cltmch) {
        cltmchMapper.updateByPrimaryKey(cltmch);
    }

    @Override
    public Cltmch select(CltmchKey cltmchKey) {
        return cltmchMapper.selectByPrimaryKey(cltmchKey);
    }
}
