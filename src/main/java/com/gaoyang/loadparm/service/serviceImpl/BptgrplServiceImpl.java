package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.Bptgrpl;
import com.gaoyang.loadparm.entity.BptgrplKey;
import com.gaoyang.loadparm.entity.Citoic;
import com.gaoyang.loadparm.mapper.BptgrplMapper;
import com.gaoyang.loadparm.mapper.CitoicMapper;
import com.gaoyang.loadparm.service.BptgrplService;
import com.gaoyang.loadparm.service.CitoicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BptgrplServiceImpl implements BptgrplService {
	@Autowired
	private BptgrplMapper bptgrplMapper;


	@Override
	public void add(Bptgrpl bptgrpl) {
		bptgrplMapper.insert(bptgrpl);
	}

	@Override
	public void update(Bptgrpl bptgrpl) {
		bptgrplMapper.updateByPrimaryKeySelective(bptgrpl);
	}

	@Override
	public Bptgrpl selectByPrimaryKey(BptgrplKey key) {
		return selectByPrimaryKey(key);
	}
}
