package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.Bptgrp;
import com.gaoyang.loadparm.entity.Bptgrpl;
import com.gaoyang.loadparm.entity.BptgrplKey;
import com.gaoyang.loadparm.mapper.BptgrpMapper;
import com.gaoyang.loadparm.mapper.BptgrplMapper;
import com.gaoyang.loadparm.service.BptgrpService;
import com.gaoyang.loadparm.service.BptgrplService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BptgrpServiceImpl implements BptgrpService {
	@Autowired
	private BptgrpMapper bptgrpMapper;


	@Override
	public void add(Bptgrp bptgrp) {
		bptgrpMapper.insert(bptgrp);
	}

	@Override
	public void update(Bptgrp bptgrp) {
         bptgrpMapper.updateByPrimaryKey(bptgrp);
	}

	@Override
	public Bptgrp selectByPrimaryKey(String ROLE_CD) {
		return bptgrpMapper.selectByPrimaryKey(ROLE_CD);
	}
}
