package com.gaoyang.loadparm.service;

import com.gaoyang.loadparm.entity.BpttltWithBLOBs;
import com.gaoyang.loadparm.entity.Cltmch;
import com.gaoyang.loadparm.entity.CltmchKey;

public interface CltmchService {
	public void add(Cltmch cltmch);
	public void update(Cltmch cltmch);
    public Cltmch select(CltmchKey cltmchKey);
}
