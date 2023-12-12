package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.BpttltWithBLOBs;
import com.gaoyang.loadparm.mapper.BpttltMapper;
import com.gaoyang.loadparm.service.BpttltService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BpttltServiceImpl  implements BpttltService {
    @Autowired
	private BpttltMapper bpttltMapper;
	@Transactional(rollbackFor = Exception.class)
	public void add(BpttltWithBLOBs bpttltWithBLOBs) {
		bpttltMapper.insertSelective(bpttltWithBLOBs);
	}

    @Transactional(rollbackFor = Exception.class)
	public void update(BpttltWithBLOBs bpttltWithBLOBs) {
		bpttltMapper.updateByPrimaryKeyWithBLOBs(bpttltWithBLOBs);
	}

	@Override
	public BpttltWithBLOBs select(String TLR) {
		return bpttltMapper.selectByPrimaryKey(TLR);
	}
}
