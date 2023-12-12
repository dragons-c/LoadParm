package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.Bptpdme;
import com.gaoyang.loadparm.entity.BptpdmeExample;
import com.gaoyang.loadparm.mapper.BptpdmeMapper;
import com.gaoyang.loadparm.service.BptpdmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BptpdmeServiceImpl  implements BptpdmeService {
    @Autowired
	private BptpdmeMapper bptpdmeMapper;
	@Override
	public void add(Bptpdme bptpdme) {
		bptpdmeMapper.insertSelective(bptpdme);
	}

	@Override
	public void update(Bptpdme bptpdme) {
		bptpdmeMapper.updateByPrimaryKeySelective(bptpdme);
	}

	@Override
	public Bptpdme find(String PRDT_CODE) {
		return bptpdmeMapper.selectByPrimaryKey(PRDT_CODE);
	}
}
