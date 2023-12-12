package com.gaoyang.loadparm.service.serviceImpl;

import com.gaoyang.loadparm.entity.Citteam;
import com.gaoyang.loadparm.mapper.CitteamMapper;
import com.gaoyang.loadparm.service.CitteamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CitteamServiceImpl  implements CitteamService {
	@Autowired
	private CitteamMapper citteamMapper;
	@Override
	public void add(Citteam citteam) {
		citteamMapper.insertSelective(citteam);
	}
}
