package com.gaoyang.loadparm.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
public class JspController {


	@RequestMapping(value={"/","/index"})
	public String index(Map<String,Object> model) {

		return "index";
	}
	@RequestMapping(value={"/excel"})
	public String excel(Map<String,Object> model) {

		return "excel";
	}
	@RequestMapping(value={"/bpttlt"})
	public String bpttlt(Map<String,Object> model) {

		return "bpttlt";
	}

	@RequestMapping(value={"/lnparm"})
	public String lnparm(Map<String,Object> model) {

		return "lnparm";
	}
	@RequestMapping(value={"/ddvmpard"})
	public String ddvmpard(Map<String,Object> model) {

		return "ddvmpard";
	}
	@RequestMapping(value={"/ddvrate"})
	public String ddvrate(Map<String,Object> model) {

		return "ddvrate";
	}
	@RequestMapping(value={"/tdcprdp"})
	public String tdcprdp(Map<String,Object> model) {

		return "tdcprdp";
	}
	@RequestMapping(value={"/ilparm"})
	public String ilparm(Map<String,Object> model) {

		return "ilparm";
	}

	@RequestMapping(value={"/publicCode"})
	public String publicCode(Map<String,Object> model) {

		return "publicCode";
	}
	@RequestMapping(value={"/oicTable"})
	public String oicTable(Map<String,Object> model) {

		return "oicTable";
	}
	@RequestMapping(value={"/cityCode"})
	public String cityCode(Map<String,Object> model) {

		return "cityCode";
	}
	@RequestMapping(value={"/cltmch"})
	public String cltmch(Map<String,Object> model) {

		return "cltmch";
	}
}
