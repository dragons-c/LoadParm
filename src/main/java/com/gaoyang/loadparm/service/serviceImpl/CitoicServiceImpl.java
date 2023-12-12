package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.Citoic;
import com.gaoyang.loadparm.mapper.CitoicMapper;
import com.gaoyang.loadparm.service.CitoicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitoicServiceImpl  implements CitoicService {
	@Autowired
	private CitoicMapper citoicMapper;
	@Override
	public void add(Citoic citoic) {
		citoicMapper.insertSelective(citoic);
	}
}
