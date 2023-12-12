package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.Bptporgm;
import com.gaoyang.loadparm.mapper.BptporgmMapper;
import com.gaoyang.loadparm.service.BptporgmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BptporgmServiceImpl implements BptporgmService {
	@Autowired
	private BptporgmMapper bptporgmMapper;

	@Override
	public void add(Bptporgm bptporgm) {
                 bptporgmMapper.insertSelective(bptporgm);
	}
}
