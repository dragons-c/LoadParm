package com.gaoyang.loadparm.service;

import com.gaoyang.loadparm.entity.Bptgrp;
import com.gaoyang.loadparm.entity.Bptgrpl;
import com.gaoyang.loadparm.entity.BptgrplKey;

public interface BptgrpService {
	public void add(Bptgrp bptgrp);
	public void update(Bptgrp bptgrp);
    public Bptgrp selectByPrimaryKey(String ROLE_CD);
}
