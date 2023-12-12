package com.gaoyang.loadparm.service;

import com.gaoyang.loadparm.entity.Bptparm;
import com.gaoyang.loadparm.entity.BptparmKey;

public interface BptparmService {
	void add(Bptparm bptparm);
    void update(Bptparm bptparm);
    Bptparm find(BptparmKey bptparmKey);
}
