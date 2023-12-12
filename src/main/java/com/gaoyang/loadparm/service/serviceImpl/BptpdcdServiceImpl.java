package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.Bptpdcd;
import com.gaoyang.loadparm.entity.BptpdcdExample;
import com.gaoyang.loadparm.mapper.BptpdcdMapper;
import com.gaoyang.loadparm.service.BptpdcdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BptpdcdServiceImpl  implements BptpdcdService {
	@Autowired
	BptpdcdMapper bptpdcdMapper;
	@Override
	public void add(Bptpdcd bptpdcd) {
        bptpdcdMapper.insertSelective(bptpdcd);
	}

	@Override
	public void update(Bptpdcd bptpdcd) {
		bptpdcdMapper.updateByPrimaryKeySelective(bptpdcd);
	}

	@Override
	public Bptpdcd find(String PRDT_CODE) {
		return bptpdcdMapper.selectByPrimaryKey(PRDT_CODE);
	}
}
