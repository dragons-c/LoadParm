package com.gaoyang.loadparm.service;

import com.gaoyang.loadparm.entity.Bptgrpl;
import com.gaoyang.loadparm.entity.BptgrplKey;
import com.gaoyang.loadparm.entity.BpttltWithBLOBs;

public interface BptgrplService {
	public void add(Bptgrpl bptgrpl);
	public void update(Bptgrpl bptgrpl);
    public Bptgrpl selectByPrimaryKey(BptgrplKey key);
}
