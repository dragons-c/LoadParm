package com.gaoyang.loadparm.service;

import com.gaoyang.loadparm.entity.Bpttlt;
import com.gaoyang.loadparm.entity.BpttltWithBLOBs;

public interface BpttltService {
	public void add(BpttltWithBLOBs bpttltWithBLOBs);
	public void update(BpttltWithBLOBs bpttltWithBLOBs);
    public BpttltWithBLOBs select(String TLR);
}
