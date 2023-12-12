package com.gaoyang.loadparm.service;

import com.gaoyang.loadparm.entity.Bptpdme;

public interface BptpdmeService {
	void add(Bptpdme bptpdme);
	void update(Bptpdme bptpdme);
	Bptpdme find(String PRDT_CODE);
}
