package com.gaoyang.loadparm.service;

import com.gaoyang.loadparm.entity.Bptpdcd;

public interface BptpdcdService {
	void add(Bptpdcd bptpdcd);
	void update(Bptpdcd bptpdcd);
	Bptpdcd find(String PRDT_CODE);
}
