package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.Bptparm;
import com.gaoyang.loadparm.entity.BptparmKey;
import com.gaoyang.loadparm.entity.Bptporgm;
import com.gaoyang.loadparm.mapper.BptparmMapper;
import com.gaoyang.loadparm.service.BptparmService;
import com.gaoyang.loadparm.service.BptporgmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BptparmServiceImpl  implements BptparmService {
	@Autowired
	private BptparmMapper bptparmMapper;


	@Override
	public void add(Bptparm bptparm) {
		bptparmMapper.insertSelective(bptparm);
	}

	@Override
	public void update(Bptparm bptparm) {
         bptparmMapper.updateByPrimaryKeySelective(bptparm);
	}

	@Override
	public Bptparm find(BptparmKey bptparmKey) {

		return bptparmMapper.selectByPrimaryKey(bptparmKey);
	}
}
